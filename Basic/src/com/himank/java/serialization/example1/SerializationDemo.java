package com.himank.java.serialization.example1;

import java.io.*;

public class SerializationDemo {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(20000, "Black");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Demo");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(vehicle1);

            FileInputStream fileInputStream = new FileInputStream("Demo");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Vehicle vehicle2 = (Vehicle) objectInputStream.readObject();

            System.out.println(vehicle2.price + "   " + vehicle2.color);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
