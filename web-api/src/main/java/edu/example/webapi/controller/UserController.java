package edu.example.webapi.controller;

import edu.example.webapi.model.User;
import edu.example.webapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepo;

    @GetMapping()
    public List<User> getUsers() {
        return userRepo.listAll();
    }

    @GetMapping("/{username}")
    public User getOne(@PathVariable("username") String username) {
        return userRepo.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        userRepo.remove(id);
        System.out.println("Usuário " + id + " deletado");
    }

    @PostMapping()
    public void postUser(@RequestBody User user) {
        userRepo.save(user);
    }
}
