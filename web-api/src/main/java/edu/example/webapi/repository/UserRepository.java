package edu.example.webapi.repository;

import edu.example.webapi.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user) {
        System.out.println((user.getId()==null) ? "SAVE" : "UPDATE" + " - Recebendo o usuário na camada repositório");
        System.out.println(user);
    }

    public void update(User user){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(user);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<User> listAll(){
        List<User> users = new ArrayList<>();
        users.add(new User("michael","plaintext", 1));
        users.add(new User("kevin","plaintext", 2));
        return users;
    }
    public User findById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new User("Michael","plaintext");
    }

    public User findByUsername(String username) {
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuário", username));
        return new User(username, "plaintext");
    }
}
