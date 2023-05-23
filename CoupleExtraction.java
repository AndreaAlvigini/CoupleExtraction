import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class CoupleExtraction {
    public static void main(String[] args) {
        List<String> people = new ArrayList<String>(); //fare lista già pronta
        people.add("alessandro");
        people.add("davide");
        people.add("andrea");
        people.add("simone");
        people.add("giorgio");
        people.add("cristopher");
        people.add("emanuele");
        people.add("tiziano");
        people.add("greta");
        people.add("gianluca");

        Random rand = new Random();
        //int randomNum = rand.nextInt(people.size());

        if (people.size() % 2 == 0) {
            while (!people.isEmpty()) {
                System.out.println("Una coppia è: ");
                int randomNum1 = rand.nextInt(people.size());
                String couplePerson1 = people.get(randomNum1);//semplificare utilizzando un solo randomNum1
                System.out.println(couplePerson1);
                people.remove(couplePerson1);

                int randomNum2 = rand.nextInt(people.size());
                String couplePerson2 = people.get(randomNum2);
                System.out.println(couplePerson2);
                people.remove(couplePerson2);
                System.out.println();
            }

        } else {
            while (people.size() != 3) {
                System.out.println("Una coppia è: ");
                int randomNum1 = rand.nextInt(people.size());
                String couplePerson1 = people.get(randomNum1);
                System.out.println(couplePerson1);
                people.remove(couplePerson1);

                int randomNum2 = rand.nextInt(people.size());
                String couplePerson2 = people.get(randomNum2);
                System.out.println(couplePerson2);
                people.remove(couplePerson2);
                System.out.println();
            }

            System.out.println("il trio sarà composto da: ");
            for (String person : people) {
                System.out.println(person);
            }
        }

    }

}
