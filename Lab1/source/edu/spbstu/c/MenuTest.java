package edu.spbstu.c;

import java.util.*;

public class MenuTest {
  public static void main(String [] args) {
    List<Book> books = new ArrayList<Book>();

    Book book = new Book(0, "Andrey Kurpatov", "Chertogy Razuma", 2014);
    books.add(book);

    Menu menu = new Menu(books);
    menu.go();
  }
};
