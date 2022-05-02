import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class CinemaTest {

    /* @Ignore
    @Test
    public void checkIfAnySeatsAvailableAndReduceAvailableSeatsByThree() {
        // Arrange
        int expected = 12;
        // Act
        Cinema seats = new Cinema();
        // Assert
        assertEquals(expected, seats.allocateSeats(3));
    }

    @Ignore
    @Test
    public void checkIfCinemaFull() {
        int expected = 0;
        Cinema seats = new Cinema();
        assertEquals(expected, seats.allocateSeats(3));
    }

    @Test
    public void checkAllocatedSingleSeatA1() {
        String expected = "A1";
        Cinema seats = new Cinema();
        Assertions.assertEquals(expected, seats.allocateSeats(1));
    } */

    @Test
    public void checkAllocatedThreeSeatsA1toA3() {
        String expected = "A1 A2 A3";
        Cinema seats = new Cinema();
        Assertions.assertEquals(expected, seats.allocateSeats(3));
    }

    @Test
    public void checkAllocatedTwoLotsOfThreeSeatsA1toB1() {
        int seatsRequired;
        String actual = null;
        String expected = "A1 A2 A3 A4 A5 B1";
        int[] requested = {3, 3};

        Cinema seats = new Cinema();
        for (int i = 0; i <= 1; i++) {
            seatsRequired = requested[i];
            actual = seats.allocateSeats(seatsRequired);
        }
        System.out.println("Allocated the following seats = " + actual);
        Assertions.assertEquals(expected, actual);
    }

}
