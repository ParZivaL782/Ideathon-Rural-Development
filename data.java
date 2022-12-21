import java.io.*;
import java.time.chrono.MinguoChronology;
import java.util.*;

import javax.security.auth.x500.X500Principal;

class data

{
    public static void main(String args[]) {
        String inventory[] = {
                "artichoke",
                "aubergine (eggplant)",
                "asparagus",
                "broccoflower (a hybrid)",
                "broccoli (calabrese)",
                "brussels sprouts",
                "cabbage",
                "kohlrabi",
                "Savoy cabbage",
                "red cabbage",
                "cauliflower",
                "celery",
                "endive",
                "fiddleheads",
                "frisee",
                "fennel",
                "greens",
                "arugula",
                "bok choy",
                "chard (beet greens)",
                "collard greens",
                "kale",
                "lettuce",
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The product:");
        String requirement;
        int req_num = 0;
        requirement = sc.nextLine();
        for (int i = 0; i < inventory.length; i++) {
            if (requirement.equals(inventory[i])) {
                System.out.println("Enter the number of Desires products:");
                req_num = sc.nextInt();
                if (req_num > 500) {
                    System.out.println("Not in Stock");
                    break;
                }
            }
        }
        System.out.println("Will you be interested in future bond:\n1.yes\n2.no");
        int choice;
        choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("THe desired Product of this year 36 rupees per product:");
            System.out.println("Total :" + (36 * req_num));
        } else if (choice == 2) {
            System.out.println("THe desired Product of next year is estimated to be 49 rupees per product:");
        } else {
            System.out.println("Wrong Choice");
        }

    }
}