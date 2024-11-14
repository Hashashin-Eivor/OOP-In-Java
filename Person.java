/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week1_oop;

/**
 *
 * @author iftekharifti
 */
public class Person {
    
    String name;
    String surname;
    int age;

public Person(String n){
    name=n;
    }

public void displayname(){
    System.out.println(name);
    }

public String display_f_name(){
    return name;
    }

public void setSurname(String s){
    surname=s;
    }

public void setAge(int a){
    age=a;
    }

public String getSurname(){
    return surname;
    }

public int getAge(){
    return age;
    }








}