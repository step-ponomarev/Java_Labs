package edu.spbstu.c;

import java.util.*;

public class Book implements Comparable<Book> {
  private Integer id;
  private String author;
  private String title;
  private int year;

  public Book(int id, String author, String title, int year) {
    if (author == null || title == null) {
      throw new NullPointerException("Nullpointer");
    }

    this.id = id;
    this.author = author.trim();
    this.title = title.trim();
    this.year = year;
  }

  public Integer getId() {
    return this.id;
  }

  public String getAuthor() {
    return this.author;
  }

  public String getTitle() {
    return this.title;
  }

  public int getYear() {
    return this.year;
  }

  @Override
  public String toString() {
    String str = id + " : " + author + " - " + title + " " + year;

    return str;
  }

  @Override
  public int compareTo(Book book) {
    return id.compareTo(book.getId());
  }
};

class BookTest {
  public static void main(String [] args) {
    Book book = new Book(0, "Ivan Sechenov", "Refleksy Golovnogo Mozga", 1829);
    System.out.println(book);
  }
}
