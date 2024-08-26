package com.example.application.template;

import com.example.application.db.entitiy.Profile;
import com.example.application.db.entitiy.Role;

public enum DbTmp {;
    public Profile getPersonFromDb(){
        return Profile.builder()
                .id(1)
                .login("admin")
                .password("123123")
                .role(Role.ADMIN)
                .firstName("Константин")
                .secondName("Кулагин")
                .thirdName("Владимирович")
                .build();
    }
}
