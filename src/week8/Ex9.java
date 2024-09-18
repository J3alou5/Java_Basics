package week8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Ex9 {

    // RegistrationPlate class
    public static class RegistrationPlate {
        private final String regCode;
        private final String country;

        public RegistrationPlate(String regCode, String country) {
            this.regCode = regCode;
            this.country = country;
        }

        @Override
        public String toString() {
            return country + " " + regCode;
        }

        // equality of RegistrationPlate objects
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            RegistrationPlate that = (RegistrationPlate) obj;
            return regCode.equals(that.regCode) && country.equals(that.country);
        }


        @Override
        public int hashCode() {
            return Objects.hash(regCode, country);
        }
    }

    // VehicleRegister class
    public static class VehicleRegister {
        private HashMap<RegistrationPlate, String> owners;

        public VehicleRegister() {
            this.owners = new HashMap<>();
        }

        // Adds  owner
        public boolean add(RegistrationPlate plate, String owner) {
            if (owners.containsKey(plate)) {
                return false; // Registration plate already has an owner
            }
            owners.put(plate, owner); // Add new plate and owner
            return true;
        }

        // Gets registration plate
        public String get(RegistrationPlate plate) {
            return owners.get(plate);
        }

        // Deletes the registration plate and returns true if successful
        public boolean delete(RegistrationPlate plate) {
            if (owners.containsKey(plate)) {
                owners.remove(plate); // Remove the plate from the register
                return true;
            }
            return false; // Plate not found
        }

        // Prints all the owners of the registered vehicles
        public void printOwners() {
            if (owners.isEmpty()) {
                System.out.println("No owners.");
            } else {
                for (String owner : owners.values()) {
                    System.out.println(owner);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create new registration plates
        RegistrationPlate reg1 = new RegistrationPlate("ABC-123", "FI");
        RegistrationPlate reg2 = new RegistrationPlate("UXE-465", "FI");
        RegistrationPlate reg3 = new RegistrationPlate("B WQ-431", "D");

        ArrayList<RegistrationPlate> finnish = new ArrayList<>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate newPlate = new RegistrationPlate("ABC-123", "FI");
        if (!finnish.contains(newPlate)) {
            finnish.add(newPlate);
        }
        System.out.println("Finnish plates: " + finnish);

        
        VehicleRegister register = new VehicleRegister();


        register.add(reg1, "Arto");
        register.add(reg3, "Jürgen");

        // Print owner for a specific plate
        System.out.println("Owner of FI ABC-123: " + register.get(newPlate));  // Arto
        System.out.println("Owner of D B WQ-431: " + register.get(reg3));      // Jürgen

        // Remove a registration and print the result
        System.out.println("Removing FI ABC-123: " + register.delete(reg1));   // true
        System.out.println("Owner of FI ABC-123: " + register.get(reg1));      // null (after deletion)

        // Print all owners in the register
        System.out.println("All owners:");
        register.printOwners();
    }
}
