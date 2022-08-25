package model;

/**
 * I, Anthony Bauld - 000754334. Certify that I own and created this code. I have
 * not plagiarized or stole any code from another source nor have given this code
 * to another student.
 * @author Anthony Bauld - 000754334
 * @project Assignment 3: The Inhabitants of Foon
 * @duedate July 26th, 2020 at 11:59PM
 */

public class Fighter extends Human{
    public Fighter(String name, int strength, int dexterity, int armour, int moxie, int health, int coins) throws Exception {
        super(name, strength, dexterity, armour, moxie, health, coins);
    }


    public Fighter(String name) {
        super(name);
    }

    @Override
    public void attack(Humanoid humanoid) throws Exception {
        if (isAlive == false) {
            throw new Exception("Dead Fighter, cannot attack!");
        }
        int damage = (strength + dexterity + health ) / 3;
        damage *= 2;
        humanoid.doDamage(damage);
    }
    @Override
    public String toString() {
        String output = "Fighter: " + name ;
        output += (isAlive) ? " - Alive - \n" : " - Dead - \n";
        output += "Health = " + health + "\n";
        output += "Strength = " + strength + "\n";
        output += "Dexterity = " + dexterity + "\n";
        output += "Armour = " + armour + "\n";
        output += "Coins = " + coins + "\n";
        return output;
    }
}
