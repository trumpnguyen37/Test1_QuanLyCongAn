package com.example.singerapp;

public class StaticRvModel {
    private int image;
    private String text;

    public StaticRvModel(int image, String text) {
        this.image = image;
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public String getText() {
        return text;
    }
}
