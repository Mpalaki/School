/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prv_school;

import java.util.Scanner;

/**
 *
 * @author Makis
 */
public class Prv_School {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ////////////INSERTING STUDENTS//////////////////
        
        Scanner sc=new Scanner(System.in);
        System.out.println("would you like to insert students?");
        String answer=sc.next();
        while(!answer.equals("yes") && !answer.equals("no")){
        System.out.println("please type 'yes' or 'no' ");        
        answer=sc.next();}
        if(answer.equals("yes")){
        Student.getStudentsFromUser();
        Student.displayStudentsList();}
        else if(answer.equals("no")){
        Student.useSyntheticStudents();
        
        }
        /////////////INSERTING TRAINERS/////////////////////
        System.out.println("would you like to insert trainers?");
        Scanner sct=new Scanner(System.in);
        String answert=sct.next();
        while(!answert.equals("yes") && !answert.equals("no")){
        System.out.println("please type 'yes' or 'no' ");
        answert=sct.next();}
        if(answert.equals("yes")){
        Trainer.getTrainersFromUser();
        }
        else if(answert.equals("no")){
        Trainer.useSyntheticTrainers();
        }
        
        ////////////INSERTING ASSIGNMENTS///////////////////
        System.out.println("would you like to insert assignments ?");
        Scanner sca=new Scanner(System.in);
        String answera=sca.next();
        while(!answera.equals("yes") && !answera.equals("no")){
        System.out.println("please type 'yes' or 'no' ");
        answera=sca.next();}
        if(answera.equals("yes")){
        Assignment.getAssignmentsFromUser();
        }
        else if(answera.equals("no")){
        Assignment.useSyntheticAssignments();
        }
        //////////////INSERTING COURSES/////////////////
        System.out.println("would you like to insert courses?");
        Scanner scc=new Scanner(System.in);
        String answerc=scc.next();
        while(!answerc.equals("yes") && !answerc.equals("no")){
        System.out.println("please type 'yes' or 'no' ");
        answerc=scc.next();}
        if(answerc.equals("yes")){
        Course.getCoursesFromUser();
        }
        else if(answerc.equals("no")){
        Course.useSyntheticCourses();
        }
        
       // TrainersPerCourse.assignTrainersToCourses();
        
        ///////////////ASSIGNING STUDENTS TO COURSES AND DISPLAYING STUDENTS PER COURSE/////////////////
        StudentsCourse.addStudentsToCourse();
        StudentsCourse.displayStudentsPerCourse();
        
        StudentsCourse.displayStudentsThatBelongToMoreThanOneCourses();
        
        ///////////////ASSIGNING TRAINERS TO COURSES AND DISPLAYING TRAINERS PER COURSE/////////////////
        TrainersCourse.addTrainersToCourse();
        TrainersCourse.displayTrainersPerCourse();
//        
//      ///////////////ASSIGNING ASSIGNMENTS TO COURSES AND DISPLAYING ΑASSIGNMENTS PER COURSE/////////////////
        AssignmentsCourse.addAssignmentsToCourse();
        AssignmentsCourse.displayAssignmentsPerCourse();
        
        ///////////////DISPLAYING ΑASSIGNMENTS PER STUDENT//////////////////////////////
        AssignmentsStudent.assignAssignmentsToStudents();
        AssignmentsStudent.displayAssignmentsPerStudent();
        AssignmentsStudent.sortStudentsPerAssignments();
        
        ///////////////////students who need to submit one or more assignments//////////////////////// 
        ///////////////////on the same calendar week as the given date////////////////////////////////
        AssignmentsStudent.displayStudentsThatHaveToSubmitAssignments();


    }
    

}
