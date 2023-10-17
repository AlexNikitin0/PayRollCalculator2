package com.pluralsight;
import java.io.*;
import java.util.Scanner;
public class PayrollCalculator {

    public static void main(String[] args) {
    try {
        //create a Filereader object and connect to file
        FileReader fileReader = new FileReader("src/main/resources/employees.csv");
        //create bufferedreader to manage input stream
        BufferedReader bufReader = new BufferedReader(fileReader);
        String input;
        int counter = 0;
        Employee[] employees = new Employee[9];
        //read and display text file for now
        while((input = bufReader.readLine()) != null){

            String[] line = input.split("\\|");
            String name = line[1];
            String id = line[0];
            String hours = line[2];
            String payRate = line[3];
            //add each thing into array of object type employee
            employees[counter] = new Employee(line[0],line[1],line[2],line[3]);
                double hoursD = Double.parseDouble(hours);
                double payRateD = Double.parseDouble(payRate);

                System.out.printf("Employee ID: %s,Name: %s, GrossPay: $%.2f%n",employees[counter].getEmployeeId(),employees[counter].getName(),employees[counter].getGrossPay(hoursD,payRateD));
            counter++;


        }
            //test output



    }//end try
        catch (IOException e){
        //display stack trace
            e.printStackTrace();
        }


    }

}
