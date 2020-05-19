package com.example.androidhomeworkv2_131.ui.vitals;

public class UserVitals {
    private int step;
    private double weight;

    public UserVitals(int step, double weight) {
        this.step = step;
        this.weight = weight;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
