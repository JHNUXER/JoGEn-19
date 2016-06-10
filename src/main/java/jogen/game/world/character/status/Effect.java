package jogen.game.world.character.status;

public class Effect {
  public String name;
  public Object character;

  public Effect(String name) {
    this.name = name;
  }
  public Effect(String name, Object character) {
    this.name = name;
    this.character = character;
  }

  public void tick(Object character);
  public void tick() {
    try {
      tick(this.character);
    }
    catch (Exception e) {
      e.printStackTrace();
      System.exit();          // Make sure you put a character in the constructor if not
                              // as a tick() argument to avoid this error!
    }
  }
}
