/**
 * I, Anthony Bauld - 000754334. Certify that I own and created this code. I have
 * not plagiarized or stole any code from another source nor have given this code
 * to another student.
 * @author Anthony Bauld - 000754334
 * @project Exam Test 2
 * @duedate Tuesday, August 18 at 10:00 am to 12:30 pm
 */

public class Employee implements Payable{
    private String name;
    private String number;
    public Employee(String name, String number) {
        this.name = name;
        this.number = number;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber(){
        return number;
    }
    @Override
    public String toString(){
        return name + " (" + number +")";
    }
    @Override
    public double getPaymentAmount() {
        return 0;
    }
}
