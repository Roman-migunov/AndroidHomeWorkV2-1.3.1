package com.example.androidhomeworkv2_131.ui.pressureRecording;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.androidhomeworkv2_131.R;

import java.time.LocalDate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class PressureRecordingFragment extends Fragment {

    private PressureRecordingViewModel pressureRecordingViewModel;
    private EditText editTextDate, editTextHighPressure, editTextLowPressure, editTextPulse;
    private CheckBox checkBox;
    private Button buttonSave;
    private UserCardiovascularIndicators userCI;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        pressureRecordingViewModel =
                ViewModelProviders.of(this).get(PressureRecordingViewModel.class);
        View root = inflater.inflate(R.layout.fragment_pressure_recording, container, false);
        init(root);
        return root;
    }

    private void init(View view) {
        editTextDate = view.findViewById(R.id.editTextDate);
        editTextHighPressure = view.findViewById(R.id.editTextHighPressure);
        editTextLowPressure = view.findViewById(R.id.editTextLowPressure);
        editTextPulse = view.findViewById(R.id.editTextPulse);
        checkBox = view.findViewById(R.id.checkBox);
        buttonSave = view.findViewById(R.id.buttonSave);

        // Текущее время
        Date currentDate = new Date();
        // Форматирование времени как "день.месяц.год"
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        final String dateText = dateFormat.format(currentDate);
        editTextDate.setText(dateText);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String date = editTextDate.getText().toString();
                final int highPressure = Integer.parseInt(editTextHighPressure.getText().toString());
                final int lowPressure = Integer.parseInt(editTextLowPressure.getText().toString());
                final int pulse = Integer.parseInt(editTextPulse.getText().toString());
                final boolean tah = checkBox.isSelected();

                Log.i("clickSaveFragment2", "Нажал кнопку сохранить во 2 фрагменте");
                System.out.println(date + " " + highPressure + " " + lowPressure + " " + pulse + " " + tah);
                userCI = new UserCardiovascularIndicators(date, highPressure, lowPressure, pulse, tah);
            }
        });


    }
}
