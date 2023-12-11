package com.ruslanrustemov.paket1;

import com.ruslanrustemov.paket2.IPassword;

public class User implements IPassword {
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void passwordLogin() {
        if (password != null && !password.isEmpty()) {
            System.out.println("Password Successful");
        } else {
            System.out.println("Error: Password is missing.");
        }
    }
}
