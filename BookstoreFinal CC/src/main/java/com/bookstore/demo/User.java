package com.bookstore.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private String id;
    private String username;
    private String password;
    private String name;
    private String email;
    private String homeAddress;

    private List<CreditCard> creditCards = new ArrayList<>();

    public List<CreditCard> getCreditCards() {
        return creditCards;
    }

}
