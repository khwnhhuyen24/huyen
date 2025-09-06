package com.example.demovmmv2.ui.user;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.demovmmv2.R;
import com.example.demovmmv2.data.model.UserModel;

import java.util.List;


public class UserFragment extends Fragment {

   private UserViewModel userViewModel;
   private UserAdapter userAdapter;
   private RecyclerView rcvUser;

    private View view;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_user, container, false);
        return view;


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        userViewModel = new ViewModelProvider(this).get(UserViewModel.class);
        userViewModel.loadUsers();

        initView();
        initEvent();
    }

    public void initEvent(){

        userViewModel.getUsers().observe(requireActivity(), new Observer<List<UserModel>>() {
            @Override
            public void onChanged(List<UserModel> userModels) {
                userAdapter.submitList(userModels);
            }
        });
    }

    public void initView(){
        userAdapter = new UserAdapter();
        rcvUser = view.findViewById(R.id.rv_user);
        rcvUser.setLayoutManager(new LinearLayoutManager(requireActivity()));
        rcvUser.setAdapter(userAdapter);
    }
}