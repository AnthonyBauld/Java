package model;

import java.util.ArrayList;

public class WineCollection {
    private ArrayList<Wine> wines;
    public WineCollection(int num) {
        wines = new ArrayList<>();
        int baseYear = 1869;
        double baseCost = 800;
        for (int i=0 ; i<= num ; i++) {
            wines.add(new Wine(baseCost, baseYear));
            baseYear += 10;
            baseCost += 25;
        }
    }

    public Wine getWine(int i) throws Exception {
        if (i >= wines.size() || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return wines.get(i);
    }
    public int getInventory(){
        return wines.size();
    }
    public void age () {
        for (Wine w: wines) {
            w.setCost(w.getCost() + 102.5);
        }
    }
    public String toString()
    {
        String out = "";
        for (Wine w : wines) {
            out += w.toString() + " ; ";
        }
        return out;
    }
}
