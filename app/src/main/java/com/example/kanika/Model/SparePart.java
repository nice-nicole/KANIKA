package com.example.kanika.Model;

import com.google.firebase.database.Exclude;

public class SparePart {
    private String name;
    private String imageURL;
    private String key;
    private String description;
    private int position;

    public SparePart() {
    }

    public SparePart(int position) {
        this.position = position;
    }

    public SparePart(String name, String imageUrl, String Des) {
        if(name.trim().equals("")){
            name="No Name";
        }
        this.name= name;
        this.imageURL= imageUrl;
        this.description = Des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Exclude
    public String getKey(){
        return key;
    }

    @Exclude
    public void setKey(String key){
        this.key=key;
    }
}
