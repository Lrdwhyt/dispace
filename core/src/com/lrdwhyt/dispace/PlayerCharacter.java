package com.lrdwhyt.dispace;

import com.badlogic.gdx.math.Vector2;

public class PlayerCharacter implements Character {

  private String name;
  private Vector2 position;
  private int[] skills = new ;
  private int[] inventory = new int[Item.values().length];

  public PlayerCharacter() {
    name = "";
    position = new Vector2();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Vector2 getPosition() {
    return position;
  }

  public void setPosition(Vector2 position) {
    this.position = position;
  }

  public void setPosition(float x, float y) {
    position.x = x;
    position.y = y;
  }

}
