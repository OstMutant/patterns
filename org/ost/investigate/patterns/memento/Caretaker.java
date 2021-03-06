package org.ost.investigate.patterns.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
  List<Memento> savedStates = new ArrayList<Memento>();

  public void addMemento(Memento m) {
    savedStates.add(m);
  }

  public Memento getMemento(int index) {
    return savedStates.get(index);
  }
}
