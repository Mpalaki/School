/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prv_school;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Makis
 */
public class AssignmentsCourse {
    private Assignment assignment;
    private Course course;

    public AssignmentsCourse(Assignment assignment, Course course) {
        this.assignment = assignment;
        this.course = course;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public Course getCourse() {
        return course;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "AssignmentsCourse{" + "assignment=" + assignment + ", course=" + course + '}';
    }
    
    public static void addAssignmentsToCourse(){   

    Scanner in=new Scanner(System.in);
    for(int i=0;i<Lists.coursesList.size();i++){
        System.out.println("Please select Assignments who will be assigned in course: "
        + Lists.coursesList.get(i).getTitle()+", by typing their title. List of Assignments: "
        +Lists.assignmentsList.toString()+". When you want to stop selecting, please type 'stop'.");
        String answer=in.next();
        while(!answer.equals("stop")){
            for(int j=0;j<Lists.assignmentsList.size();j++){
                if(Lists.assignmentsList.get(j).getTitle().equals(answer)){
                    AssignmentsCourse ac=new AssignmentsCourse(Lists.assignmentsList.get(j),Lists.coursesList.get(i));
                    Lists.assignmentsCourseList.add(ac);
                    
                    }
            }answer=in.next();
        }
            }
    System.out.println(Lists.assignmentsCourseList);
}        
    public static void displayAssignmentsPerCourse(){
      for(int i=0;i<Lists.coursesList.size();i++){
      ArrayList<Assignment> assignmentsList = new ArrayList<Assignment>();
        for(int j=0;j<Lists.assignmentsCourseList.size();j++){
            if(Lists.coursesList.get(i).getTitle().equals(Lists.assignmentsCourseList.get(j).getCourse().getTitle())){
            assignmentsList.add(Lists.assignmentsCourseList.get(j).getAssignment());}
        }
        System.out.println(Lists.coursesList.get(i).getTitle()+" Assignments: "+ assignmentsList);

      }

    }
    
}
