package com.example.demovmmv2.ui.user;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.demovmmv2.data.model.UserModel;
import com.example.demovmmv2.data.repository.UserRepository;

import java.util.List;

public class UserViewModel extends ViewModel {

    private UserRepository userRepository;
    private MutableLiveData<List<UserModel>> allUsers;

    public UserViewModel(){
        userRepository  = new UserRepository();
        allUsers = new MutableLiveData<>();
    }

    public void loadUsers(){
        List<UserModel> users = userRepository.getUsers();
        allUsers.setValue(users);
    }

    public LiveData<List<UserModel>> getUsers() {
        return allUsers;
    }

}
