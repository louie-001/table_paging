# 使用Bootstrap4 + Vue2实现分页查询
----
**写在前面**
&emsp;工程为前后端分离设计，使用Nginx为前端资源服务器，同时实现后台服务的反向代理。后台为Java Web工程，使用Tomcat部署服务。
> * 前端框架：Bootstrap4，Vue.js2
>* 后台框架：spring boot，spring data JPA
>* 开发工具：IntelliJ IDEA，Maven

实现效果：
![paging table.png-95.9kB][1]

*如何使用Bootstrap+Vue来实现动态table，数据的新增删除等操作，请查看[使用Bootstrap + Vue.js实现表格的动态展示、新增和删除](http://www.jianshu.com/p/de17fde94bb3)*。交代完毕，本文主题开始。

## 一、使用Bootstrap搭建表格
* 表格区
```
    <div class="row">
            <table class="table table-hover table-striped table-bordered table-sm">
                <thead class="">
                <tr>
                    <th><input type="checkbox"></th>
                    <th>序号</th>
                    <th>会员号</th>
                    <th>姓名</th>
                    <th>手机号</th>
                    <th>办公电话</th>
                    <th>邮箱地址</th>
                    <th>状态</th>
                </tr>
                </thead>
                <tbody>
                <tr v-for="(user,index) in userList">
                    <td><input type="checkbox" :value="index" v-model="checkedRows"></td>
                    <td>{{pageNow*10 + index+1}}</td>
                    <td>{{user.id}}</td>
                    <td>{{user.username}}</td>
                    <td>{{user.mobile}}</td>
                    <td>{{user.officetel}}</td>
                    <td>{{user.email}}</td>
                    <td v-if="user.disenable == 0">正常</td>
                    <td v-else>注销</td>
                </tr>
                </tbody>
            </table>
        </div>
```

* 分页区
```
    <div class="row mx-auto">
            <ul class="nav justify-content-center pagination-sm">
                <li class="page-item">
                    <a href="#" class="page-link"><i class="fa fa-fast-backward" @click="switchToPage(0)">&nbsp;</i></a>
                </li>
                <li class="page-item">
                    <a href="#" class="page-link"><i class="fa fa-backward" @click="switchToPage(pageNow-1)"></i></a>
                </li>
                <li class="page-item" v-for="n in totalPages" :class="{active:n==pageNow+1}">
                    <a href="#" @click="switchToPage(n-1)" class="page-link">{{n}}</a>
                </li>
                <li class="page-item">
                    <a href="#" class="page-link"><i class="fa fa-forward" @click="switchToPage(pageNow+1)"></i></a>
                </li>
                <li class="page-item">
                    <a href="#" class="page-link"><i class="fa fa-fast-forward" @click="switchToPage(totalPages-1)"></i></a>
                </li>
            </ul>
        </div>
```
## 二、初始化Vue对象及数据
* 创建Vue对象
```
var vueApp = new Vue({
        el:"#vueApp",
        data:{
            userList:[],
            perPage:10,
            pageNow:0,
            totalPages:0,
            checkedRows:[]
        },
        methods:{
            switchToPage:function (pageNo) {
                if (pageNo < 0 || pageNo >= this.totalPages){
                    return false;
                }
                getUserByPage(pageNo);
            }
        }
    });
```

* 初始化数据
```
function getUserByPage(pageNow) {
        $.ajax({
            url:"/user/"+pageNow,
            success:function (datas) {
                vueApp.userList = datas.content;
                vueApp.totalPages = datas.totalPages;
                vueApp.pageNow = pageNow;
            },
            error:function (res) {
                console.log(res);
            }
        });
    }
```

完整js代码：
```
<script>
    var vueApp = new Vue({
        el:"#vueApp",
        data:{
            userList:[],
            perPage:10,
            pageNow:0,
            totalPages:0,
            checkedRows:[]
        },
        methods:{
            switchToPage:function (pageNo) {
                if (pageNo < 0 || pageNo >= this.totalPages){
                    return false;
                }
                getUserByPage(pageNo);
            }
        }
    });

    getUserByPage(0);

    function getUserByPage(pageNow) {
        $.ajax({
            url:"/user/"+pageNow,
            success:function (datas) {
                vueApp.userList = datas.content;
                vueApp.totalPages = datas.totalPages;
                vueApp.pageNow = pageNow;
            },
            error:function (res) {
                console.log(res);
            }
        });
    }
</script>
```
## 三、使用JPA实现分页查询
* controller接收请求
```
/**
 * 用户相关请求控制器
 * @author louie
 * @date 2017-12-19
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 分页获取用户
     * @param pageNow 当前页码
     * @return 分页用户数据
     */
    @RequestMapping("/{pageNow}")
    public Page<User> findByPage(@PathVariable Integer pageNow){
        return userService.findUserPaging(pageNow);
    }
}
```
* JPA分页查询
```
@Service
public class UserServiceImpl implements UserService {

    @Value("${self.louie.per-page}")
    private Integer perPage;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Page<User> findUserPaging(Integer pageNow) {
        Pageable pageable = new PageRequest(pageNow,perPage,Sort.Direction.DESC,"id");
        return userRepository.findAll(pageable);
    }
}
```

----


  [1]: http://static.zybuluo.com/louie-001/dz0xxhkznh87kitx8uo7ktla/paging%20table.png