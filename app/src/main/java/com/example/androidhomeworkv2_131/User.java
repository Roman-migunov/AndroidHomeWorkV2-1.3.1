package com.example.androidhomeworkv2_131;

import android.widget.CheckBox;
import android.widget.EditText;

public class User {
    private EditText editTextName, editTextAge, editTextStep, editTextWeight, editTextDate, editTextHighPressure, editTextLowPressure, editTextPulse;
    private CheckBox checkBox;

    public User(EditText editTextName, EditText editTextAge, EditText editTextStep, EditText editTextWeight, EditText editTextDate, EditText editTextHighPressure, EditText editTextLowPressure, EditText editTextPulse, CheckBox checkBox) {
        this.editTextName = editTextName;
        this.editTextAge = editTextAge;
        this.editTextStep = editTextStep;
        this.editTextWeight = editTextWeight;
        this.editTextDate = editTextDate;
        this.editTextHighPressure = editTextHighPressure;
        this.editTextLowPressure = editTextLowPressure;
        this.editTextPulse = editTextPulse;
        this.checkBox = checkBox;
    }

    public EditText getEditTextName() {
        return editTextName;
    }

    public void setEditTextName(EditText editTextName) {
        this.editTextName = editTextName;
    }

    public EditText getEditTextAge() {
        return editTextAge;
    }

    public void setEditTextAge(EditText editTextAge) {
        this.editTextAge = editTextAge;
    }

    public EditText getEditTextStep() {
        return editTextStep;
    }

    public void setEditTextStep(EditText editTextStep) {
        this.editTextStep = editTextStep;
    }

    public EditText getEditTextWeight() {
        return editTextWeight;
    }

    public void setEditTextWeight(EditText editTextWeight) {
        this.editTextWeight = editTextWeight;
    }

    public EditText getEditTextDate() {
        return editTextDate;
    }

    public void setEditTextDate(EditText editTextDate) {
        this.editTextDate = editTextDate;
    }

    public EditText getEditTextHighPressure() {
        return editTextHighPressure;
    }

    public void setEditTextHighPressure(EditText editTextHighPressure) {
        this.editTextHighPressure = editTextHighPressure;
    }

    public EditText getEditTextLowPressure() {
        return editTextLowPressure;
    }

    public void setEditTextLowPressure(EditText editTextLowPressure) {
        this.editTextLowPressure = editTextLowPressure;
    }

    public EditText getEditTextPulse() {
        return editTextPulse;
    }

    public void setEditTextPulse(EditText editTextPulse) {
        this.editTextPulse = editTextPulse;
    }

    public CheckBox getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(CheckBox checkBox) {
        this.checkBox = checkBox;
    }
}
