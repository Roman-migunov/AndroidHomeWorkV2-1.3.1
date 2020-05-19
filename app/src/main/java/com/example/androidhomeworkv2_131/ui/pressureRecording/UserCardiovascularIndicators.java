package com.example.androidhomeworkv2_131.ui.pressureRecording;

import java.time.LocalDate;

public class UserCardiovascularIndicators {
    private String editTextDate;
    private int editTextHighPressure, editTextLowPressure, editTextPulse;
    private boolean checkBox;

    public UserCardiovascularIndicators(String editTextDate, int editTextHighPressure, int editTextLowPressure, int editTextPulse, boolean checkBox) {
        this.editTextDate = editTextDate;
        this.editTextHighPressure = editTextHighPressure;
        this.editTextLowPressure = editTextLowPressure;
        this.editTextPulse = editTextPulse;
        this.checkBox = checkBox;
    }

    public int getEditTextHighPressure() {
        return editTextHighPressure;
    }

    public void setEditTextHighPressure(int editTextHighPressure) {
        this.editTextHighPressure = editTextHighPressure;
    }

    public int getEditTextLowPressure() {
        return editTextLowPressure;
    }

    public void setEditTextLowPressure(int editTextLowPressure) {
        this.editTextLowPressure = editTextLowPressure;
    }

    public int getEditTextPulse() {
        return editTextPulse;
    }

    public void setEditTextPulse(int editTextPulse) {
        this.editTextPulse = editTextPulse;
    }

    public String getEditTextDate() {
        return editTextDate;
    }

    public void setEditTextDate(String editTextDate) {
        this.editTextDate = editTextDate;
    }

    public boolean isCheckBox() {
        return checkBox;
    }

    public void setCheckBox(boolean checkBox) {
        this.checkBox = checkBox;
    }
}
