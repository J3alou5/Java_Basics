package week8;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex9 {

    public static void main(String[] args) {
        VehicleRegister register = new VehicleRegister();

        RegistrationPlate reg1 = new RegistrationPlate("ABC-123", "FI");
        RegistrationPlate reg2 = new RegistrationPlate("UXE-465", "FI");
        RegistrationPlate reg3 = new RegistrationPlate("B WQ-431", "D");

        register.add(reg1, "Arto");
        register.add(reg2, "Pekka");
        register.add(reg3, "Jürgen");

        register.printRegistrationPlates();
        register.printOwners();
    }
}

class RegistrationPlate {
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        RegistrationPlate that = (RegistrationPlate) obj;

        if (!regCode.equals(that.regCode)) return false;
        return country.equals(that.country);
    }

    @Override
    public int hashCode() {
        int result = regCode.hashCode();
        result = 31 * result + country.hashCode();
        return result;
    }
}

class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.containsKey(plate)) return false;
        owners.put(plate, owner);
        return true;
    }

    public String get(RegistrationPlate plate) {
        return owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (!owners.containsKey(plate)) return false;
        owners.remove(plate);
        return true;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> printedOwners = new ArrayList<>();
        for (String owner : owners.values()) {
            if (!printedOwners.contains(owner)) {
                System.out.println(owner);
                printedOwners.add(owner);
            }
        }
    }
}
