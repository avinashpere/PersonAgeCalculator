package com.perennialsys.calculator;

import com.sun.jdi.LocalVariable;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Person {

    private LocalDate dob;
    private LocalDate currDate;
    
    public Person(LocalDate dob, LocalDate currDate) {
        this.dob = dob;
        this.currDate = currDate;
    }
    
    public LocalDate getDob() {
        return dob;
    }
    public LocalDate getCurrDate() {
        return currDate;
    }
    public Period getAge(){
    
        return Period.between(dob, currDate);
    
    }
    
}
