/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author charmainerodrigues
 */
public class Student {
    private  int name;
    private  String country;
    private  double gpa;
    
    public Student(int name, String country, double gpa){
        this.name = name;
        this.country = country;
        this.gpa = gpa;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s", name, country, gpa);
    }
    
   

}
