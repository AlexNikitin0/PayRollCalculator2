package com.pluralsight;

public class Employee {

    String employeeId;
    String name;
    String hoursWorked;
    String payRate;

//consty
    public Employee(String id, String nme, String hours, String payR){
        this.employeeId = id;
        this.name = nme;
        this.hoursWorked = hours;
        this.payRate = payR;
    }
//getters
    public String getEmployeeId() {
        return employeeId;
    }

    public String getName(){
        return name;
    }

    public String getHoursWorked(){
        return hoursWorked;
    }

    public String getPayRate(){
        return payRate;
    }

    //setters
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursWorked(String hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setPayRate(String payRate) {
        this.payRate = payRate;
    }

    //custom methods

    public double getGrossPay(double hoursWorked, double payRate){
        return hoursWorked * payRate;
    }


}



