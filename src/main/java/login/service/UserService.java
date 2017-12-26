package login.service;

import login.dao.UserDao;
import login.model.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by vijay on 28/9/17.
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public String loginUser(UserData userDataApp) {
        userDao.save(userDataApp);
        return "Username " + userDataApp.getUsername() + " : with password --";
    }

    public List<UserData> fetchAllUsers() {
        return (List<UserData>) userDao.findAll();
    }

}
