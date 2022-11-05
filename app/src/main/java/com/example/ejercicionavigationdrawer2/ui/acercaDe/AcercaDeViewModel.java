package com.example.ejercicionavigationdrawer2.ui.acercaDe;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AcercaDeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AcercaDeViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
