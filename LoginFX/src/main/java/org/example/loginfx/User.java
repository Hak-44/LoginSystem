package org.example.loginfx;

public class User extends Account{

    private String name;

    String bio;
    String prototypes;


    // Constructor for the account, which is only
    User(String username, String name, String password, short id, byte type, String image) {
        super(username, password, id, type, image);
        this.name = name;

    }

    // if the user that is creating the account, would like to add a bio before completion, then they can
    User(String username, String name, String password, short id, byte type, String bio, String image) {
        super(username, password, id, type, image);
        this.name = name;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }

    public String getPrototypes() {
        return prototypes;
    }

}
