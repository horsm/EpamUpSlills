package com.upskill.basics.java.basics_of_oop.task5.builder;

import com.upskill.basics.java.basics_of_oop.task5.entity.Present;

public abstract class PresentBuilder {
    Present present;

    void createPresent() {
        present = new Present();
    }

    abstract void buildName();
    abstract void buildPrice();
    abstract void buildWrap();
    abstract void buildProducts();

    Present getPresent() {
        return present;
    }
}
