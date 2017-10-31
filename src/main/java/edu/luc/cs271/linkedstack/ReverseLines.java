package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {

    final Scanner input = new Scanner(System.in);
    printReverse(input);
  }

  private static void printReverse(final Scanner input) {
    // TODO recursively read and print successive input lines until EOF, then print them out in reverse order
  }


    /*
    // TODO read successive input lines until EOF, then print out in reverse order
    LinkedStack<String> reverser = new LinkedStack<String>();

    while (input.hasNextLine()) {
      final String line = input.nextLine();
      reverser.push(line);
    }
    while (!reverser.isEmpty()) {
      System.out.println(reverser.pop());
    }
  } */
}