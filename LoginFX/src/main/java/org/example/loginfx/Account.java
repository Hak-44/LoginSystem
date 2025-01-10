package org.example.loginfx;

public class Account {

    private String username;
    private String password;
    private short id;   // short is used here since ids tend to be long numbers
    private byte type;

    // simple constructor, used as a foundation.
    /* Type in this case is whether the account is an admin account or not (the number that is next to type when
    creating the user)

        0 == admin
        1 == regular

     */
    public Account(String username, String password, short id, byte type) {
        this.username = username;
        this.password = password;
        this.id = id;
        this.type = type;
    }

    // getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public short getID() {
        return id;
    }

    public String getType() {
        if(type == 0){
            return "Admin";
        }else{
            return "User";
        }
    }

}
