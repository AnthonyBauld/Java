
/**
 * I, Anthony Bauld - 000754334. Certify that I own and created this code. I have
 * not plagiarized or stole any code from another source nor have given this code
 * to another student.
 * @author Anthony Bauld - 000754334
 * @project Exam Test 2
 * @duedate Tuesday, August 18 at 10:00 am to 12:30 pm
 */

public class Service implements Payable{
    public String serviceDescription;
    public int quantity;
    public double serviceCost;

    public Service(String serviceDescription, int quantity, double serviceCost) {
        this.serviceDescription = serviceDescription;
        this.quantity = quantity;
        this.serviceCost = serviceCost;
    }
    public void setServiceDescription(String sd) {
        serviceDescription = sd;
    }
    public String getServiceDescription(){
        return serviceDescription;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;

    }
    public int getQuantity() {
        return quantity;
    }
    public void setServiceCost(double serviceCost){
        this.serviceCost = serviceCost;
    }
    @Override
    public String toString(){
        return "Service [Description: " + serviceDescription + ", Quantity: " + quantity + ", Price: " + serviceCost +"]";
    }
    @Override
    public double getPaymentAmount() {
        return quantity * serviceCost;
    }
}
