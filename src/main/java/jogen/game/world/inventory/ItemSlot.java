package jogen.game.world.inventory;

import jogen.game.world.Item;

public class ItemSlot {
  public Item containsType;
  public Item[] contains;

  public int items;
  public float mass;

  public int maxItems;
  public float maxMass;

  public boolean useBlackList;
  public boolean useWhitelist;
  public Item[] blacklist;
  public Item[] whitelist;

  public ItemSlot() {
    containsType = null;
    contains = {};
    items = 0;
    mass = 0;
    maxItems = -1;
    maxMass = -1.0;
    useBlackList = false;
    useWhitelist = false;
  }

  public void updateCounts() {
    this.items = contains.length;
    private float m = 0.0;
    m = (containsType != null)?containsType.madeOf.getDensity() * containsType.volume * this.items;
    this.mass = m;
  }

  public int getCount() {
    updateCounts();
    return items;
  }
  public float getMass() {
    updateCounts();
    return mass;
  }
}
