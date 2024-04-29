package com.example.demo.operations;

public class Rectangle {

   private final int length;
   private final int breadth;

    public Rectangle(int length, int breadth) {
        if(length <= 0 || breadth <= 0){
            throw new IllegalArgumentException();
        }

        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }
}
