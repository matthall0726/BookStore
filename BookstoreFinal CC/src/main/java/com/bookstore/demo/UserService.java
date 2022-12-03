package com.bookstore.demo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public User createUser(User user) {
        // Save the user and return it
        return userRepository.save(user);
    }
  
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
  
    public User updateUser(String username, User user) {

        User existingUser = userRepository.findByUsername(username);

        existingUser.setPassword(user.getPassword());
        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());
        existingUser.setHomeAddress(user.getHomeAddress());

        return userRepository.save(existingUser);
      }

    public User getUser(String userId) {
        // Retrieve the user with the given ID
        return userRepository.findById(userId).orElse(null);
    }
  
    public void deleteUser(String userId) {
        // Delete the user with the given ID
        userRepository.deleteById(userId);
    }

    public CreditCard createCreditCard(String username, CreditCard creditCard) {
        User user = userRepository.findByUsername(username);
        user.getCreditCards().add(creditCard);
        userRepository.save(user);
        return creditCard;
    }
    
}
