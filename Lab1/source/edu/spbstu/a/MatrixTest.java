package edu.spbstu.a;

public class MatrixTest {
  public static void main(String [] args) {
    try {
      Matrix matrix = new Matrix(5, 5);
      matrix.setUp();
      System.out.println(matrix);
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
};
