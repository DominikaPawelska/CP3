

public class InternetDevice
{
    String name;
    boolean connected;
    static int connectedDevices;
    
    InternetDevice(String name){
        this.name=name;
        System.out.println(name);
        
    }
    void connect(){
        boolean connected=true;
        
    }
    void disconnect(){
        boolean connected=false;
        
    }
    void isConnected(){
        if ( connected==true); {
            System.out.println("Device is connected");
        }
            
            
            
        }
    static void displayConnections(){
        System.out.println(connectedDevices);
        
    }
    }
    
        
        
        
        
        
    
    
    

