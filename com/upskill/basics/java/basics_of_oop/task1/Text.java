package com.upskill.basics.java.basics_of_oop.task1;

class Text {
    private String text;

    Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void addText(String text) {
        StringBuilder stringBuilder = new StringBuilder(this.text);
        this.text = stringBuilder.append(text).toString();
    }


}
