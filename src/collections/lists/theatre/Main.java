package collections.lists.theatre;

public class Main {
    public static void main(String[] args) {


        Theatre theatre = new Theatre("Olympian", 8, 12);
//        theatre.getSeats();

        checkTheSeatAndPayIfOK(theatre, "H11");
        checkTheSeatAndPayIfOK(theatre, "H11");
    }

    public static void checkTheSeatAndPayIfOK(Theatre theatre, String seatNumber) {
        if (theatre.reserveSeat(seatNumber)) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }
}
