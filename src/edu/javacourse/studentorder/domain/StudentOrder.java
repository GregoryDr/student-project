package edu.javacourse.studentorder.domain;

public class StudentOrder {
    private String HFirstName;
    private String HLastName;
    private String WFirstName;
    private String WLastName;

    public String getHFirstName() {
        return HFirstName;
    }

    public void setHFirstName(String HFirstName) {
        this.HFirstName = HFirstName;
    }

    public String getHLastName() {
        return HLastName;
    }

    public void setHLastName(String HLastName) {
        this.HLastName = HLastName;
    }

    public String getWFirstName() {
        return WFirstName;
    }

    public void setWFirstName(String WFirstName) {
        this.WFirstName = WFirstName;
    }

    public String getWLastName() {
        return WLastName;
    }

    public void setWLastName(String WLastName) {
        this.WLastName = WLastName;
    }
}
