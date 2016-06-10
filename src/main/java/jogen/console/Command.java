package jogen.console;

public abstract class Command {
  public String name;
  
  public void function(String args);
}
