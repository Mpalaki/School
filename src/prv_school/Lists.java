/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prv_school;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Makis
 */
public class Lists {
    public static ArrayList<Student> studentsList = new ArrayList<Student>(); 
    public static ArrayList<Trainer> trainersList = new ArrayList<Trainer>(); 
    public static ArrayList<Course> coursesList = new ArrayList<Course>(); 
    public static ArrayList<Assignment> assignmentsList = new ArrayList<Assignment>(); 
    public static ArrayList<StudentsCourse> studentsCourseList = new ArrayList<StudentsCourse>(); 
    public static ArrayList<TrainersCourse> trainersCourseList = new ArrayList<TrainersCourse>(); 
    public static ArrayList<AssignmentsCourse> assignmentsCourseList = new ArrayList<AssignmentsCourse>(); 
    public static ArrayList<AssignmentsStudent> assignmentsStudentList = new ArrayList<AssignmentsStudent>(); 
    public static HashMap<Assignment,Set<Student>> StudentsPerAssignmentMap = new HashMap<Assignment,Set<Student>>();


}
