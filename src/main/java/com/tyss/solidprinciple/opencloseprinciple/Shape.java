package com.tyss.solidprinciple.opencloseprinciple;

public interface Shape {

    public Double calculateArea();
}

class Rectangle implements Shape {

    double length;
    double width;

    public Double calculateArea() {

        return length * width;
    }
}

class Circle implements Shape {

    public Double radius;

    public Double calculateArea() {

        return (22 / 7) * radius * radius;
    }
}
