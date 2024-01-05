package project1;

import java.util.Scanner;

public class RunProject {

    private Scanner scanner = new Scanner(System.in);
    public void runProject(){


        String s = scanner.nextLine();
        int n;

        n = Integer.parseInt(scanner.findInLine(s));

        switch (n) {
            case '1' :
                System.out.println("1");
                break;
            case '2' :
                System.out.printf("2");
                break;
        }
    }
}
