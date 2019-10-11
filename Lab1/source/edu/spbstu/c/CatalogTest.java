package edu.spbstu.c;

public class CatalogTest {
  public static void main(String [] args) {
    int id = 0;
    String author = "Andrey Kurpatov";
    String title = "Krasnaya Tabletkla";
    int year = 2015;

    Book book = new Book(id, author, title, year);
    Catalog catalog = new Catalog(book);

    System.out.println(catalog.getBookById(0));
    System.out.println(catalog.getBookByAuthor("Andrey Kurpatov"));
    System.out.println(catalog.getBookByTitle("Krasnaya Tabletkla"));
    System.out.println(catalog.getBookByYear(2015));
  }
};
