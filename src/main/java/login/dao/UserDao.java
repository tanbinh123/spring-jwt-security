package login.dao;

import login.model.UserData;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;

/**
 * Created by vijay on 28/9/17.
 */
@Transactional
public interface UserDao extends CrudRepository<UserData,Long>{
    UserData findByUsername(String userName);
}
