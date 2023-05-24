/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Book {

    private String name;
    private int pages, year;

    public Book(String bookName, int totalPages, int pubYear) {
        this.name = bookName;
        this.pages = totalPages;
        this.year = pubYear;
    }

    public String getName() {
        return this.name;
    }

    public int getPages() {
        return this.pages;
    }

    public int getYear() {
        return this.year;
    }

    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.year;
    }
}
