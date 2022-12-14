import java.util.ArrayList;

/**
 * I, Anthony Bauld - 000754334. Certify that I own and created this code. I have
 * not plagiarized or stole any code from another source nor have given this code
 * to another student.
 * @author Anthony Bauld - 000754334
 * @project Exam Test 2
 * @duedate Tuesday, August 18 at 10:00 am to 12:30 pm
 */

public class Invoice {
    public static void main (String[] args) {
        ArrayList<Payable> objects = new ArrayList<>();
        objects.add(new Service("small engine repair (R-114)", 1, 375.0));
        objects.add(new Service("tire re-balancing (T-652)", 4, 15.98));
        objects.add(new PieceworkEmployee("Oliver Queen", "444-44-4444", 350, 2.5));
        objects.add(new PieceworkEmployee("Dinah Lance", "666-66-6666", 450, 2.75));

        double total = 0.0;
        for (Payable p : objects) {
            total += p.getPaymentAmount();
            System.out.println(p + " Payment: " + p.getPaymentAmount());
        }

        System.out.println("\nTotal Payments: " + total);
    }
}
