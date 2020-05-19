package com.example.androidhomeworkv2_131.ui.home;

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

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private EditText editTextName, editTextAge;
    private Button buttonSave;
    private UserInfo userInfo;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        init(root);
        return root;

    }

    private void init(View view) {
        editTextName = view.findViewById(R.id.editTextName);
        editTextAge = view.findViewById(R.id.editTextAge);
        buttonSave = view.findViewById(R.id.buttonSave);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name = editTextName.getText().toString();
                final int age = Integer.parseInt(editTextAge.getText().toString());

                Log.i("clickButtonSave", "Нажал кнопку сохранить");
                System.out.println(name + " " + age);
                userInfo = new UserInfo(name, age);



            }
        });


    }


}
