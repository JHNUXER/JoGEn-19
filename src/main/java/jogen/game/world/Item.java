package jogen.game.world;

import jogen.game.world.item.data.*;
import jogen.game.world.item.status.*;

public class Item {
  public String name;
  public ItemID id;
  public float volume;
  public Composition madeOf;
  public RenderClass render;
  public boolean pocketable;      // wheteher or not you can "take" the item.

  public Temperature temp;

  public Item(String name, ItemID id, float volume, Composition madeOf, RenderClass render) {
    this.name = name;
    this.id = id;
    this.volume = volume;
    this.madeOf = madeOf;
    this.render = render;
    this.temp = new Temperature();
    this.pocketable = true;

    this.temp = World.ROOM_TEMP;
  }
  public Item(String name, ItemID id, float volume, Composition madeOf, RenderClass render, boolean pocketable) {
    this.name = name;
    this.id = id;
    this.volume = volume;
    this.madeOf = madeOf;
    this.render = render;
    this.temp = new Temperature();
    this.pocketable = pocketable;

    this.temp = World.ROOM_TEMP;
  }

  public void compareTo(Item a) {
    return this.id.compare(a.id);
  }
  public void compare(Item a, Item b) {
    return ItemID.compare(a.id, b.id);
  }

  public void swing();
  public void use();

  public void tick();
}
