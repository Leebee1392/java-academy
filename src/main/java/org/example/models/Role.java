package org.example.models;

import java.util.Date;

public class Role {
    int id;
    String roleName;
    String location;
    String capability;
    String band;
    String closingDate;
    String status;

    public Role(int id, String roleName, String location, String capability, String band, String closingDate, String status) {
        this.id = id;
        this.roleName = roleName;
        this.location = location;
        this.capability = capability;
        this.band = band;
        this.closingDate = closingDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getCapability() {
        return capability;
    }

    public void setCapability(String capability) {
        this.capability = capability;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
