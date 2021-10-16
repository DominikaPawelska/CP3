

public class Lamp
{
    boolean isOn;
    
    void switchOn(){
        isOn=true;
        
    }
    void switchOff(){
        isOn=false;
    }
    void displayStatus(){
        if (isOn==true){
            System.out.println("The lamp is on!");
        }
        else{
            System.out.println("The lamp is off!");
        }
    }
    
    

    
    
    
    
}
