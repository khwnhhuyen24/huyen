package com.example.demovmmv2.data.repository;

import com.example.demovmmv2.data.model.UserModel;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public List<UserModel> getUsers(){
        List<UserModel> users = new ArrayList<>();
        users.add(new UserModel("Huy", "huy@gmail.com"));
        users.add(new UserModel("Huy1", "huy1@gmail.com"));
        users.add(new UserModel("Huy2", "huy2@gmail.com"));
        users.add(new UserModel("Huy3", "huy3@gmail.com"));
        users.add(new UserModel("Huy4", "huy4@gmail.com"));
        users.add(new UserModel("Huy5", "huy5@gmail.com"));
        users.add(new UserModel("Huy6", "huy5@gmail.com"));
        users.add(new UserModel("Huy7", "huy5@gmail.com"));
        users.add(new UserModel("Huy8", "huy5@gmail.com"));
        users.add(new UserModel("Huy9", "huy5@gmail.com"));
        users.add(new UserModel("Huy11", "huy5@gmail.com"));
        users.add(new UserModel("Huy12", "huy5@gmail.com"));
        users.add(new UserModel("Huy21", "huy5@gmail.com"));
        users.add(new UserModel("Huy22", "huy5@gmail.com"));
        users.add(new UserModel("Huy23", "huy5@gmail.com"));
        users.add(new UserModel("Huy44", "huy5@gmail.com"));
        users.add(new UserModel("Huy45", "huy5@gmail.com"));
        users.add(new UserModel("Huy54", "huy5@gmail.com"));
        users.add(new UserModel("Huy52", "huy5@gmail.com"));

        return users;
    }
}
