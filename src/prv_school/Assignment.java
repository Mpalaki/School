/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prv_school;

/**
 *
 * @author Makis
 */
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author Makis
 */
public class Assignment {
    private String title;
    private String description;
    private LocalDateTime submissiondatetime;

    public Assignment(String title, String description, int year, int month, int day, int hour, int minute) {
        this.title = title;
        this.description = description;
        this.submissiondatetime = LocalDateTime.of(year, month, day, hour, minute);
    }  

    public Assignment(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Assignment(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocaldatetime(int year, int month, int day, int hour, int minute) {
        this.submissiondatetime = LocalDateTime.of(2019, (month>0&& month<13)?month:1,
                (day>0&& day<32)?day:1, (hour>=0&& hour<24)?hour:0, (minute>=0&& minute<60)?minute:0);
    }

    public LocalDateTime getLocaldatetime() {
        return submissiondatetime;
    }

    
    
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

        @Override
    public String toString() {
        return "Assignment{" + "title=" + title + ", description=" + description + ", submissiondate=" + submissiondatetime+'}';
    }
    public static void getAssignmentsFromUser(){
    Scanner in=new Scanner(System.in);

        System.out.println("How many Assignments you want to insert?");
        while(!in.hasNextInt()){
            System.out.println("Please insert number");
        in.next();} 
        int num = in.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Give next assignement's title:");                       
            String s1 = in.next();
            Assignment as = new Assignment(s1);
            as.setTitle(s1);
            System.out.println("Give assignement's description:");
            String s2 = in.next();
            as.setDescription(s2);            
            System.out.println("Give submission's date month(type number between 1-12): ");
            while(in.hasNextInt()==false){
            System.out.println("please give numerical");
            in.next();}
            int s4=in.nextInt();
            System.out.println("Give submission's date day of month: ");
            while(in.hasNextInt()==false){
            System.out.println("please give numerical");
            in.next();}
            int s5=in.nextInt();
            System.out.println("Give submission's hour: ");
            while(in.hasNextInt()==false){
            System.out.println("please give numerical");
            in.next();}
            int s6=in.nextInt();
            System.out.println("Give submission's minute: ");
            while(in.hasNextInt()==false){
            System.out.println("please give numerical");
            in.next();}
            int s7=in.nextInt();
            as.setLocaldatetime(2019,s4, s5, s6, s7);
            Lists.assignmentsList.add(as);
            
        }System.out.println(Lists.assignmentsList);
    
}
    
    public static void useSyntheticAssignments(){
    Assignment as1=new Assignment("Assignment1Brief","You are required to produce a solution that implements a private school structure. ",2019,3,18,12,0);
    Lists.assignmentsList.add( as1);
    Assignment as2=new Assignment("Assignment2Brief","You are required to produce a solution that implements a public school structure. ",2019,5,23,12,0);
    Lists.assignmentsList.add( as2);
        System.out.println(Lists.assignmentsList);
    }
    
    
    
}
