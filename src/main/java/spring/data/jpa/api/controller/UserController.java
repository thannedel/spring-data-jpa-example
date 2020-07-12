package spring.data.jpa.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.data.jpa.api.model.User;
import spring.data.jpa.api.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/getUsers")
    public List<User> getAllUsers(){
        return service.getUsers();
    }
    @GetMapping("getUsersByProfession/{profession}")
    public List<User> getUserByProfession(@PathVariable String profession){
        return service.getUsersByProfession(profession);
    }


}
