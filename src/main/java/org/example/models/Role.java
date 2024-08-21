package org.example.models;

public class Role {
    private int id;
    private String roleName;
    private String location;
    private String capability;
    private String band;
    private String closingDate;
    private String status;

    public Role(
            final int id,
                final String roleName,
                final String location,
                final String capability,
                final String band,
                final String closingDate,
                final String status
    ) {
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

    public void setId(final int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(final String roleName) {
        this.roleName = roleName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(final String location) {
        this.location = location;
    }

    public String getCapability() {
        return capability;
    }

    public void setCapability(final String capability) {
        this.capability = capability;
    }

    public String getBand() {
        return band;
    }

    public void setBand(final String band) {
        this.band = band;
    }

    public String getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(final String closingDate) {
        this.closingDate = closingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }
}
