package com.example.ocularapp.ui.exanoconvencionales;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class examenesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public examenesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}