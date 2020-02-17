/**
 * Akash and Vishal are quite fond of travelling. They mostly travel by railways. They were travelling in a train one day and they got interested in the seating arrangement of their compartment. The compartment looked something like
 * <p>
 * Seating Arrangement image address : https://he-s3.s3.amazonaws.com/media/uploads/a2e0794.jpg
 * <p>
 * So they got interested to know the seat number facing them and the seat type facing them. The seats are denoted as follows :
 * <p>
 * Window Seat : WS
 * Middle Seat : MS
 * Aisle Seat : AS
 * <p>
 * You will be given a seat number, find out the seat number facing you and the seat type, i.e. WS, MS or AS.
 * <p>
 * INPUT
 * First line of input will consist of a single integer T denoting number of test-cases. Each test-case consists of a single integer N denoting the seat-number.
 * <p>
 * OUTPUT
 * For each test case, print the facing seat-number and the seat-type, separated by a single space in a new line.
 * <p>
 * CONSTRAINTS
 * 1<=T<=105
 * 1<=N<=108
 * SAMPLE INPUT
 * 2
 * 18
 * 40
 * SAMPLE OUTPUT
 * 19 WS
 * 45 AS
 */

package basicproblems.inputoutput;

import javafx.util.Pair;

import java.util.Scanner;

public class SeatingArrangement {
    private int remainder;

    public Pair<Integer, String> findSeatingArrangement(int seatNumber) {
        remainder = seatNumber % 12;
        int facingSeatNumber = findFacingSeat(seatNumber);
        String facingSeatType = findSeatType(remainder);
        return new Pair<>(facingSeatNumber, facingSeatType);
    }

    public int findFacingSeat(int seatNumber) {
        if (remainder != 0)
            return seatNumber + (2 * (6 - remainder) + 1);
        else
            return seatNumber - 11;
    }


    public String findSeatType(int remainder) {
        String windowSeat = "WS";
        String middleSeat = "MS";
        String aisleSeat = "AS";

        if (remainder != 0) {
            int typeIndex = remainder % 3;
            switch (typeIndex) {
                case 2:
                    return middleSeat;
                case 1:
                    if ((remainder % 4) % 2 == 0)
                        return aisleSeat;
                    else
                        return windowSeat;
                case 0:
                    if ((remainder % 4) % 2 == 0)
                        return windowSeat;
                    else
                        return aisleSeat;
                default:
                    return "NA";
            }
        } else
            return windowSeat;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        SeatingArrangement seatingArrangementFinder = new SeatingArrangement();

        //System.out.println("Enter the number of passengers");
        int numberOfPassengers = input.nextInt();
        int[] seatNumbers = new int[numberOfPassengers];

        //System.out.println("Enter the Seat Numbers");
        for (int i = 0; i < numberOfPassengers; i++) {
            seatNumbers[i] = input.nextInt();
        }

        for (int seatNumber : seatNumbers) {
            Pair seatingArrangement = seatingArrangementFinder.findSeatingArrangement(seatNumber);
            System.out.println(seatingArrangement.getKey() + " " + seatingArrangement.getValue());
        }

    }
}