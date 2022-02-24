package com.example.home_work_view25;

import java.io.Serializable;

public class Country implements Serializable {
    private String continents;
    private int image;
    private Integer keyId;

    public String getContinents() {
        return continents;
    }

    public void setContinents(String continents) {
        this.continents = continents;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Integer getKeyId() {
        return keyId;
    }

    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }

    public Country(String continents, int image, Integer keyId) {
        this.continents = continents;
        this.image = image;
        this.keyId = keyId;
    }

    public Country(String continents, int image) {
        this.continents = continents;
        this.image = image;
    }
}
