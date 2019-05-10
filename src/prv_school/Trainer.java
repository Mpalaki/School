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
import java.util.Scanner;

/**
 *
 * @author Makis
 */
public class Trainer {
    private String firstname;
    private String lastname;
    private String subject;

    public Trainer(String firstname, String lastname, String subject) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.subject = subject;
    }

    public Trainer(String lastname) {
        this.lastname = lastname;
    }
    
    public Trainer() {
    }
    
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSubject() {
        return subject;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public static void getTrainersFromUser(){
    Scanner in=new Scanner(System.in);

        System.out.println("How many Trainers you want to insert?");
        while(!in.hasNextInt()){
            System.out.println("Please insert number");
        in.next();}
        int num_trainers = in.nextInt();

        for (int i = 0; i < num_trainers; i++) {
            System.out.println("Give next trainer's last name:");
            String s1 = in.next();

            Trainer tr = new Trainer(s1);
            tr.setLastname(s1);
            System.out.println("Give trainer's first name:");
            String s2 = in.next();
            tr.setFirstname(s2);
            System.out.println("Which is the trainer's subject?");
            String s3=in.next();
            tr.setSubject(s3);
            Lists.trainersList.add(tr);
            
        }System.out.println(Lists.trainersList);
    
}
    
    public static void useSyntheticTrainers(){
    Trainer tr1=new Trainer("Konstantinos","Daskalakis","computer science");
    Lists.trainersList.add(  tr1);
    Trainer tr2=new Trainer("John","Nash","game theory");
    Lists.trainersList.add( tr2);
        System.out.println(Lists.trainersList);
    }

    @Override
    public String toString() {
        return "Trainer{"   + firstname + " " + lastname + ", subject=" + subject + '}';
    }
    
}
