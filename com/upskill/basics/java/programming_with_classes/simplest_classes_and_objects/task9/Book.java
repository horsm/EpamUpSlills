package com.upskill.basics.java.programming_with_classes.simplest_classes_and_objects.task9;

public class Book {
    private static int startId = 0;
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublishing;
    private int numberOfPages;
    private float price;
    private String bindingType;

    Book(String title, String author, String publisher, int yearOfPublishing, int numberOfPages, float price, String bindingType) {
        this.id = ++startId;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return String.format("id %03d: \"%s\", %s, %s, %d год, %d страниц, $%.2f, переплет: %s.",
                id, title, author, publisher, yearOfPublishing, numberOfPages,
                price, bindingType);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }
}
