package com.company;

public class Employee {
    // fields
    private   int baseSalary;
    private int hourlyRate;
     // static declaration
    public static int numberOfEmployee;

    // creating constructor methods
    public Employee(int baseSalary, int hourlyRate){
       // this.baseSalary = baseSalary; or
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployee++;
    }
    //public int extraHours; since we need this every month and its not fix like base and hourly rate we put in the parameter
    // of calculatewage method
    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployee);
    }

    //methods
    public int calculateWage (int extraHours){
        return baseSalary + (getHourlyRate() * extraHours);
    }
    public int calculateWage (){
        return baseSalary;
    }
    //including getters and setters methods
    private void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }
    private int getBaseSalary(){ //changing public to private for the purpose of abstraction
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <=0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or negative");
        this.hourlyRate = hourlyRate;
    }
}
