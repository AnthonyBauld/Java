package model;

/**
 * I, Anthony Bauld - 000754334. Certify that I own and created this code. I have
 * not plagiarized or stole any code from another source nor have given this code
 * to another student.
 * @author Anthony Bauld - 000754334
 * @project Assignment 3: The Inhabitants of Foon
 * @duedate July 26th, 2020 at 11:59PM
 */

public class Humanoid {
    protected final String name;
    protected int strength, dexterity, armour, moxie, health, coins;
    protected boolean isAlive;
    public Humanoid (String name) {
        this.name = name;
    }
    public Humanoid (String name, int strength, int dexterity, int armour, int moxie, int health, int coins) throws Exception {
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.armour = armour;
        this.moxie = moxie;
        this.health = health;
        this.coins = coins;
        valid();
        setAlive();
    }

    private void setAlive() {
        isAlive = health > 0;
    }
    private void valid() throws Exception {
        if (    strength  < 0 || strength  > 20 ||
                dexterity < 0 || dexterity > 20 ||
                armour    < 0 || armour    > 20 ||
                moxie     < 0 || moxie     > 20 || coins < 0 )
            throw new Exception("Invalid attributes");
    }
    public void modifyStrength( int unit ) throws Exception{
        if (unit != 1 && unit != -1 )
            throw new Exception("Strength can be increased by only 1 or -1");
        strength += unit;
        valid();
    }
    public void modifyDexterity( int unit ) throws Exception{
        if (unit != 1 && unit != -1 )
            throw new Exception("Dexterity can be increased by only 1 or -1");
        dexterity += unit;
        valid();
    }
    public void modifyArmour( int unit ) throws Exception{
        if (unit != 1 && unit != -1 )
            throw new Exception("Strength can be increased by only 1 or -1");
        armour += unit;
        valid();
    }
    public void modifyMoxie( int unit ) throws Exception{
        if (unit != 1 && unit != -1 )
            throw new Exception("Moxie can be increased by only 1 or -1");
        moxie += unit;
        valid();
    }


    public void doDamage(int health) {
        int value = 1;
        if (armour != 0)
            value = armour;
        this.health -= (health / value);
        if (this.health < 0)
            this.health = 0;
        setAlive();
    }


    protected int getMoney(int moneyToTake) {
        if (moneyToTake >= coins)
        {
            int temp = coins;
            coins = 0;
            return temp;
        }
        else {
            this.coins -= moneyToTake;
            return moneyToTake;
        }
    }
}
