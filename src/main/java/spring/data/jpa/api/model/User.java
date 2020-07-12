package spring.data.jpa.api.model;


import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class User {
    @Id
    private int id;
    private String name;
    private String profession;
    private int age;

    public User() {
    }

    public User(int id, String name, String profession, int age) {
        this.id = id;
        this.name = name;
        this.profession = profession;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                ", age=" + age +
                '}';
    }
}
