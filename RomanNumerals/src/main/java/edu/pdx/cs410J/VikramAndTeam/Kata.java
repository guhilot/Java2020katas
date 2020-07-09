package edu.pdx.cs410J.VikramAndTeam;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {


  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }

  public static String romanNumeralFor(int i) {
    int iCount = 0; //1
    int vCount = 0; //5
    int xCount = 0; //10
    int lCount = 0; //50
    int cCount = 0; //100
    int dCount = 0; //500
    int mCount = 0; //thousand
    String output = "";

    if ((i / 1000) > 0) {
      mCount = (int) (i / 1000);
      for (int j = 0; j < mCount; ++j) {
        output = output.concat("M");
      }
      i = i % 1000;
    }
    if ((i / 500) > 0) {
      dCount = (int) (i / 500);
      for (int j = 0; j < dCount; ++j) {
        output = output.concat("D");
      }
      i = i % 500;
    }
    if ((i / 100) > 0) {
      cCount = (int) (i / 100);
      for (int j = 0; j < cCount; ++j) {
        output = output.concat("C");
      }
      i = i % 100;
    }
    if ((i / 50) > 0) {
      lCount = (int) (i / 50);
      for (int j = 0; j < lCount; ++j) {
        output = output.concat("L");
      }
      i = i % 50;
    }
    if ((i / 10) > 0) {
      xCount = (int) (i / 10);
      for (int j = 0; j < xCount; ++j) {
        output = output.concat("X");
      }
      i = i % 10;
    }
    if ((i + 1) % 5 == 0) {
      output = output.concat("I");
      output = output.concat("V");
    } else {
      if ((i / 5) > 0) {
        vCount = (int) (i / 5);
        for (int j = 0; j < vCount; ++j) {
          output = output.concat("V");
        }
        i = i % 5;
      }
      for (int j = 0; j < i; ++j) {
        output = output.concat("I");
      }
    }
    return output;
  }

    /*
    if (i == 1) {
      return "I";
    } else if (i == 5) {
      return "V";
    } else if (i == 10){
      return "X";
    }else if (i == 50){
      return "L";
    }else if (i == 100){
      return "C";
    }else if (i == 500){
      return "D";
    }else{
      return "M";
    }
  }
  */

}