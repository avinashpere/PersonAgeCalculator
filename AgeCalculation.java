package com.perennialsys.calculator;

import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculation {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Date of Birth YYYY-MM-DD");
        LocalDate dob = LocalDate.parse(scanner.nextLine());
        if(dob!=null) {
            LocalDate currDate = LocalDate.now();
            Person person = new Person(dob, currDate);
            System.out.println(person.getAge().getYears());
        }
    }
}
