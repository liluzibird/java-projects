package m14;

public class ParkingTicketSimulator {

    public static void main(String[] args) {
        ParkingTicket t = new ParkingTicket("Toyota","Camry","Brown","1234",120);
        if(t.getMinutes()>=60)
            System.out.println(t);
        else
            System.out.println("No tickets assigned.");
    }

}