/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.googlecode.jcsv.reader.CSVEntryParser;

/**
 *
 * @author charmainerodrigues
 */
 public class StudentEntryParser implements CSVEntryParser<Student> {

    /**
     *
     * @param data
     * @return
     */
    @Override
  public Student parseEntry(String... data) {
  System.out.println(data.length);
    System.out.println(data);
    int name = Integer.parseInt(data[0]);
    String country = data[1];
    double gpa = Double.parseDouble(data[2]);
                
    return new Student(name, country, gpa);
  }
  }