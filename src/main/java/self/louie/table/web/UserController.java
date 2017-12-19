package self.louie.table.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import self.louie.table.bean.User;
import self.louie.table.service.UserService;

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
     * @param pageNow
     * @return
     */
    @RequestMapping("/{pageNow}")
    public Page<User> findByPage(@PathVariable Integer pageNow){
        return userService.findUserPaging(pageNow);
    }

}
