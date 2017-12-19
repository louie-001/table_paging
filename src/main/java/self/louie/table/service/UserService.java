package self.louie.table.service;

import org.springframework.data.domain.Page;
import self.louie.table.bean.User;

import java.util.List;

/**
 * 用户相关业务服务类
 *
 * @author louie
 * @date 2017-12-19
 */
public interface UserService {

    /**
     * 获取总页数
     * @return
     */
    public Long getTotalPage();

    /**
     * 分页获取用户
     * @param pageNow
     * @return
     */
    public Page<User> findUserPaging(Integer pageNow);
}
