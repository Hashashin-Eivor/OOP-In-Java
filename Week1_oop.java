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
    
    
    Person p = new Person("Iftekhar");
    
    p.setSurname("Zaman");
    p.setAge(22);

    
    p.displayname();
    
    System.out.println("The name of the person is " +  p.display_f_name() + " " + p.getSurname()  );
    System.out.println("The age of " + p.display_f_name()+ " is " + p.getAge() );
    
    }    
    
}


