package com.upskill.basics.java.basics_of_oop.task5.builder;

import com.upskill.basics.java.basics_of_oop.task5.entity.Present;

public class PresentDirector {
    PresentBuilder presentBuilder;

    public void setPresentBuilder(PresentBuilder presentBuilder) {
        this.presentBuilder = presentBuilder;
    }

    public Present buildPresent() {
        presentBuilder.createPresent();
        presentBuilder.buildName();
        presentBuilder.buildPrice();
        presentBuilder.buildWrap();
        presentBuilder.buildProducts();
        return presentBuilder.getPresent();
    }

    public PresentBuilder getPresentBuilder() {
        return presentBuilder;
    }
}
