import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class CinemaTest {
    
    @Test
    public void checkIfAnySeatsAvailableAndReduceAvailableSeatsByThree() {
        // Arrange
        int expected = 12;
        // Act
        Cinema seats = new Cinema();
        // Assert
        assertEquals(expected, seats.allocateSeats(3));
    }

}
