package Login;

import java.util.Random;
import java.util.Scanner;

public class User {

    String persName;
    String persSurname;

    public User(String persName, String persSurname) {
        this.persName = persName;
        this.persSurname = persSurname;
    }

    public static String password(int count) {
        String ALPHABET = "qwertyuiopasdfghjklzxcvbnm123456789";
        Random rnd = new Random();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; ++i) {
            sb.append(ALPHABET.charAt(rnd.nextInt(ALPHABET.length())));
        }
        return sb.toString();
    }

    public static String deptSelected() {
        Scanner scan = new Scanner(System.in);

        System.out.println("pasirinkite darbuotojo skyriu");
        System.out.println("[1]Pardavimai " + "[2]Marketingas " + "[3]Sandelis " + "[4]Gamyba");
        int dpt = scan.nextInt();
        String department = "bedarbis";
        if (dpt == 1) {
            department = "Pardavimai";

        } else if (dpt == 2) {
            department = "Marketingas";

        } else if (dpt == 3) {
            department = "Sandelis";

        } else if (dpt == 4) {
            department = "Gamyba";

        } else {
            System.out.println("klaida");

        }


        return department;
    }




}

