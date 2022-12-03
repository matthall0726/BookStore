package com.bookstore.demo;

import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class CreditCardService {

    @Autowired
    private final CreditCardRepository repository;
    private final UserRepository userRepository;
    
    public CreditCard createCard(String username, CreditCard card) {
        User user = userRepository.findByUsername(username);
        if (user == null) {
          return null;
        }
        card.setUserId(user.getId());
        return repository.save(card);
      }

    public List<CreditCard> findCardsByUsername(String username) {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            return Collections.emptyList();
        }
        return repository.findAllByUserId(user.getId());
    }
}
