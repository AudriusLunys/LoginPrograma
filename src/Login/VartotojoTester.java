package Login;

import java.util.Scanner;

public class VartotojoTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Iveskite vartotojo varda ir pavarde");
        User user1 = new User(scan.next(), scan.next());
        System.out.println("naujas vartotojas " + user1.persName.toString() + " " + user1.persSurname.toString());


        System.out.println("El pastas " + user1.persName.toString() + "." + user1.persSurname.toString() +
                "@" + user1.deptSelected() + ".fabrikas.com");


        user1.password(9);
        System.out.println("sugeneruotas slaptazodis " + user1.password(9).toString());

        nextAction();


    }

    public static String nextAction() {


        Scanner scan = new Scanner(System.in);

        System.out.println("pasirinkite sekanti veiksma");
        System.out.println("[1]Pakeisti vartotojo slaptazodi");
        System.out.println("[2]Pakeisti skyriu");
        System.out.println("[3]Istrinti si vartotoja ir ivesti nauja");
        String newPassword = "0";
        String action = "nieko";
        int act = scan.nextInt();
        String newDepartment = "bedarbis";

        if (act == 1) {
            System.out.println("Iveskite nauja slaptazodi");
            newPassword = scan.next();
            System.out.println("naujas slaptazodis->" + newPassword);
            System.out.println("ar norite atlikti kitus pakeitimus? y/n");


        } else if (act == 2) {
            System.out.println("Pasirinkite nauja skyriu");
            System.out.println("[1]Pardavimai " + "[2]Marketingas " + "[3]Sandelis " + "[4]Gamyba");
            int dpt = scan.nextInt();
            if (dpt == 1) {
                newDepartment = "pardavimai";
                System.out.println("pasikirtas naujas skyrius " + newDepartment);

            } else if (dpt == 2) {
                newDepartment = "Marketingas";
                System.out.println("pasikirtas naujas skyrius " + newDepartment);

            } else if (dpt == 3) {
                newDepartment = "Sandelis";
                System.out.println("pasikirtas naujas skyrius " + newDepartment);
            } else if (dpt == 4) {
                newDepartment = "Marketingas";
                System.out.println("pasikirtas naujas skyrius " + newDepartment);
            } else {
                System.out.println("klaida");

            }

        } else if (act == 3) {
            System.out.println("pakeiskite vartotojo varda ir pavarde");
            String newPersName = scan.next();
            String newPersSurname = scan.next();
            System.out.println("naujas vart " + newPersName.toString() + " " + newPersSurname.toString());
            System.out.println("Pasirinkite nauja skyriu");
            System.out.println("[1]Pardavimai " + "[2]Marketingas " + "[3]Sandelis " + "[4]Gamyba");
            int dpt = scan.nextInt();
            if (dpt == 1) {
                newDepartment = "pardavimai";
                System.out.println("pasikirtas naujas skyrius " + newDepartment);

            } else if (dpt == 2) {
                newDepartment = "Marketingas";
                System.out.println("pasikirtas naujas skyrius " + newDepartment);

            } else if (dpt == 3) {
                newDepartment = "Sandelis";
                System.out.println("pasikirtas naujas skyrius " + newDepartment);
            } else if (dpt == 4) {
                newDepartment = "Marketingas";
                System.out.println("pasikirtas naujas skyrius " + newDepartment);
            } else {
                System.out.println("klaida");

            }


        } else {
            System.out.println("klaida");

        }


        return action;
    }
}

