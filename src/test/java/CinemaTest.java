import org.junit.Ignore;
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
    } */

    /* @Ignore
    @Test
    public void checkIfCinemaFull() {
        int expected = 0;
        Cinema seats = new Cinema();
        assertEquals(expected, seats.allocateSeats(3));
    } */

    @Test
    public void checkAllocatedSingleSeatA1() {
        String expected = "A1";
        Cinema seats = new Cinema();
        assertEquals(expected, seats.allocateSeats(1));
    }

}
