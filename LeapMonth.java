// LeapMonth.java
public class LeapMonth {
    
    // Declare variables
    private int year;
    private int month;
    private boolean isLeapMonth;
    
    // Constructor
    public LeapMonth() {
        // Initialize variables if needed
        this.year = 0;
        this.month = 0;
        this.isLeapMonth = false;
    }
    
    // Getter and setter methods
    public void setYear(int year) {
        this.year = year;
    }
    
    public void setMonth(int month) {
        this.month = month;
    }
    
    public int getYear() {
        return year;
    }
    
    public int getMonth() {
        return month;
    }
    
    public boolean isLeapMonth() {
        return isLeapMonth;
    }
}
