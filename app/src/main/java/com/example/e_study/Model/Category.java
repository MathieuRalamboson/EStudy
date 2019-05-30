package com.example.e_study.Model;

public class Category {
    private String Name;
    private String Image;
    private String Url;

    public Category() {
    }

    public Category(String name, String image, String url) {
        Name = name;
        Image = image;
        Url = url;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
