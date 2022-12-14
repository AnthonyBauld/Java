
import model.*;

/**
 * I, Anthony Bauld - 000754334. Certify that I own and created this code. I have
 * not plagiarized or stole any code from another source nor have given this code
 * to another student.
 * @author Anthony Bauld - 000754334
 * @project Assignment 5: The Inhabitants of Foon
 * @duedate July 26th, 2020 at 11:59PM
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Humanoid wizard = new Wizard("Wizard", 10, 9, 5, 6, 15, 62, 12);
        Humanoid fighter = new Fighter("Human", 10, 9, 5, 6, 20, 16) ;
        Humanoid hobbit = new Hobbit("Hobbit", 14, 5, 8, 15, 60, 10);
        System.out.println(wizard + "\n--------------------------------\n" + fighter + "\n--------------------------------\n" + hobbit);
        ((Fighter)fighter).attack(hobbit);
        System.out.println("--------------------------------\n" + hobbit);
        ((Wizard)wizard).attack(hobbit);
        System.out.println("--------------------------------\n" + hobbit);
    }
}
