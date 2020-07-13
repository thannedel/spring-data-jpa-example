package spring.data.jpa.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.data.jpa.api.dao.UserRepository;
import spring.data.jpa.api.model.User;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    /*@PostConstruct
    public void initDB() {
        List<User> users = new ArrayList<>();
        users.add(new User(111, "x", "IT", 23));
        users.add(new User(675, "y", "IT", 24));
        users.add(new User(432, "z", "CIVIL", 26));
        users.add(new User(88, "p", "IT", 23));
        users.add(new User(765, "q", "GOVT", 20));
        repository.save(users);
    }*/

    public List<User> getUsers(){
        return repository.findAll();
    }

    public List<User> getUsersByProfession(String profession){
        return repository.findByProfession(profession);
    }

    public long countByAge(int age){
        return repository.countByAge(age);
    }

    public int deleteUser(String name) {
        return repository.deleteByName(name);
    }
}
