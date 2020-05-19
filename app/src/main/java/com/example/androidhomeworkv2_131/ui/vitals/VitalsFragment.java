package com.example.androidhomeworkv2_131.ui.vitals;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.androidhomeworkv2_131.R;

public class VitalsFragment extends Fragment {

    private VitalsViewModel vitalsViewModel;
    private EditText editTextStep, editTextWeight;
    private Button buttonSave;
    private UserVitals userVitals;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        vitalsViewModel =
                ViewModelProviders.of(this).get(VitalsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_vitals, container, false);
        init(root);

        return root;
    }

    private void init(View view) {
        editTextStep = view.findViewById(R.id.editTextStep);
        editTextWeight = view.findViewById(R.id.editTextWeight);
        buttonSave = view.findViewById(R.id.buttonSave);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int step = Integer.parseInt(editTextStep.getText().toString());
                final double weight = Double.parseDouble(editTextWeight.getText().toString());

                Log.i("clickSaveFragment3", "Нажал кнопку сохранить во 3 фрагменте");
                System.out.println(step + " " + weight);
                userVitals = new UserVitals(step, weight);
            }
        });


    }
}
