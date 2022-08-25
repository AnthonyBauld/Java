package model;

/**
 * I, Anthony Bauld - 000754334. Certify that I own and created this code. I have
 * not plagiarized or stole any code from another source nor have given this code
 * to another student.
 * @author Anthony Bauld - 000754334
 * @project Assignment 3: The Inhabitants of Foon
 * @duedate July 26th, 2020 at 11:59PM
 */

public class Wizard extends Human{
    private int magic;
    public Wizard(String name, int strength, int dexterity, int armour, int moxie, int health, int coins, int magic) throws Exception {
        super(name, strength, dexterity, armour, moxie, health, coins);
        this.magic = magic;
        if (magic < 0 || magic > 20 ) {
            throw new Exception("Invalid numerical magic !");
        }
    }
    public Wizard(String name) {
        super(name);
    }

    @Override
    public void attack(Humanoid humanoid) throws Exception {
        if (isAlive == false) {
            throw new Exception("Dead Wizard, cannot attack!");
        }
        int damage = (strength + dexterity + health ) / 3;
        humanoid.doDamage(damage);
    }

    public void heal() {
        health += (magic / 2);
        magic -= 3;
        if (magic < 0)
            magic = 0;
    }
    @Override
    public String toString() {
        String output = "Wizard: " + name ;
        output += (isAlive) ? " - Alive - \n" : " - Dead - \n";
        output += "Health = " + health + "\n";
        output += "Strength = " + strength + "\n";
        output += "Dexterity = " + dexterity + "\n";
        output += "Armour = " + armour + "\n";
        output += "Coins = " + coins + "\n";
        output += "Magic = " + magic + "\n";
        return output;
    }
}
