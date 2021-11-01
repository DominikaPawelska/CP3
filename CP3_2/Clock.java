

public class Clock
{
    static int hour;
    static int minutes;
    static int alarmM;
    static int alarmH;
    
    Clock(){
        
        this.hour=00;
        this.minutes=00;
         }
    
    
    
    public static void main(String[] args) {
    Clock time = new Clock();
    String sMinutes= String.format("%02d",time.minutes);
    String sHours= String.format("%02d",time.hour);
    
    System.out.println(sHours+":"+sMinutes);
    
    
    
    }
    Clock(int hour,int minutes){
        
        this.hour=hour;
        this.minutes=minutes;
         }
         
    public static void setClock(int alarmH,int alarmM){
        Clock time = new Clock();
        
        
    }
    public  void setClock(){
        Clock time= new Clock();
        String sMinutes= String.format("%02d",time.minutes);
        String sHours= String.format("%02d",time.hour);
    
        System.out.println(sHours+":"+sMinutes);
        
    }
    
    
    public static void displayTime(){
        String h=String.format("%02d",hour);
        String m=String.format("%02d",minutes);
        System.out.println(h+":"+m);
    }
    void addOneMinute(){
        minutes=minutes+1;
    }
    public static void setAlarm(int hour, int minutes){
        Clock alarm = new Clock();
        
    }
    void runAlarm(){
        if (alarmH ==minutes && alarmH==hour){
            System.out.println("beep-beep-beep");
            
        }
        
    }
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
         
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    
    
    
        
    

