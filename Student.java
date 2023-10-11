/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Ваня
 */
class Student {
    private String fName;
    private String lName;
    private String fNum;
    private int yearS;
    private String semester;
    public Student(String fName, String lName, String fNum, int yearS, String semester){
        if(fName.isEmpty()||lName.isEmpty()||fNum.isEmpty()||yearS<1||semester.isEmpty()){
            throw new IllegalArgumentException("Nevalidni danni za studenta.");
        }
        this.fName=fName;
        this.lName=lName;
        this.fNum=fNum;
        this.yearS=yearS;
        this.semester=semester;
    }
    public String getFullName(){
        return fName+" "+lName;
    }
    public String getFNum(){
        return fNum;
    }
    public int getYearS(){
        return yearS;
    }
    public String getSemester(){
        return semester;
    }
}
