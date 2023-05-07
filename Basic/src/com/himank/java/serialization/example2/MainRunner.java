package com.himank.java.serialization.example2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainRunner {

    public static void main(String[] args) throws Exception{
        Account account = new Account("Himank", "Google");

        FileOutputStream fileOutputStream = new FileOutputStream("abc.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(account);

        System.out.println("************* Serialization Done *********************8");

        FileInputStream fileInputStream = new FileInputStream("abc.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Account account1 = (Account) objectInputStream.readObject();

        System.out.println(account1);
    }
}
