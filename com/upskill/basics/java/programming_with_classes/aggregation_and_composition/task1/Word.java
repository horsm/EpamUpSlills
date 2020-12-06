package com.upskill.basics.java.programming_with_classes.aggregation_and_composition.task1;

public class Word {
    private String word;

    Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word;
    }
}
