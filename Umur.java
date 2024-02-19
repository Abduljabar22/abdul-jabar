import java.time.Year;
import java.util.Scanner;

    public class Umur {
    
        private static Scanner inputYearBorn;

        public static void main(String[] args) {
            System.out.print("Year born : ");
            inputYearBorn = new Scanner(System. in);
            Integer yearBorn = inputYearBorn.nextInt();
            Integer yearNow = Year.now().getValue();

            System.out.println("Your old are " + (yearNow - yearBorn));
    }
}