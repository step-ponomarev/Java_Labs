package edu.spbstu.c;

import java.util.List;
import java.util.ArrayList;

public class Catalog {
  private List<Book> bookList;

  public Catalog(Book book) {
    if (book == null) {
      throw new NullPointerException("Null booklist");
    }

    bookList = new ArrayList<>();
    bookList.add(book);
  }

  public Catalog(List<Book> bookList) {
    if (bookList == null) {
      throw new NullPointerException("Null booklist");
    }

    this.bookList = bookList;
  }

  public void setBookList(List<Book> bookList) {
    if (bookList == null) {
      throw new NullPointerException("Null book list");
    }

    this.bookList = bookList;
  }

  public Book getBookById(Integer id) {
    Book book = null;
    Book handledBook;
    for (int i = 0; i < bookList.size(); ++i) {
      handledBook = bookList.get(i);
      if (id.equals(handledBook.getId())) {
        book = bookList.get(i);
        break;
      }
    }

    return book;
  }

  public Book getBookByAuthor(String author) {
    if (author == null) {
      throw new NullPointerException("Null author");
    }

    author = author.trim();

    Book book = null;
    Book handledBook;
    for (int i = 0; i < bookList.size(); ++i) {
      handledBook = bookList.get(i);
      if (author.equals(handledBook.getAuthor())) {
        book = bookList.get(i);
        break;
      }
    }

    return book;
  }

  public Book getBookByTitle(String title) {
    if (title == null) {
      throw new NullPointerException("Null title");
    }

    title = title.trim();

    Book book = null;
    Book handledBook;
    for (int i = 0; i < bookList.size(); ++i) {
      handledBook = bookList.get(i);
      if (title.equals(handledBook.getTitle())) {
        book = bookList.get(i);
        break;
      }
    }

    return book;
  }

  public Book getBookByYear(int year) {
    Book book = null;
    Book handledBook;
    for (int i = 0; i < bookList.size(); ++i) {
      handledBook = bookList.get(i);
      if (year == handledBook.getYear()) {
        book = bookList.get(i);
        break;
      }
    }

    return book;
  }
};
