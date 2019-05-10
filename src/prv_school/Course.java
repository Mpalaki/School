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
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Makis
 */
public class Course {
    
    private String title;
    private String stream;
    private String type;
    private LocalDate startdate;
    private LocalDate enddate;

    public Course(String title, String stream, String type, int syear, int smonth, int sday, int eyear, int emonth, int eday) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.startdate = LocalDate.of(2019, smonth, smonth);
        this.enddate = LocalDate.of(2019, emonth, emonth);
    }

    public Course(String title, String stream, String type) {
        this.title = title;
        this.stream = stream;
        this.type = type;
    }

    public Course(String title) {
        this.title = title;
    }    

    public String getTitle() {
        return title;
    }

    public String getStream() {
        return stream;
    }

    public String getType() {
        return type;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public void setStartdate(int year, int month, int day) {
        this.startdate = LocalDate.of(2019, (month>0&& month<13)?month:1, (day>0&& day<32)?day:1);
    }

    public void setEnddate(int year, int month, int day) {
        this.enddate = LocalDate.of(2019, (month>0&& month<13)?month:1, (day>0&& day<32)?day:1);
    }

   
    public void setTitle(String title) {
        this.title = title;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public void setType(String type) {
        this.type = type;
    }    

    @Override
    public String toString() {
        return "Course{" + "title=" + title + ", stream=" + stream + ", type=" + type + ", start date=" + startdate +""
                + " end date: "+ enddate  + '}';
    }
    public static void getCoursesFromUser(){
    Scanner in=new Scanner(System.in);

        System.out.println("How many courses you want to insert?");
        while(!in.hasNextInt()){
            System.out.println("Please insert number");
        in.next();} 
        int num = in.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Give next course's title:");                       
            String s1 = in.next();
            Course co = new Course(s1);
            co.setTitle(s1);
            System.out.println("Give course's stream. Insert either 'Java' or 'C#':");
            String s2 = in.next();
            while(!s2.equals("Java")&& !s2.equals("C#")){
            System.out.println("Insert either 'Java' or 'C#'");
            s2=in.next();}
            co.setStream(s2);
            System.out.println("What is the type of the course? full time or part time?");
            String s3=in.next();
            while(!s3.equals("full")&& !s3.equals("part")){
            System.out.println("Insert either 'full' or 'part'");
            s3=in.next();}
            co.setType(s3);
            
            System.out.println("Give start's date month(type number between 1-12): ");
            while(in.hasNextInt()==false){
            System.out.println("please give numerical");
            in.next();}
            int s4=in.nextInt();
            System.out.println("Give start's date day of month: ");
            while(in.hasNextInt()==false){
            System.out.println("please give numerical");
            in.next();}
            int s5=in.nextInt();
            co.setStartdate(2019,s4, s5);
            
            System.out.println("Give end's date month(type number between 1-12): ");
            while(in.hasNextInt()==false){
            System.out.println("please give numerical");
            in.next();}
            int s6=in.nextInt();
            System.out.println("Give end's date day of month: ");
            while(in.hasNextInt()==false){
            System.out.println("please give numerical");
            in.next();}
            int s7=in.nextInt();
            co.setEnddate(2019,s6, s7);
            
            
            Lists.coursesList.add(co);
            
        }System.out.println(Lists.coursesList);
    
}
    
    public static void useSyntheticCourses(){
    Course c1=new Course("BC7jf","Java","full",2019,2,20,2019,5,18);
    Lists.coursesList.add( c1);
    Course c2=new Course("BC8cp","C#","part",2019,3,20,2019,9,18);
    Lists.coursesList.add( c2);
    Course c3=new Course("BC8cf","C#","full",2019,3,20,2019,6,18);
    Lists.coursesList.add( c3);
        System.out.println(Lists.coursesList);
    }
    
    
}