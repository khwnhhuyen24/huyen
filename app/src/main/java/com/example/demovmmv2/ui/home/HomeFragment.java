package com.example.demovmmv2.ui.home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.demovmmv2.R;


public class HomeFragment extends Fragment {
    private View view;
    private HomeViewModel homeViewModel;
    private ImageButton decrease;
    private ImageButton increase;
    private TextView txtquantity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_home, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        super.onCreate(savedInstanceState);
       homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);

       initView(view);
       initEvent();
    }


    public void initView(View view){
            decrease = view.findViewById(R.id.decrease);
            increase = view.findViewById(R.id.increase);
            txtquantity = view.findViewById(R.id.txtQuantity);
    }

    public void initEvent(){
        homeViewModel.getQuantity().observe(requireActivity(), quantity ->{
            txtquantity.setText(String.valueOf(quantity));

            // Xử lý tăng/giảm
            increase.setOnClickListener(v -> homeViewModel.increase());
            decrease.setOnClickListener(v -> homeViewModel.decrease());

        });
    }
}