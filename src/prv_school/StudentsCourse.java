/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prv_school;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Makis
 */
public class StudentsCourse {
        private Student student;
        private Course course;

    public StudentsCourse(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public StudentsCourse() {
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "StudentsCourse{" + "student=" + student + ", course=" + course + '}';
    }
        
    public static void addStudentsToCourse(){   

    Scanner in=new Scanner(System.in);
    for(int i=0;i<Lists.coursesList.size();i++){
        System.out.println("Please select students who will be attending course: "
        + Lists.coursesList.get(i).getTitle()+", by typing their last name. List of students: "
        +Lists.studentsList.toString()+". When you want to stop selecting, please type 'stop'.");
        String answer=in.next();
        while(!answer.equals("stop")){
            for(int j=0;j<Lists.studentsList.size();j++){
                if(Lists.studentsList.get(j).getLastname().equals(answer)){
                    StudentsCourse stc=new StudentsCourse(Lists.studentsList.get(j),Lists.coursesList.get(i));
                    Lists.studentsCourseList.add(stc);                    
                    }
                
            }answer=in.next();
        }
            }
//    System.out.println(Lists.studentsCourseList);
}        
    public static void displayStudentsPerCourse(){
      for(int i=0;i<Lists.coursesList.size();i++){
      ArrayList<Student> studentsList = new ArrayList<Student>();
        for(int j=0;j<Lists.studentsCourseList.size();j++){
            if(Lists.coursesList.get(i).getTitle().equals(Lists.studentsCourseList.get(j).getCourse().getTitle())){
            studentsList.add(Lists.studentsCourseList.get(j).getStudent());}
        }
        System.out.println(Lists.coursesList.get(i).getTitle()+" students: "+ studentsList);

      }

    }
    
    public static void displayStudentsThatBelongToMoreThanOneCourses(){
    Set <Student> studentsSet = new HashSet<Student>();
    for(int i=0;i<Lists.studentsCourseList.size();i++){
    for(int j=i;j<Lists.studentsCourseList.size();j++){
    if(Lists.studentsCourseList.get(i).getStudent().getLastname().equals(Lists.studentsCourseList.get(j).getStudent().getLastname())&& i!=j){
    studentsSet.add(Lists.studentsCourseList.get(i).getStudent());
    }
    }
    }System.out.println("Students that belong to more than one course: "+studentsSet);
    
    }
}
