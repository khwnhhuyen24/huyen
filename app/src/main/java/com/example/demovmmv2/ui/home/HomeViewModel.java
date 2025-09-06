package com.example.demovmmv2.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<Integer> quantity = new MutableLiveData<>(0);

    public LiveData<Integer> getQuantity() {
        return quantity;
    }

    public void increase() {
        Integer current = quantity.getValue();
        if (current == null) current = 0;
        quantity.setValue(current + 1);
    }

    public void decrease() {
        Integer current = quantity.getValue();
        if (current == null) current = 0;
        if (current > 0) {
            quantity.setValue(current - 1);
        }

    }
}
