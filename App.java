/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany;

import java.util.Scanner;

/**
 *
 * @author Ваня
 */
public class App {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Vuvedete broi studenta: ");
        int n=scan.nextInt();
        Student[] students=new Student[n];
        for(int i=0;i<n;i++){
            try{
                System.out.println("Vuvedete danni za student "+(i+1));
                System.out.print("Ime: ");
                String fName=scan.nextLine();
                System.out.print("Familia: ");
                String lName=scan.nextLine();
                System.out.print("Faculteten nomer: ");
                String fNum=scan.nextLine();
                System.out.print("Godina na obuchenie(1-6): ");
                int yearS=scan.nextInt();
                System.out.print("Semestr(zimen ili leten): ");
                String semester=scan.nextLine();
                students[i]=new Student(fName,lName,fNum,yearS,semester);
            }catch(IllegalArgumentException e){
                System.out.println("Greshka: "+e.getMessage());
                i--;
            }
        }
        System.out.println("\nInformatsia za studentite: ");
        for(Student student:students){
            System.out.print("Ime: "+student.getFullName());
            System.out.print("Fakulteten nomer: "+student.getFNum());
            System.out.print("Godina na obuchenie: "+student.getYearS());
            System.out.print("Semestr: "+student.getSemester());
            System.out.println();
        }
    }
}
