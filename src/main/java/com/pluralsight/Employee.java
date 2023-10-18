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

    public double getGrossPay(){
        return Double.parseDouble(this.hoursWorked)  * Double.parseDouble(this.payRate);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", hoursWorked='" + hoursWorked + '\'' +
                ", GrossPay='" + this.getGrossPay() + '\'' +
                "}\n";
    }

    public String toString2(){
        return  "id|name|gross pay|" + "\n" +
                this.getEmployeeId() + "|" + name + "|" + + this.getGrossPay() +"\n";

    }

}





