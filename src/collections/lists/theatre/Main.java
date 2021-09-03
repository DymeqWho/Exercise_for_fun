package collections.lists.theatre;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Theatre theatre = new Theatre("Olympian", 8, 12);
        checkTheSeatAndPayIfOK(theatre, "D12");
        checkTheSeatAndPayIfOK(theatre, "D12");
        checkTheSeatAndPayIfOK(theatre, "Z12");

        List<Theatre.Seat> reverseSeat = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeat);
        printList(reverseSeat);


        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);

//        checkTheSeatAndPayIfOK(theatre, "H11");
//        checkTheSeatAndPayIfOK(theatre, "H11");

//        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
//        printList(seatCopy);
//
//        seatCopy.get(1).reserve();
//        checkTheSeatAndPayIfOK(theatre, "A02");
//
//        Collections.reverse(seatCopy);
//        System.out.println("Printing seatCopy");
//        printList(seatCopy);
//        System.out.println("Printing theatre.seat");
//        printList(theatre.seats);
//
//        Collections.shuffle(seatCopy);
//        System.out.println("Printing seatCopy shuffle");
//        printList(seatCopy);
//
//        Theatre.Seat minSeat = Collections.min(seatCopy);
//        Theatre.Seat maxSeat = Collections.max(seatCopy);
//        System.out.println(minSeat.getSeatNumber() + " min seat");
//        System.out.println(maxSeat.getSeatNumber()  + " max seat");
//
//        sortList(seatCopy);
//        System.out.println("Pritning sorted seatCopy");
//        printList(seatCopy);
    }

    public static void checkTheSeatAndPayIfOK(Theatre theatre, String seatNumber) {
        char[] chars = seatNumber.toCharArray();
        int numberOver13 = Integer.parseInt(chars[1] + "" + chars[2]);
        if (theatre.reserveSeat(seatNumber)) {
            System.out.println("Please pay for " + seatNumber);
        } else if (numberOver13 >= 13 || chars[0] > 'H') {
            System.out.print("");
        } else {
            System.out.println("Sorry, seat " + seatNumber + " is already taken");
        }
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println();
        System.out.println("===============");
    }

//    public static void sortList(List<? extends Theatre.Seat> list){
//        for (int i=0; i<list.size() -1; i++){
//            for (int j = i+1; j< list.size(); j++){
//                if(list.get(i).compareTo(list.get(j))>0){
//                    Collections.swap(list, i, j);
//                }
//            }
//        }
//    }
}
