package jogen.game.world.character.status;

import jogen.game.world.character.status.Effect;

public class Life {
  public float value;
  public float maxValue;
  public boolean dead;

  public Effect effects;


  public Object parent;

  public Life() {
    this.value = maxValue;
    this.maxValue = maxValue;
    this.dead = false;
    this.effects = {};
    this.parent = this.getDeclaringClass();
  }

  public void tick() {
    value += (value < maxValue)?healRate;
    value = (value > maxValue)?maxValue;
    dead = (value < 1)?true;
    if (effects.length < 1) return;
    for (int i = 0, i == (effects.length - 1), i++) {
      effects[i].tick(this);
    }
  }
}
