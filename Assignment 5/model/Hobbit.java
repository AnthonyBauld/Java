package model;

/**
 * I, Anthony Bauld - 000754334. Certify that I own and created this code. I have
 * not plagiarized or stole any code from another source nor have given this code
 * to another student.
 * @author Anthony Bauld - 000754334
 * @project Assignment 3: The Inhabitants of Foon
 * @duedate July 26th, 2020 at 11:59PM
 */

public class Hobbit extends Humanoid{
    public Hobbit(String name, int strength, int dexterity, int armour, int moxie, int health, int coins) throws Exception {
        super(name, strength, dexterity, armour, moxie, health, coins);
    }
    public void steal (Humanoid humanoid) {
        int moneyToTake = dexterity / 2;
        int stolen = humanoid.getMoney(moneyToTake);
        coins += stolen;
    }
    @Override
    public String toString() {
        String output = "Hobbit: " + name ;
        output += (isAlive) ? " - Alive - \n" : " - Dead - \n";
        output += "Health = " + health + "\n";
        output += "Strength = " + strength + "\n";
        output += "Dexterity = " + dexterity + "\n";
        output += "Armour = " + armour + "\n";
        output += "Coins = " + coins + "\n";
        return output;
    }
}
