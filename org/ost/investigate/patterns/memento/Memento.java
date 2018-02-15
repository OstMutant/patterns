package org.ost.investigate.patterns.memento;

public class Memento {
  private final String state;

  public Memento(String stateToSave) {
    state = stateToSave;
  }

  public String getSavedState() {
    return state;
  }
}
