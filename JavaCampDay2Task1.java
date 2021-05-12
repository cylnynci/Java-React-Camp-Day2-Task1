/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacampday2task1;

/**
 *
 * @author Ceylan
 */
public class JavaCampDay2Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Courses course1=new Courses();
        course1.kampAdi="C#+Angular";
        course1.ögrAdi="Engin Demirog";
        
        Courses course2=new Courses();
        course2.kampAdi="JAVA+REACT";
        course2.ögrAdi="Ceylan Yoncacı";
        
        Courses [] courses={course1,course2};
        for(Courses course:courses)
        {
            System.out.println(course.kampAdi+","+course.ögrAdi);
        }
        CoursesManager courseManager=new CoursesManager();
        courseManager.selectCourse(course1);
        courseManager.selectCourse(course2);
        
                
        
        
    }
    
}
