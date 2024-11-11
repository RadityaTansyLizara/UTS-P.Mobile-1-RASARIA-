package com.example.rasaria;

public class FavoritItem {
    private int imageResId;
    private String name;

    public FavoritItem(int imageResId, String name) {
        this.imageResId = imageResId;
        this.name = name;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getName() {
        return name;
    }
}
