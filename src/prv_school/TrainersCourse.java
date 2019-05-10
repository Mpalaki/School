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
public class TrainersCourse {
    private Trainer trainer;
    private Course course;

    public TrainersCourse(Trainer trainer, Course course) {
        this.trainer = trainer;
        this.course = course;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public Course getCourse() {
        return course;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "TrainersCourse{" + "trainer=" + trainer + ", course=" + course + '}';
    }
    
    public static void addTrainersToCourse(){   

    Scanner in=new Scanner(System.in);
    for(int i=0;i<Lists.coursesList.size();i++){
        System.out.println("Please select Trainers who will be assigned in course: "
        + Lists.coursesList.get(i).getTitle()+", by typing their last name. List of Trainers: "
        +Lists.trainersList.toString()+". When you want to stop selecting, please type 'stop'.");
        String answer=in.next();
        while(!answer.equals("stop")){
            for(int j=0;j<Lists.trainersList.size();j++){
                if(Lists.trainersList.get(j).getLastname().equals(answer)){
                    TrainersCourse tc=new TrainersCourse(Lists.trainersList.get(j),Lists.coursesList.get(i));
                    Lists.trainersCourseList.add(tc);
                    
                    }
            }answer=in.next();
        }
            }
//    System.out.println(Lists.studentsCourseList);
}        
    public static void displayTrainersPerCourse(){
      for(int i=0;i<Lists.coursesList.size();i++){
      ArrayList<Trainer> trainersList = new ArrayList<Trainer>();
        for(int j=0;j<Lists.trainersCourseList.size();j++){
            if(Lists.coursesList.get(i).getTitle().equals(Lists.trainersCourseList.get(j).getCourse().getTitle())){
            trainersList.add(Lists.trainersCourseList.get(j).getTrainer());}
        }
        System.out.println(Lists.coursesList.get(i).getTitle()+" trainers: "+ trainersList);

      }

    }
    
}
