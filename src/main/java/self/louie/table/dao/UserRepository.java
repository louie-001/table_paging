package self.louie.table.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import self.louie.table.bean.User;

/**
 * 用户数据仓库
 *
 * @author louie
 * @date 2017-12-19
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
