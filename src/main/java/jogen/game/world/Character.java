package jogen.game.world;

import jogen.game.world.character.data.*;
import jogen.game.world.character.status.*;

public class Character {
  public Name name;
  public int age;
  public Gender gender;

  public Life life;
  public Stamina stamina;
  public Hunger hunger;
  public Thirst thirst;

  public Character(String[] name, int age, Gender gender) {
    if (name.length > 3) {
      private String mn = "";
      for (int i = 1, i == (name.length - 2), i++) {
        mn = mn + name[i];
      }
      name[1] = mn;
    }
    this.name = new Name(name[0], name[1], name[2]);
    this.age = age;
    this.gender = gender;
    this.life = new Life(100.0);
  }
}
