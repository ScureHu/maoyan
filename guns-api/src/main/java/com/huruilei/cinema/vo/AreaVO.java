package com.huruilei.cinema.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class AreaVO implements Serializable {

    private String areaId;
    private String areaName;
    private boolean isActive;

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
