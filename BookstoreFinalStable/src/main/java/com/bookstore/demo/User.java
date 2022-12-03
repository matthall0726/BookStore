package com.bookstore.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
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
    @Singular
    private List<CreditCard> cards;

    @Data
    @Builder
    public static class CreditCard {
        private String cardNumber;
        private String expiration;
        private String cvv;
        
    }


}
