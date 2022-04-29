public class Cinema {

    private int seatsAvailable;
    private String returnStr;

    int row = 1;
    int seat = 1;
    int j = 0;

    // constructor
    public Cinema() {
        this.seatsAvailable = 15;
        String rows = "ABC";
    }

    public String allocateSeats(int seatsRequested) {

        StringBuilder seatsBooked = new StringBuilder();
        String str = null;

        if (seatsAvailable == 0) {
            return "Sorry, no seats available!";
        } else {

            // loop through each requested seat 1-3
            for (int i = 0; i < seatsRequested; i++) {
                j++;
                str = String.valueOf(seatsBooked.append(allocateEachSeat(row, j)).append(" "));
                str = str.substring(0, str.length() - 1); // strip out last space
                seatsAvailable--;
            }
        }
        return str; // return string of all booked seats
    }

    public String allocateEachSeat(int row, int seat) {

        char rowLetter = "ABC".charAt(row-1);

        if (seat == 5) {
            row ++;
            seat = 1;
            returnStr = rowLetter + String.valueOf(seat);
        } else {
            returnStr = rowLetter + String.valueOf(seat);
            seat ++;
        }
        return returnStr; // return individual row and seat eg: A1
    }
}
