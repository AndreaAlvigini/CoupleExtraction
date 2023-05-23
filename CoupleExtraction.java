import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CoupleExtraction
{
    public static void main(String[] args) {

        List<String> people = new ArrayList<String>();
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

        System.out.println("Le coppie sono:");

        if (people.size() % 2 == 0) {
            while (!people.isEmpty()) {
                pickCouples(people);
            }

        } else {
            while (people.size() != 3) {
                pickCouples(people);
            }

            System.out.println("Il trio sar� composto da: ");

            for (String person : people) {
                System.out.println(person);
            }
        }

    }

    public static void pickCouples(List<String> list) {
        Random rand = new Random();

        int firstRandomNum = rand.nextInt(list.size());

        String firstPerson = list.get(firstRandomNum);
        list.remove(firstPerson);

        int secondRandomNum = rand.nextInt(list.size());

        String secondPerson = list.get(secondRandomNum);
        list.remove(secondPerson);

        System.out.println(firstPerson + " e " + secondPerson);
    }

}
