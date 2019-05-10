/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prv_school;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Makis
 */
public class AssignmentsStudent {
    private Student student;
    private Assignment assignment;

    public AssignmentsStudent(Student student, Assignment assignment) {
        this.student = student;
        this.assignment = assignment;
    }

    public Student getStudent() {
        return student;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    @Override
    public String toString() {
        return "AssignmentsStudent{" + "student=" + student + ", assignment=" + assignment + '}';
    }
   
    public static void assignAssignmentsToStudents(){
    for(int i=0;i<Lists.studentsCourseList.size();i++){
    for(int j=0;j<Lists.assignmentsCourseList.size();j++){
    if(Lists.studentsCourseList.get(i).getCourse().equals(Lists.assignmentsCourseList.get(j).getCourse())){
    AssignmentsStudent as=new AssignmentsStudent(
    Lists.studentsCourseList.get(i).getStudent(),Lists.assignmentsCourseList.get(j).getAssignment());
    Lists.assignmentsStudentList.add(as);
    }
    }
    }
//    System.out.println(Lists.assignmentsStudentList);
}
    public static void displayAssignmentsPerStudent(){
    for(int i=0;i<Lists.studentsList.size();i++){
    ArrayList<Assignment> assignmentsList = new ArrayList<Assignment>();
    for(int j=0;j<Lists.assignmentsStudentList.size();j++){
    if(Lists.studentsList.get(i).getLastname().equals(Lists.assignmentsStudentList.get(j).getStudent().getLastname())){
    assignmentsList.add(Lists.assignmentsStudentList.get(j).getAssignment());
    }}
    System.out.println("Student: "+Lists.studentsList.get(i).getLastname()+" has the assignments: "+
            assignmentsList);}
        }
    public static void sortStudentsPerAssignments(){
    for(int i=0;i<Lists.assignmentsList.size();i++){
    Set <Student> studentsSet = new HashSet<Student>();
    for(int j=0;j<Lists.assignmentsStudentList.size();j++){
    if(Lists.assignmentsList.get(i).getTitle().equals(Lists.assignmentsStudentList.get(j).getAssignment().getTitle())){
    studentsSet.add(Lists.assignmentsStudentList.get(j).getStudent());
    Lists.StudentsPerAssignmentMap.put(Lists.assignmentsList.get(i), studentsSet);
    }}
//    System.out.println("Assignment: "+Lists.assignmentsList.get(i).getTitle()+" has the students: "+
//            studentsList);
//        System.out.println(Lists.StudentsPerAssignmentMap);
    }
        }
    public static void displayStudentsThatHaveToSubmitAssignments(){Scanner in=new Scanner(System.in);
        System.out.println("Please give a date. ");
//        while(in.hasNextInt()==false){
//            System.out.println("please give numerical");
//            in.next();}
//        int year=in.nextInt();
        System.out.println("Firstly, type the month:");
        while(in.hasNextInt()==false){
            System.out.println("please give numerical");
            in.next();}
        int month=in.nextInt();
        System.out.println("Type the day of the month:");
        while(in.hasNextInt()==false){
            System.out.println("please give numerical");
            in.next();}
        int day=in.nextInt();        
        LocalDateTime usersdate = LocalDateTime.of(2019, month, day,0,0);

        LocalDateTime monday = usersdate;
        while (monday.getDayOfWeek() != DayOfWeek.MONDAY)
        {
          monday = monday.minusDays(1);
        }

        LocalDateTime sunday = usersdate;
        while (sunday.getDayOfWeek() != DayOfWeek.SUNDAY)
        {
          sunday = sunday.plusDays(1);
        }
        for(Assignment as : Lists.StudentsPerAssignmentMap.keySet()){
        if(as.getLocaldatetime().isAfter(monday)&&as.getLocaldatetime().isBefore(sunday)){
            System.out.println("Student(s): "+Lists.StudentsPerAssignmentMap.get(as)+" should submit an assignment "
                    + "within the given date's week.");}}
        }
}

