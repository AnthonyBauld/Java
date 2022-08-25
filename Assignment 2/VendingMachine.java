package model;

import java.text.DecimalFormat;
import java.math.BigDecimal;

/**
 * I, Anthony Bauld - 000754334. Certify that I own and created this code. I have
 * not plagiarized or stole any code from another source nor have given this code
 * to another student.
 * @author Anthony Bauld - 000754334
 * @project Assignment 2: Vending Machines in a Break Room
 * @duedate June 21st, 2020 at 11:59PM
 */

/**
 * This function is the declaration of the
 * variables that will be used within this vending
 * machine. I am also declaring the values of currency
 * accepted by the vending machine.
 */
public class VendingMachine {
    private final Product p;
    private int NumOfItems;
    private Double UserBalance,
            VendingBalance;
    private final Double[] CurrencyAccepted = new Double[] {
            1.0,
            2.0,
            0.25,
            0.05,
            0.1
    };

    /**
     * This function is the declaration of the
     * variables that will be used to name and price
     * the items within the vending machine. I will
     * also create a sting/double to call upon these
     * pre-determined variables.
     */
    public class Product {
        private final Double ItemPrice;
        private final String ItemName;

        public Product(String name, Double price) {
            ItemPrice = price;
            ItemName = name;
        }

        public String getItemName() {
            return ItemName;
        }
        public Double getItemPrice() {
            return ItemPrice;
        }
    }

    /**
     * This function is the declaration of the
     * variables that will be used to track the
     * number of items within the vending machine
     * as well as the user balance and the vending
     * machine balance.
     **/
    public VendingMachine(String ItemNames, Double ItemPrices, int NumberOfItems, Double UserBalance, Double VendingBalance) {
        p = new Product(ItemNames, ItemPrices);
        this.NumOfItems = NumberOfItems;
        this.UserBalance = UserBalance;
        this.VendingBalance = VendingBalance;
    }

    /**
     * I'm pre-determining the amount of items there
     * is within the vending machine as well as determining
     * the balance of the user before he walks up to the
     * vending machine.
     */
    public VendingMachine() {
        p = new Product("Items", 1.00);
        this.NumOfItems = 1;
        this.UserBalance = 0.0;
        this.VendingBalance = 1.0;
    }

    /**
     * This function is in place in-case the user doesn't
     * have or enter the correct amount of funds to vend
     * an item within the vending machine.
     *
     * @return if the user doesn't have the required amount to vend an item.
     */
    public boolean vendItem() {
        if (UserBalance >= p.getItemPrice()) {
            VendingBalance = VendingBalance + p.getItemPrice();
            UserBalance = UserBalance - p.getItemPrice();
            NumOfItems--;
            return true;
        } else {
            return false;
        }
    }

    /**
     * This function purpose is to establish the amount of money
     * the user has enter within the machine and when called
     * upon it will return the change the user has enter back
     * to the user.
     *
     * @return if the user ask to retrieve their balance from the vending machine.
     */
    public Double getChange() {
        BigDecimal temp = new BigDecimal(UserBalance).setScale(4, BigDecimal.ROUND_HALF_UP);
        for (Double coin: CurrencyAccepted) {
            BigDecimal coinType = new BigDecimal(coin).setScale(4, BigDecimal.ROUND_HALF_UP);
            int count = temp.divide(coinType, 5, BigDecimal.ROUND_HALF_UP).intValue();
            temp = temp.subtract(new BigDecimal(coinType.floatValue() * count).setScale(4, BigDecimal.ROUND_HALF_UP));
        }
        Double changeable = UserBalance - temp.doubleValue();
        UserBalance = 0.0;
        return changeable;
    }

    /**
     * This function is how users will enter change
     * into the vending machine. It takes the pre-existing
     * amount of user balance and (add)s the new amount
     * that they have entered into the vending machine.
     *
     * @param amount add new value to pre-existing amount.
     * @return if the user doesn't enter a numerical value.
     */
    public boolean enterMoney(Double amount) {
        if (validNotes(amount)) {
            UserBalance = UserBalance + amount;
            return true;
        } else {
            return false;
        }
    }

    /**
     * This function is to check if the user is entering
     * the correct type of currency within the vending
     * machine. If the user enters a amount with a decimal
     * it will automatically round it up.
     *
     * @param amount check to see if the user enter the correct type of currency.
     * @return if the user doesn't enter a accepted value type.
     */
    private boolean validNotes(Double amount) {
        BigDecimal temp = new BigDecimal(amount).setScale(4, BigDecimal.ROUND_HALF_UP);
        for (int i = 0; i < CurrencyAccepted.length; i++) {
            BigDecimal note = BigDecimal.valueOf(CurrencyAccepted[i]).setScale(4, BigDecimal.ROUND_HALF_UP);
            int numberOfNote = (int)(temp.divide(note, 5, BigDecimal.ROUND_HALF_UP).doubleValue());
            temp = temp.subtract(new BigDecimal(note.floatValue() * numberOfNote).setScale(4, BigDecimal.ROUND_HALF_UP));
        }
        return (temp.doubleValue() <= 0.00001);
    }

    @Override
    public String toString() {
        DecimalFormat df2 = new DecimalFormat("#.##");
        return "VendingMachine: " + NumOfItems + " " + p.getItemName() + ", $" + df2.format(p.getItemPrice()) + ", $" + df2.format(UserBalance) + ", $" + df2.format(VendingBalance);
    }
}
