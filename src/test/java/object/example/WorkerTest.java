package object.example;

//compares expected vs actual values
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

// creates tests
import jamesbarclay.Worker;
import org.testng.annotations.Test;

public class WorkerTest {

    // This test checks if the constructor correctly creates a Worker object
    @Test
    public void constructorShouldCreateWorkerWithValidData() {

        // Create a new Worker object using the constructor
        Worker worker = new Worker("James", "Barclay", 34, "JB@gmail.com",
                12345, "302-555-5555");

        // Check if values were passed into the constructor correctly
        assertEquals("James", worker.getFirstName());
        assertEquals("Barclay", worker.getLastName());
        assertEquals(34, worker.getAge());
        assertEquals(12345, worker.getIdNumber());
        assertEquals("JB@gmail.com", worker.getEmail());
        assertEquals("302-555-5555", worker.getPhoneNumber());
    }

    // This test checks that the setter methods to be able to update the Worker values
    @Test
    public void settersShouldUpdateValues() {

        // Create a Worker object with starting values
        Worker worker = new Worker("Mike", "M", 40, "Mike@gmail.com",
                54321, "222-222-2222");

        // Use setter methods to change the values
        worker.setFirstName("J");
        worker.setLastName("B");
        worker.setAge(50);
        worker.setEmail("jbs@gmail.com");
        worker.setIdNumber(11111);
        worker.setPhoneNumber("333-333-3333");

        // Verify that the values were updated
        assertEquals("J", worker.getFirstName());
        assertEquals("B", worker.getLastName());
        assertEquals(50, worker.getAge());
        assertEquals("jbs@gmail.com", worker.getEmail());
        assertEquals(11111, worker.getIdNumber());
        assertEquals("333-333-3333", worker.getPhoneNumber());
    }
    // Test custom method getFullName()
    @Test
    public void getFullNameShouldReturnFullName() {

        Worker worker = new Worker("James", "Barclay", 34,
                "jb@gmail.com", 12345, "302-555-5555");

        assertEquals("James Barclay", worker.getFullName());
    }

    // Test custom method isAdult()
    @Test
    public void isAdultShouldReturnTrueForAdult() {

        Worker worker = new Worker("James", "Barclay", 34,
                "jb@gmail.com", 12345, "302-555-5555");

        assertTrue(worker.isAdult());
    }

    // This test checks that the constructor throws an error if the phone number is empty
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void constructorShouldThrowExceptionWhenPhoneNumberIsEmpty() {

        // This should fail because the phone number is empty
        new Worker("Mike", "M", 40, "Mike@gmail.com",
                54321, "");
    }

    // This test checks that the setter method also throws an error
    // if someone tries to set the phone number to an empty value
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void setterShouldThrowExceptionWhenPhoneNumberIsEmpty() {

        // First create a Worker with a valid phone number
        Worker worker = new Worker("Mike", "M", 40, "Mike@gmail.com",
                54321, "111-111-1111");

        // This should throw an IllegalArgumentException
        worker.setPhoneNumber("");
    }

}