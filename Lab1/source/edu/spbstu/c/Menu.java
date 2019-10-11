package edu.spbstu.c;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Menu {
  private Catalog bookCatalog;

  private enum Commands {
    SEARCH_BY_ID,
    SEARCH_BY_AUTHOR,
    SEARCH_BY_TITLE,
    SEARCH_BY_YEAR,
    EXIT
  };

  public Menu(List<Book> list) {
    if (list == null) {
      throw new NullPointerException("Null pointer");
    }

    bookCatalog = new Catalog(list);
  }

  public void setBookList(List<Book> bookList) {
    if (bookList == null) {
      throw new NullPointerException("Null book list");
    }

    bookCatalog.setBookList(bookList);
  }

  private void printRules() {
    System.out.println("0 - SEARCH_BY_ID");
    System.out.println("1 - SEARCH_BY_AUTHOR");
    System.out.println("2 - SEARCH_BY_TITLE");
    System.out.println("3 - SEARCH_BY_YEAR");
    System.out.println("4 - EXIT");
  }

  public void go() {
    boolean working = true;
    int index = 0;
    String request;
    Book book = null;
    while (working) {
      printRules();
      index = Integer.parseInt(readFromConsol());

      switch (Commands.values()[index]) {

        case SEARCH_BY_ID:
          inputInvite();
          request = readFromConsol();
          Integer id = Integer.parseInt(request);
          book = bookCatalog.getBookById(id);
          System.out.println("\nOutput: " + book);
          break;
        case SEARCH_BY_AUTHOR:
          inputInvite();
          request = readFromConsol();
          book = bookCatalog.getBookByAuthor(request);
          System.out.println("\nOutput: " + book);
          break;
        case SEARCH_BY_TITLE:
          inputInvite();
          request = readFromConsol();
          book = bookCatalog.getBookByTitle(request);
          System.out.println("\nOutput: " + book);
          break;
        case SEARCH_BY_YEAR:
          inputInvite();
          request = readFromConsol();
          int year = Integer.parseInt(request);
          book = bookCatalog.getBookByYear(year);
          System.out.println("\nOutput: " + book);
          break;
        case EXIT:
          working = false;
          break;
        default:
          System.err.println("Bad command");
      }
       System.out.println("");
    }
  }

  private String readFromConsol() {
    String request = "";
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      request = reader.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return request;
  }

  private void inputInvite() {
    System.out.print("Vvedite zapros: ");
  }

};
