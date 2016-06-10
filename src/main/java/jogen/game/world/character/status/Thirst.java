package jogen.game.world.character.status;

public class Thirst {
  public float value;
  public float maxValue;

  public Thirst() {
    this.value = 0.0;
    this.maxValue = 0.0;
  }
  public Thirst(float maxValue) {
    this.value = 0.0
    this.maxValue = maxValue;
  }

  public void decrease() {
    this.value--;
  }
  public void decrease(float v) {
    this.value -= v;
  }
  public void increase() {
    this.value+-;
  }
  public void increase(float v) {
    this.value += v;
  }
}
