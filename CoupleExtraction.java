import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class CoupleExtraction {
    public static void main(String[] args) {

        List<String> people = new ArrayList<String>();
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

        System.out.println("Le coppie sono:");

        if (people.size() % 2 == 0) {
            while (!people.isEmpty()) {
                pickCouples(people);
            }

        } else {
            while (people.size() != 3) {
                pickCouples(people);
            }

            System.out.println("Il trio sarà composto da: ");

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
