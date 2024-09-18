package week8;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex9 {
    public static void main(String[] args) {
        // Create a few registration plates
        RegistrationPlate reg1 = new RegistrationPlate("ABC-123", "FI");  // Finland plate
        RegistrationPlate reg2 = new RegistrationPlate("UXE-465", "FI");  // Finland plate
        RegistrationPlate reg3 = new RegistrationPlate("B WQ-431", "D");  // Germany plate

        // Store them in an ArrayList
        ArrayList<RegistrationPlate> finnish = new ArrayList<>();
        finnish.add(reg1);
        finnish.add(reg2);

        // Create a new plate that should match reg1
        RegistrationPlate newPlate = new RegistrationPlate("ABC-123", "FI");

        // Check if the new plate is already in the list
        if (!finnish.contains(newPlate)) {
            finnish.add(newPlate);  // It won't be added because equals and hashCode are implemented
        }

        // Print the list of Finnish plates
        System.out.println("Finnish: " + finnish);

        // Create a HashMap to store the owners of registration plates
        HashMap<RegistrationPlate, String> owners = new HashMap<>();
        owners.put(reg1, "Arto");
        owners.put(reg3, "Jürgen");

        // Retrieve owners based on the registration plate
        System.out.println("Owners:");
        System.out.println(owners.get(new RegistrationPlate("ABC-123", "FI")));  // Should print Arto
        System.out.println(owners.get(new RegistrationPlate("B WQ-431", "D")));  // Should print Jürgen
    }
}

class RegistrationPlate {
    private final String regCode;  // registration code
    private final String country;  // country of the plate

    public RegistrationPlate(String regCode, String country) {
        this.regCode = regCode;
        this.country = country;
    }

    // Override equals method to compare regCode and country
    @Override
    public boolean equals(Object obj) {
        // If the object is the same, return true
        if (this == obj) {
            return true;
        }
        // If the object is null or not of the same class, return false
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // Cast the object to RegistrationPlate and compare regCode and country
        RegistrationPlate other = (RegistrationPlate) obj;
        return this.regCode.equals(other.regCode) && this.country.equals(other.country);
    }

    // Override hashCode method to generate a hash based on regCode and country
    @Override
    public int hashCode() {
        // Use prime number 31 and combine hash codes of regCode and country
        return 31 * regCode.hashCode() + country.hashCode();
    }

    // Override toString to provide a readable format for printing plates
    @Override
    public String toString() {
        return country + " " + regCode;
    }
}
