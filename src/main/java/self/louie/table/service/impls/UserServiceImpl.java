package self.louie.table.service.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import self.louie.table.bean.User;
import self.louie.table.dao.UserRepository;
import self.louie.table.service.UserService;

import java.util.List;

/**
 * 用户服务接口实现类
 * @author louie
 * @date 2017-12-19
 */
@Service
public class UserServiceImpl implements UserService {

    @Value("${self.louie.per-page}")
    private Integer perPage;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Long getTotalPage() {
        return userRepository.count();
    }

    @Override
    public Page<User> findUserPaging(Integer pageNow) {
        Pageable pageable = new PageRequest(pageNow,perPage,Sort.Direction.DESC,"id");
        return userRepository.findAll(pageable);
    }
}
