package week10;

import week10.Ex29;
import week10.Ex29_1;
import week10.Ex29_2;
import java.util.ArrayList;
import java.util.List;

public class Ex29_test {
    public static void main(String[] args) {
        Ex29 pekka = new Ex29_2("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Ex29 esko = new Ex29_2("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki", 5400);
        System.out.println(pekka);
        System.out.println(esko);

        Ex29_1 olli = new Ex29_1("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        for (int i = 0; i < 25; i++) {
            olli.study();
        }
        System.out.println(olli);

        List<Ex29> people = new ArrayList<>();
        people.add(pekka);
        people.add(olli);
        printDepartment(people);
    }

    public static void printDepartment(List<Ex29> people) {
        for (Ex29 person : people) {
            System.out.println(person);
        }
    }
}
