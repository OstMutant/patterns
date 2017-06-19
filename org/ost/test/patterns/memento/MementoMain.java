package org.ost.test.patterns.memento;

public class MementoMain {

  public static void execute() {
    System.out.println("Memento Start!");
    Caretaker caretaker = new Caretaker();

    Originator originator = new Originator();
    originator.set("State1");
    originator.set("State2");
    caretaker.addMemento(originator.saveToMemento());
    originator.set("State3");
    caretaker.addMemento(originator.saveToMemento());
    originator.set("State4");

    originator.restoreFromMemento(caretaker.getMemento(1));
    System.out.println("Memento End!");
  }

  public static void main(String... args) {
    execute();
  }
}
