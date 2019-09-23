package edu.spbstu.a;

public class Matrix {
  private int rows;
  private int colns;
  private int [][] matrix;

  public Matrix(int rows, int colns) throws Exception {
    if (rows == 0 || colns == 0) {
      throw new Exception("Bad matrix");
    }

    this.rows = rows;
    this.colns = colns;

    matrix =  new int[rows][colns];
  }

  public void setUp() {
    int value = 0;
    for (int i = 0; i < rows; ++i) {
      for (int j = 0; j < colns; ++j) {
        if (j == 0) {
          matrix[i][j] = 1;
        } else {
          matrix[i][j] = 0;
        }
      }
    }
  }

  @Override
  public String toString() {
    return getMatrixOutput();
  }

  private String getMatrixOutput() {
    String info = "  ";
    for (int j = 0; j < colns; ++j) {
      info += j + " ";
    }
    info += "\n";

    for (int i = 0; i < this.rows; ++i) {
      info += i + " ";
      for (int j = 0; j < this.colns; ++j) {
        info += matrix[i][j] + " ";
        if (j == this.colns - 1) {
          info += "\n";
        }
      }
    }
    return info;
  }
};

class MatrixTest {
  public static void main(String [] args) {
    try {
      Matrix matrix = new Matrix(5, 5);
      matrix.setUp();
      System.out.println(matrix);
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
