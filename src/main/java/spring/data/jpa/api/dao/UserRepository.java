package spring.data.jpa.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.data.jpa.api.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    public List<User> findByProfession(String profession);

    public long countByAge(int age);

    // multi condition
    public List<User> findByProfessionAndAge(String profession, int age);
}
