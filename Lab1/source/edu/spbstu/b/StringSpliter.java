package edu.spbstu.b;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class StringSpliter {
  private List<String> splitedArrayOfString = new ArrayList<>();
  private String str;

  public StringSpliter(String str) throws Exception {
    int lenghtOfString = str.length();
    if ((lenghtOfString % 3) != 0) {
      throw new Exception("Very bad string");
    }

    this.str = str;
  };

  public void go() {
    splitString();
    changeMiddleElement();
    Collections.sort(splitedArrayOfString);
  }

  private void splitString() {
    int lenghtOfString = str.length();

    String pieceOfString = new String();
    for (int i = 0; i < lenghtOfString; ++i) {
      pieceOfString += str.charAt(i);

      if (((i + 1) % 3) == 0) {
        splitedArrayOfString.add(pieceOfString);
        pieceOfString = new String();
      }
    }
  }

  private void changeMiddleElement() {
    String newElement = new String();
    String element = new String();

    int size = splitedArrayOfString.size();
    List<String> newSplitedArrayOfString = new ArrayList<>(size);

    for (int i = 0; i < splitedArrayOfString.size(); ++i) {
      element = splitedArrayOfString.get(i);
      char randomSymbol = getRandomSymbol();

      newElement += element.charAt(0);
      newElement += getRandomSymbol();
      newElement += element.charAt(2);

      newSplitedArrayOfString.add(newElement);
      newElement = new String();
    }

    splitedArrayOfString = newSplitedArrayOfString;
  }

  private char getRandomSymbol() {
    char randomSymbol = (char) (33 + Math.random() * 94);

    return randomSymbol;
  }

  @Override
  public String toString() {
    return splitedArrayOfString.toString();
  }
};
