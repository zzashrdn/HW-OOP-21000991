package com.example.mathcompetencysurvey;

public class School {
    // attributes
    private String name;

    private com.example.mathcompetencysurvey.Address address;

    private String principal;
    private com.example.mathcompetencysurvey.Marks marks;

    // setter and getter
    // setter for name
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(com.example.mathcompetencysurvey.Address address) {
        this.address = address;
    }

    public String getName( ) {
        return name;
    }

    public com.example.mathcompetencysurvey.Address getAddress() {
        return address;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public void setNumParticipants(int num) {
        marks = new com.example.mathcompetencysurvey.Marks(num);
    }
}