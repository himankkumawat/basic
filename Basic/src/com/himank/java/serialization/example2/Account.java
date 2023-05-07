package com.himank.java.serialization.example2;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {

    String userName;
    String password;

    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws Exception {
        objectOutputStream.defaultWriteObject();
        String ePassword = "12345" + this.password;
        objectOutputStream.writeObject(ePassword);
    }

    private void readObject(ObjectInputStream objectInputStream) throws Exception {
        objectInputStream.defaultReadObject();
        String ePassword = (String) objectInputStream.readObject();
        this.password = ePassword.substring(5);
    }

    @Override
    public String toString() {
        return "Account{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
