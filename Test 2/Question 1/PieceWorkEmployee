/**
 * I, Anthony Bauld - 000754334. Certify that I own and created this code. I have
 * not plagiarized or stole any code from another source nor have given this code
 * to another student.
 * @author Anthony Bauld - 000754334
 * @project Exam Test 2
 * @duedate Tuesday, August 18 at 10:00 am to 12:30 pm
 */

public class PieceworkEmployee extends Employee{
    private int quantity;
    private double cost;

    public PieceworkEmployee(String name, String number, int quantity, double cost){
        super(name, number);
        this.quantity = quantity;
        this.cost = cost;
    }

    public void setQuantity(int qty){
        this.quantity = qty;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public double getCost(){
        return cost;
    }
    @Override
    public String toString(){
        return "Piecework Employee: [" + super.toString() + ", Piece Made: " + quantity + ", Cost Per Price: " + cost + "]";
    }
    @Override
    public double getPaymentAmount() {
        return quantity * cost;
    }
}
