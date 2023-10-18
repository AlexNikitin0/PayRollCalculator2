package com.pluralsight;
import java.io.*;
import java.util.Scanner;
import java.util.Scanner;
public class PayrollCalculator {

    public static void main(String[] args) {
        int choice = 0;
    try {
        Scanner keyboard = new Scanner(System.in);
        //create a Filereader object and connect to file
        FileReader fileReader = new FileReader("src/main/resources/employees.csv");
        //create bufferedreader to manage input stream
        BufferedReader bufReader = new BufferedReader(fileReader);
        String input;
        int counter = 0;
        Employee[] employees = new Employee[8];
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

              //  System.out.printf("Employee ID: %s,Name: %s, GrossPay: $%.2f%n",employees[counter].getEmployeeId(),employees[counter].getName(),employees[counter].getGrossPay(hoursD,payRateD));
            counter++;



        }//end while
            //test output

        String userInput = "";
        String userInput2 = "";
        //get user input
        System.out.println("Enter the name of the file to be created: ");
        userInput = keyboard.nextLine();
        System.out.println("Jason(1) or CSV(2)?:");
        choice = keyboard.nextInt();
        //create new file writer and get it to write to a file

        try{
            //filewriter code here
            FileWriter fileWriter = new FileWriter(userInput);
            //create bufferedwriter
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);
if(choice == 1) {
    //write to the file
    for (int i = 0; i < employees.length; i++) {

        bufWriter.write(employees[i].toString());
    }

    bufWriter.close();
}
else if(choice == 2){
    for (int i = 0; i < employees.length; i++) {

        bufWriter.write(employees[i].toString2());
    }

    bufWriter.close();

}
        }
        catch (IOException e) {
            System.out.println("ERROR: An unexpected error occurred");
            e.getStackTrace();

        }



    }//end try
        catch (IOException e){
        //display stack trace
            e.printStackTrace();
        }


    }

}
