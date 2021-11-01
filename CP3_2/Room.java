

public class Room{
    int number;
    int number_of_beds;
    boolean occupied;
    String guest;
    String[] list;
    
    Room(int number){
        this.number=number;
        this.number_of_beds=2;
        
    }
    Room(int number, int number_of_beds){
        this.number=number;
        this.number_of_beds=number_of_beds;    
    }
    public String checkIn(String newGuest){
        guest=newGuest;
        return guest;
        
        
        
    }
    public boolean checkOut(){
        boolean occupied=false;
        return occupied;
    }
    public boolean isOccupied(){
        boolean occupied=true;
        return occupied;
    }
    public void displayStatus(){
        System.out.println(number+" " +number_of_beds+" "+occupied+" " +guest);
        
    }
    void displayReport(Room[] roomList) {
        
       
    }
}
        
    

    
    
