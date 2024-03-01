package com.example.demo.Model;

public class ConversionResult {
    private double eurValue;
    private String message;

    public ConversionResult(double eurValue, String message) {
        this.eurValue = eurValue;
        this.message = message;
    }

    public double getEurValue() {
        return eurValue;
    }

    public void setEurValue(double eurValue) {
        this.eurValue = eurValue;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
