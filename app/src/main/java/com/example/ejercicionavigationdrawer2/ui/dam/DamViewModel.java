package com.example.ejercicionavigationdrawer2.ui.dam;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DamViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DamViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}