package com.vertex.generics;


public class CarGenerator implements Generator<Car> {
    @Override
    public Car next() {
        return new Car();
    } //!!!!!
}
