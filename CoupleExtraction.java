import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CoupleExtraction
{
    public static void main(String[] args) {

        //List <String> people = Arrays.asList(new String[] {"alessandro", "davide", "andrea", "simone", "giorgio", "cristopher", "emanuele", "tiziano","greta", "gianluca"});
        
        List<String> people = new ArrayList<String>(); //fare lista già pronta
        people.add("Alessandro");
        people.add("Davide");
        people.add("Andrea");
        people.add("Simone");
        people.add("Giorgio");
        people.add("Cristopher");
        people.add("Emanuele");
        people.add("Tiziano");
        people.add("Greta");
        people.add("Gianluca");
        
        Random rand = new Random();
        int randomNum = rand.nextInt(people.size());

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
