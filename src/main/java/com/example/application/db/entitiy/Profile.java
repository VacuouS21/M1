package com.example.application.db.entitiy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Profile {
    long id;
    String login;
    String firstName;
    String secondName;
    String thirdName;
    String password;
    Role role;
}
