package jamesbarclay;

public class Worker {

    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private int IdNumber;
    private String phoneNumber;


    public Worker(String firstName, String lastName, int age,
                  String email, int IdNumber, String phoneNumber) {


        if (phoneNumber == null || phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("Phone number cannot be empty");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.IdNumber = IdNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public int getIdNumber() {
        return IdNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdNumber(int IdNumber) {
        this.IdNumber = IdNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;

        if (phoneNumber == null || phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("Phone number cannot be empty");
        }
    }
    // Custom Method #1
    // Returns the worker's full name
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Custom Method #2
    // Checks if the worker is an adult
    public boolean isAdult() {
        return age >= 18;
    }
}