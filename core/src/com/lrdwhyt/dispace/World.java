package com.lrdwhyt.dispace;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.Array;

public class World extends Map {

  private SpaceSet spaceSet;
  private PlayerCharacter player;
  private Array<NonPlayerCharacter> npcList;

  public World(int width, int height) {
    super(width, height);
    spaceSet = new SpaceSet(1);
    player = new PlayerCharacter();
    player.setPosition(MathUtils.random(0, getWidth()), MathUtils.random(0, getHeight()));
    npcList = new Array<NonPlayerCharacter>(50);
  }

  public void generate(int seed) {
    for (int x = 0; x < getWidth(); x++) {
      for (int y = 0; y < getHeight(); y++) {
        int type = MathUtils.random(1, spaceSet.getLength()) - 1;
        setAt(x, y, type);
      }
    }
  }

  //TODO: Implement
  public void generateTectonicMap() {
    Map tectonicFramework = new Map(getWidth(), getHeight());
    for (int x = 0; x < getWidth(); x++) {
      for (int y = 0; y < getHeight(); y++) {
        if (MathUtils.random(1, 10) == 1) {
          tectonicFramework.setAt(x, y, 1);
        }
      }
    }
    //TODO: Generate Voronoi diagram using tectonicFramework
  }

  //TODO: Implement
  public void generateHeightMap(Map tectonicMap) {
    //TODO: Generate random values for the boundaries given by the tectonic map
    //TODO: Smooth out the heights
  }


  public TextureRegion getSpace(int type) {
    return spaceSet.getSpaceType(type);
  }

  public PlayerCharacter getPlayer() {
    return player;
  }

}
