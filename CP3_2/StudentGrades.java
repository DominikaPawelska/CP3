
import java.util.*;
public class StudentGrades{
    String studentName;
    double[] grades;
    double lowest;
    double highest;
    float av;
    
    
    
    StudentGrades(String name, double[] grades){
        this.studentName=name;
        this.grades=grades;
    }
    public double lowestGrade(){
        int n = grades.length ;
        Arrays.sort(grades);
        double lowest=grades[0];
        return lowest;
        }
    public double highestGrade(){
        int n = grades.length ;
        Arrays.sort(grades);
        double highest=grades[n-1];
        return highest;
    }
    public double average(){
        int i;
        int n = grades.length;
        int sum=0;
        for (i=0; i<n; i++){
            sum +=grades[i];
            
        }
        float av=(sum/ n);
        return av;
        
    }
    public void display(){
        System.out.println(studentName+" "+grades+ " "+av+" "+lowest);
    }
    }
    
        
          
    
    
    






    
    

