package spring.data.jpa.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("getUserCount/{age}")
    public String getCountByAge(@PathVariable int age){
        long count = service.countByAge(age);
        return "total no of records " +count;
    }

    @DeleteMapping("/delete/{id}")
    public void  deleteUser(@PathVariable int id) {
        service.deleteUser(id);
    }

    @PutMapping("/update/{name}")
    public void updateUser(@RequestBody User user, @PathVariable String name){
        service.updateUser(name,user);
    }

}
