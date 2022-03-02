package com.example.lotterymvvm;

import androidx.annotation.Nullable;

public class Model {

    @Nullable
    String username, password;

    // Constructor
    public Model(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter and setter methods for username
    @Nullable
    public String getUsername() {
        return username;
    }

    public void setUsername(@Nullable String username) {
        this.username = username;
    }

    // Getter and setter methods for password
    @Nullable
    public String getPassword() {
        return password;
    }

    public void setPassword(@Nullable String password) {
        this.password = password;
    }

}
