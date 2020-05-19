package com.example.androidhomeworkv2_131.ui.vitals;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VitalsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public VitalsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}