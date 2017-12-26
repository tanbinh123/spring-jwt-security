package login.controller;

import login.model.UserData;
import login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by vijay on 28/9/17.
 */
@RestController
public class UserController {

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    UserService userService;

    public UserController(BCryptPasswordEncoder bCryptPasswordEncoder){
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @RequestMapping("/")
    public String welcome(){
        return "Welcome message";
    }

    @RequestMapping("/users/sign-up")
    public String signup(@RequestBody UserData userData){
        userData.setPassword(bCryptPasswordEncoder.encode(userData.getPassword()));
        String message = userService.loginUser(userData);
        return message + userData.getPassword();
    }

    @RequestMapping("/login")
    public String login(@RequestBody UserData userData){
        String message = "Hello from the other side -- " + userData.getUsername();
        return message;
    }

    @RequestMapping("/allUsers")
    public List<UserData> fetchUsers(){
        return userService.fetchAllUsers();
    }

    @RequestMapping("/getlost")
    public String logout(){
        return "Logged out successfully";
    }

   /*
    @RequestMapping("/create")
    public String create(@RequestParam String userName, @RequestParam String password){
        String message = "";
        try{
            message = loginDetailsService.create(userName,password);
        } catch (Exception e){
        }
        return message;
    }

    @RequestMapping("/updatePassword")
    public String updatePassword(@RequestParam String userName,@RequestParam String password){
        String message = "";
        try{
            message = loginDetailsService.updatePassword(userName,password);
        } catch (Exception e){

        }
        return message;
    }

    @RequestMapping("/getLoginDetails")
    public List<UserData> allDetails(){
        List<UserData> loginDetails = null;
        try{
            loginDetails = loginDetailsService.allDetails();
        } catch (Exception e){

        }
        return loginDetails;
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam String userName){
        String message = "";
        try{
            message = loginDetailsService.delete(userName);
        } catch (Exception e){

        }
        return message;
    }*/
}
