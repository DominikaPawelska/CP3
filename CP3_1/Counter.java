

public class Counter
{
    
    int value=0;
    void addOne(){
        ++value;
        
    }
    void substractOne(){
        --value;
    }
    void addTen(){
        value=value+10;
    }
    void substractTen(){
        value=value-10;
    }
    void displayCounter(){
        System.out.println("counter: " + value);
    }
    void resetCounter(){
        value=0;
    }
}
