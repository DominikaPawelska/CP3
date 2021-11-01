

public class CinemaTicket
{
    static String cinema_name = "Cinema City" ;
    String filmTitle;
    int row;
    int seat;
    float price;
    
     void  displayTicketData(){
        System.out.println("name: " + cinema_name+ " film title: "+filmTitle+ " row: "+
        row+ " seat: "+ seat + " price: " +price);}
        
      public static void main(  String[] args){
          CinemaTicket ticket= new CinemaTicket("Madagastar",3,6,26f);
     
      }
      CinemaTicket(String filmTitle,int row, int seat, float price){
          this.filmTitle=filmTitle;
          this.row=row;
          this.seat=seat;
          this.price=price;
          
          
      }
    }

