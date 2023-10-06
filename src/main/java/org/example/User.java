package org.example;

public class User {
    String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "User - " + userName;
=======
        return "User: " + userName;

>>>>>>> 59390ff1a560fbc83c70c0003baa3ab51165ceb2
    }
}


