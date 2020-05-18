package com.example.androidhomeworkv2_131.ui.pressureRecording;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PressureRecordingViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PressureRecordingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}