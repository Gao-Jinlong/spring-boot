package site.ginlon.QuickStart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import site.ginlon.QuickStart.pojo.User;

@Repository // spring bean 数据访问层
public interface UserRepository extends CrudRepository<User, Integer> {

}
