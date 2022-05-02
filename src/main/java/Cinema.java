public class Cinema {

    private String str;
    private int seatsAvailable;
    String returnStr;

    private int j = 0;
    int newRow = 0;
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

           // loop through requested seats 1-3
           for (int k = 0; k < seatsRequested; k++) {
               j++;
               str = String.valueOf(seatsBooked.append(allocateOneSeat(newRow, j)).append(" "));
               seatsAvailable--;
            }
        }
        str = str.substring(0, str.length() - 1); // strip out last space
        return str; // return string of all booked seats
    }

    public String allocateOneSeat(int row, int seat) {

        // if last seat in row, update row to next row eg: A to B, B to C
        if (seat == 5) {
            returnStr = rowLetter + String.valueOf(seat);

            if (seatsAvailable != 1)
                newRow = row + 1;
                rowLetter = rows.charAt(newRow);
                seat = 1;
                j = 0;

        } else {
            // set return string to allocated row and seat eg: A1
            returnStr = rowLetter + String.valueOf(seat);
            seat ++;
        }
        return returnStr; // return allocated row and seat eg: A1
    }

}
