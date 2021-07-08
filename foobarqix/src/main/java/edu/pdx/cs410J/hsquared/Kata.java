package edu.pdx.cs410J.hsquared;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
  public static String compute(String x) {
    int i = Integer.parseInt(x);
    String result = "";
    Boolean d3 = false;
    Boolean d5 = false;
    Boolean d7 = false;

    if (i % 3 == 0) {
      result += "Foo";
      d3 = true;
    }
    if (i % 5 == 0) {
      result += "Bar";
      d5 = true;
    }
    if (i % 7 == 0) {
      result += "Qix";
      d7 = true;
    }
    if (!d3 && !d5 && !d7) {
      result = x;
    }

    return result;
  }

  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("Missing command line arguments");
      System.exit(1);
    }
    String input = args[0];
    String result = compute(input);
    System.out.println(result);
    System.exit(0);
  }
}