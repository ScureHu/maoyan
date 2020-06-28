package com.huruilei.cinema.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class BrandVO implements Serializable {

    private String brandId;
    private String brandName;
    private boolean isActive;

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
