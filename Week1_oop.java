/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week1_oop;

/**
 *
 * @author iftekharifti
 */
public class Week1_oop {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    
    
    Person person = new Person("Iftekhar");
    
    person.setSurname("Zaman");
    person.setAge(22);

    
    person.displayname();
    
    System.out.println("The name of the person is " +  person.display_f_name() + " " + person.getSurname() "." );
    System.out.println("The age of " + person.display_f_name()+ " is " + person.getAge() "." );
    
    }    
    
}


