/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prv_school;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Makis
 */
public class Student {
    
    private String firstname;
    private String lastname;
    private LocalDate localdate;
    private int tuitionfees;   
    

    public Student(){}
    

    public Student(String lastname) {
        this.lastname = lastname;
    }
    public Student(String firstname, String lastname, int tuitionfees){
    this.firstname = firstname;
        this.lastname = lastname;
        this.tuitionfees = tuitionfees;}
    
    public Student(String firstname, String lastname, int year, int month, int day, int tuitionfees) {
        this.firstname = firstname;
        this.lastname = lastname;
        localdate = LocalDate.of(year, month, day);
        this.tuitionfees = tuitionfees;
    }    

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }    

    public int getTuitionfees() {
        return tuitionfees;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setLocaldate(int year, int month, int day) {
        this.localdate = LocalDate.of((year>1900&& year<2000)?year:2000, (month>0&& month<13)?month:1, (day>0&& day<32)?day:1);
    }    

    public void setTuitionfees(int tuitionfees) {
        this.tuitionfees = tuitionfees;
    }
    
    public static void getStudentsFromUser() {
        Scanner in = new Scanner(System.in);

        System.out.println("How many students you want to insert?");
        while(!in.hasNextInt()){
            System.out.println("Please insert number");
        in.next();}
        int numstudents = in.nextInt();

        for (int i = 0; i < numstudents; i++) {
            System.out.println("Give next student's last name:");
            String s1 = in.next();

            Student st = new Student(s1);
            st.setLastname(s1);
            System.out.println("Give student's first name:");
            String s2 = in.next();
            st.setFirstname(s2);
            System.out.println("Give student's year of birth: ");
            while(in.hasNextInt()==false){
            System.out.println("please give numerical");
            in.next();}
            int yob=in.nextInt();            
            System.out.println("Give student's month of birth (type number between 1-12): ");
            while(in.hasNextInt()==false){
            System.out.println("please give numerical");
            in.next();}
            int mob=in.nextInt();
            System.out.println("Give student's day of month of birth: ");
            while(in.hasNextInt()==false){
            System.out.println("please give numerical");
            in.next();}
            int dob=in.nextInt();
            st.setLocaldate(yob, mob, dob);
            System.out.println("How much are his tuition fees?");
            while(!in.hasNextInt()){
                System.out.println("Please insert amount");
            in.next();}
            int tf = in.nextInt();
            st.setTuitionfees(tf);
            Lists.studentsList.add(st);
        }

    }
    public static void displayStudentsList(){
        System.out.println(Lists.studentsList);}
    
    public static void useSyntheticStudents(){
    Student st1=new Student("Gerasimos","Karfakis",1984,6,1,2250);
    Lists.studentsList.add(st1);
    Student st2=new Student("Nikolaos","Kermezis",1987,5,10,2250);
    Lists.studentsList.add(st2);
    Student st3=new Student("Vasileios","Efthymiou",1994,4,20,2250);    
    Lists.studentsList.add(st3);
    System.out.println(Lists.studentsList);}
//    public static void populateSyntheticData(){
////    

    
    @Override
    public String toString() {
        return "Student{" + firstname + " " + lastname + ", dob=" + localdate + ", tuitionfees=" + tuitionfees + '}';
    }
    
        
}