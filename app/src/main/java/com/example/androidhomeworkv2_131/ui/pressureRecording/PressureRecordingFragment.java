package com.example.androidhomeworkv2_131.ui.pressureRecording;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.androidhomeworkv2_131.R;

public class PressureRecordingFragment extends Fragment {

    private PressureRecordingViewModel pressureRecordingViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        pressureRecordingViewModel =
                ViewModelProviders.of(this).get(PressureRecordingViewModel.class);
        View root = inflater.inflate(R.layout.fragment_pressure_recording, container, false);
        //final TextView textView = root.findViewById(R.id.text_dashboard);
        pressureRecordingViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
        //        textView.setText(s);
            }
        });
        return root;
    }
}
