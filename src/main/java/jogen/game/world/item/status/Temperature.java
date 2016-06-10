package jogen.game.world.item.status;

public class Temperature {
  public float value;

  public Temperature() {
    this.value = 22.0;
  }

  public void increase(float a) {
    this.value += a;
  }
  public void decrease(float b) {
    this.value -= b;
  }
}
