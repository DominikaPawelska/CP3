
public class Student
{
    String name;
    String surname;
    int yearOfStudy;
    String studentId;
    String field;
    int age;
    boolean isValid;
    int semesterNumber;
    int avGrade;
    
    
    
    void sayHello(){
        System.out.println("hello");
        
    }
    void displayName(){
        System.out.println(name);
        
    }
    void displayAge(){
        System.out.println(age);
    
    }
    void displaySemAndGrade(){
        System.out.println(name + " "+semesterNumber + " " +avGrade);
    
    }
    void checkValidity(){
        isValid = !isValid;
        
            
            
        
    
    }
    void displayNameandVal(){
        System.out.println(name+" " +isValid);
        
    }
    
    
    
}
