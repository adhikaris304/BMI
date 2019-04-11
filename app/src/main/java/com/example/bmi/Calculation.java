package com.example.bmi;

public class Calculation {
    public float height, weight;

    public Calculation(float height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float arithmetic() {
        return (this.weight/((this.height/100)*(this.height/100)));
    }
}
