package model;

public class Wine {
    private final int year;
    private double cost;
    public Wine(double cost, int year)
    {
        this.year = year;
        this.cost = cost;
    }
    public void setCost(double cost) { this.cost = cost; }
    public double getCost() { return cost; }
    public int getYear() { return year; }
    public String toString()
    {
        return String.format("a wine from %d and costs $%.2f",
                getYear(), getCost());
    }
}
