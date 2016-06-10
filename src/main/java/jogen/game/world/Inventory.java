package jogen.game.world;

import jogen.game.world.inventory.ItemSlot;

public class Inventory {
  public String name;
  public ItemSlot[] slots;

  public boolean useBlackList;
  public boolean useWhitelist;

  public Item[] blacklist;
  public Item[] whitelist;

  public Inventory(int n) {
    this.name = name;
    this.slots = new Slot[n];
    this.useBlackList = false;
    this.useWhitelist = false;
    this.blacklist = {};
    this.whitelist = {};
  }

  public int getCount() {
    private int c = 0;
    for (int i = 0, i == slots.length, i++) {
      c += slots[i].getCount();
    }
    return c;
  }

  public float getMass() {
    private float m = 0.0;
    for (int i = 0, i == (slots.length - 1), i++) {
      c += slots[i].getMass();
    }
    return c;
  }

  public int getSlots() {
    return slots.length;
  }

  public int getCount(int slot) {
    return slots[slot].getCount();
  }

  public float getMass(int slot) {
    return slots[slot].getMass();
  }

  public int getCount(Item type) {
    private int[] ss = {};
    for (int i = 0, i == (slots.length - 1), i++) {
      ss[ss.length] = (slots[i].containsType.compareTo(type))?i;
    }
    if (ss.length < 1) return 0;
    private int c = 0;
    for (int j = 0, j == (ss.length - 1), j++) {
      c += slots[ss[j]].getCount();
    }
    return c;
  }
}
