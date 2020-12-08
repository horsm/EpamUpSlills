package com.upskill.basics.java.basics_of_oop.task1;

class TextFile extends File {

    private final Text content;

    TextFile(Directory directory, String fileName) {
        super(directory, fileName);
        content = new Text("");
        super.getDirectory().addFile(this);
    }

    public void addText(String line) {
        content.addText(line);
    }

    public void printContent() {
        System.out.println(content.getText());
    }

    @Override
    public void changeName(String fileName) {
        this.setFileName(fileName);
    }
}