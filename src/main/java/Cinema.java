public class Cinema {

    private int seatsRequested;

    int[][] allSeats = { // allSeats 0 if available, 1 if booked
            {'0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
    };

    // constructor
    public Cinema() {

        int row = 1;
        int seat = 1;
        int seatsAvailable = 15;

    }

    public int allocateSeats(int seatsRequested, int seatsAvailable) {

        this.seatsRequested = seatsRequested;

        if (seatsAvailable == 0);
            // return "Sorry, no seats available!";
        else
            for (int i =0; i < seatsRequested; i++) {
                seatsAvailable--;
            }
        return seatsAvailable;
    }

}
