package edu.spbstu.b;

public class StringSpliterTest {
  public static void main(String [] args) {
    try {
      StringSpliter spliter = new StringSpliter("abcbcasatlolkek");
      spliter.go();
      System.out.println(spliter);
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
};
