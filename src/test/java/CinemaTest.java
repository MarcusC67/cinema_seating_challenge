import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import static org.junit.Assert.assertEquals;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class CinemaTest {

    /* @Ignore
    @Test
    public void t1checkIfAnySeatsAvailableAndReduceAvailableSeatsByThree() {
        // Arrange
        int expected = 12;
        // Act
        Cinema seats = new Cinema();
        // Assert
        assertEquals(expected, seats.allocateSeats(3));
    }

    @Ignore
    @Test
    public void t2checkIfCinemaFull() {
        int expected = 0;
        Cinema seats = new Cinema();
        assertEquals(expected, seats.allocateSeats(3));
    }

    @Test
    public void t3checkAllocatedSingleSeatA1() {
        String expected = "A1";
        Cinema seats = new Cinema();
        Assertions.assertEquals(expected, seats.allocateSeats(1));
    } */

    @Test
    public void t4checkAllocatedThreeSeatsA1toA3() {
        String actual;
        String expected = "A1 A2 A3";

        Cinema seats = new Cinema();
        actual = seats.allocateSeats(3);
        System.out.println("Allocated the following seats = " + actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void t5checkAllocatedTwoLotsOfThreeSeatsA1toB1() {
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

    @Test
    public void t6checkAllocateSeatsA1toC1() {
        int seatsRequired;
        String actual = null;
        String expected = "A1 A2 A3 A4 A5 B1 B2 B3 B4 B5 C1";
        int[] requested = {3, 3, 3, 2};

        Cinema seats = new Cinema();
        for (int i = 0; i <= requested.length -1; i++) {
            seatsRequired = requested[i];
            actual = seats.allocateSeats(seatsRequired);
        }
        System.out.println("Allocated the following seats = " + actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void t7checkAllocateSeatsA1toC5() {
        int seatsRequired;
        String actual = null;
        String expected = "A1 A2 A3 A4 A5 B1 B2 B3 B4 B5 C1 C2 C3 C4 C5";
        int[] requested = {3, 3, 3, 3, 3};

        Cinema seats = new Cinema();
        for (int i = 0; i <= requested.length -1; i++) {
            seatsRequired = requested[i];
            actual = seats.allocateSeats(seatsRequired);
        }
        System.out.println("Allocated the following seats = " + actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void t8checkNoSeatsAvailable() {
        int seatsRequired;
        String actual = null;
        String expected = "Sorry, no seats available!";
        int[] requested = {3, 3, 3, 3, 3, 1};

        Cinema seats = new Cinema();
        for (int i = 0; i <= requested.length -1; i++) {
            seatsRequired = requested[i];
            actual = seats.allocateSeats(seatsRequired);
        }
        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void t9heckInvalidNumberOfSeatsRequested() {
        String actual = null;
        Cinema seats = new Cinema();

        actual = seats.allocateSeats(4);
        String expected = "Sorry, number of seats requested must be between 1 and 3!";

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

}
