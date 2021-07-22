package edu.pdx.cs410J.room4;

import java.util.Stack;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();

    for (String arg : args) {
      try {
        int argInt = Integer.parseInt(arg);
        stack.push(argInt);
      } catch (Exception e) {
        if (!arg.matches("\\+|\\-|\\*")) {
          System.err.println("Unexpected operator");
          System.exit(1);
        }
        // now my arg is a operator
      }
      System.out.println("My arg is: " + arg);
    }
    System.exit(1);
  }
}