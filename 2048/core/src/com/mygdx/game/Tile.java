package com.mygdx.game;

public class Tile {

    private int value;
    private boolean merged;

    public Tile(int num) {
        value = num;
        merged = false;
    }
    //------------------------------------------

    public int getValue() {
        return value;
    }

    public void setValue(int num) {
        value = num;
    }

    //------------------------------------------

    public boolean getMerged(){
        return merged;
    }

    public void setMerged(){
        merged = true;
    }

    public void unMerge(){
        merged = false;
    }

    //------------------------------------------

    public boolean canMerge(Tile otherTile) {
        if (value == 0 || otherTile.getValue() == 0) { //if two tiles have a value of zero, we do not want them to "merge" since 2 empty tiles cannot be merged
            return false; //therefore this condition is automatically false if the value of the tile is 0
        }
        else {
            return value == otherTile.getValue() && merged == false && otherTile.getMerged() == false;
            //otherwise, it checks
        }
    }
}