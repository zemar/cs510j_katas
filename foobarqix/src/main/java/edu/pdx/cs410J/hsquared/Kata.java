package edu.pdx.cs410J.hsquared;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
  public static String compute(String x) {
    String result = "";
    result = x;

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