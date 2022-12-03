package com.bookstore.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    @Autowired
    private final UserRepository repository;
  
    @PostMapping
    public User createUser(@RequestBody User user) {
      return repository.save(user);
      //repository.insert(user); ????
    }

    @GetMapping("/{username}")
    public User findByUsername(@PathVariable String username) {
      return repository.findByUsername(username);
    }

    @GetMapping
    public List<User> getAllUsers() {
      return repository.findAll();
    }
  
    @PatchMapping("/{username}")
    public User updateUser(@PathVariable("username") String username, @RequestBody User user) {
      User existingUser = repository.findByUsername(username);
      if (existingUser == null) {
        return null;
      }
      if (user.getUsername() != null) {
        existingUser.setUsername(user.getUsername());
      }
      if (user.getPassword() != null) {
        existingUser.setPassword(user.getPassword());
      }
      if (user.getName() != null) {
        existingUser.setName(user.getName());
      }
      if (user.getEmail() != null) {
        existingUser.setEmail(user.getEmail());
      }
      if (user.getHomeAddress() != null) {
        existingUser.setHomeAddress(user.getHomeAddress());
      }

      return repository.save(existingUser);
    }
  
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
      repository.deleteById(id);
    }

}
