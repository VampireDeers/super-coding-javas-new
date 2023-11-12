package chapter1_13;

public class ChuncheonTicketMission {

    public static void main(String[] args){
        int PEOPLE_NUMBER = 4;

        int kimTicket = 3000;
        int parkTicket = 9000;
        int leeTicket = 2000;
        int hongTicket = 2000;

        double average = (kimTicket + parkTicket + leeTicket + hongTicket) / PEOPLE_NUMBER;
        System.out.println(average);
    }
}
