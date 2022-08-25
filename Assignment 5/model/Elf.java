package model;

/**
 * I, Anthony Bauld - 000754334. Certify that I own and created this code. I have
 * not plagiarized or stole any code from another source nor have given this code
 * to another student.
 * @author Anthony Bauld - 000754334
 * @project Assignment 3: The Inhabitants of Foon
 * @duedate July 26th, 2020 at 11:59PM
 */

public class Elf extends Humanoid{
    private Clan clan;
    private Hobbit friend;
    public Elf(String name, int strength, int dexterity, int armour, int moxie, int health, int coins, Clan clan) throws Exception {
        super(name, strength, dexterity, armour, moxie, health, coins);
        this.clan = clan;
    }
    public void setFriend(Hobbit hobbit) {
        this.friend = hobbit;
    }
    @Override
    public String toString() {
        String output = "Elf: " + name + "From " + clan.toString() ;
        output += (isAlive) ? " - Alive - \n" : " - Dead - \n";
        output += "Health = " + health + "\n";
        output += "Strength = " + strength + "\n";
        output += "Dexterity = " + dexterity + "\n";
        output += "Armour = " + armour + "\n";
        output += "Coins = " + coins + "\n";
        return output;
    }
}
