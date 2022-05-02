public class Cinema {

    private String str;
    private int seatsAvailable;
    String returnStr;

    private int j = 0;
    int row = 0;
    int seat = 0;
    char rowLetter = 'A';
    String rows = "ABC";

    StringBuilder seatsBooked = new StringBuilder();

    // constructor
    public Cinema() {
        this.seatsAvailable = 15;
    }

    public String allocateSeats(int seatsRequested) {

        if (seatsAvailable == 0) {
            return "Sorry, no seats available!";
        } else {

           // loop through each requested seat 1-3
           for (int k = 0; k < seatsRequested; k++) {
               j++;
               // row is 0 - need update row - call method set row
               str = String.valueOf(seatsBooked.append(allocateOneSeat(row, j)).append(" "));
               seatsAvailable--;
            }
        }
        str = str.substring(0, str.length() - 1); // strip out last space
        return str; // return string of all booked seats
    }

    public String allocateOneSeat(int row, int seat) {

        if (seat == 5) {
            returnStr = rowLetter + String.valueOf(seat);
            row ++;
            rowLetter = rows.charAt(row);
            seat = 1;
            j = 0;
        } else {
            returnStr = rowLetter + String.valueOf(seat);
            seat ++;
        }
        return returnStr; // return individual row and seat eg: A1
    }

}
