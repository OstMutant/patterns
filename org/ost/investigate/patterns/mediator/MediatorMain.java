package org.ost.investigate.patterns.mediator;

public class MediatorMain {
  public static void main(String[] args) {
    User robert = new User("Robert");
    User john = new User("John");

    robert.sendMessage("Hi! John!");
    john.sendMessage("Hello! Robert!");
    robert.sendMessage("Goodbye! John!");
  }
}
