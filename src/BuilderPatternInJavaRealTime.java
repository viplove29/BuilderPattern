class Customer {
    // Fields of the Customer
    private final String firstName; // Required
    private final String lastName;  // Required
    private final String email;     // Optional
    private final String phone;     // Optional
    private final String address;   // Optional

    // Private constructor to enforce Builder usage
    private Customer(CustomerBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // Getters for class members
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    // Builder Class
    public static class CustomerBuilder {
        // Required fields
        private final String firstName;
        private final String lastName;

        // Optional fields
        private String email;
        private String phone;
        private String address;

        // Constructor with required fields
        public CustomerBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // Setter for 'email' in builder
        public CustomerBuilder email(String email) {
            this.email = email;
            return this;
        }

        // Setter for 'phone' in builder
        public CustomerBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        // Setter for 'address' in builder
        public CustomerBuilder address(String address) {
            this.address = address;
            return this;
        }

        // Build method to create the Customer object
        public Customer build() {
            return new Customer(this);
        }
    }

    @Override
    public String toString() {
        return "Customer {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

public class BuilderPatternInJavaRealTime {
    public static void main(String[] args) {
        // Create a Customer using the Builder pattern
        Customer customer = new Customer.CustomerBuilder("John", "Doe")
                .email("john.doe@example.com")
                .phone("123433546467")
                .address("123 Main Street, City, Country")
                .build();

        System.out.println(customer);

        // Create another Customer with only required fields
        Customer simpleCustomer = new Customer.CustomerBuilder("Alice", "Smith")
                .build();

        System.out.println(simpleCustomer);

        // Create another Customer with only required fields
        Customer thirdCustomer = new Customer.CustomerBuilder("Viplove", "Bisen").address("123 Main Street, City, Country").build();
        System.out.println(thirdCustomer);
    }
}