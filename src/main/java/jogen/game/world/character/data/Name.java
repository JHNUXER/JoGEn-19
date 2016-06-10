package jogen.game.world.character.data;

public class Name {
  public String first;
  public String middle;
  public String last;

  public Name(String first) {
    this.first = first;
    this.middle = "";
    this.last = "";
  }
  public Name(String first, String last) {
    this.first = first;
    this.middle = "";
    this.last = last;
  }
  public Name(String first, String middle, String last) {
    this.first = first;
    this.middle = middle;
    this.last = last;
  }
}
