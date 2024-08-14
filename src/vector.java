import java.util.*;

class vector {
    public static void main(String args[]) {
        Vector c = new Vector();
        Scanner s = new Scanner(System.in); // CREATE OBJECT

        int n;
        String name;
        int choice;
        do {
            System.out.println("1.insert\n" +
                    "2.delete\n" +
                    "3.display\n" +
                    "Enter your choice choice");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 1; i <= 3; i++) {

                        System.out.println("Enter city");
                        name = s.next();
                        if (c.contains(name)) {
                            System.out.println("City already exist");
                        } else {
                            c.addElement(name);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter city");
                    name = s.next();
                    if (c.contains(name)) {
                        c.remove(name);
                    } else {
                        System.out.println("city doesn't exist");
                    }
                    break;
                case 3:
                    Enumeration nam = c.elements();
                    System.out.println("cities");
                    while (nam.hasMoreElements())
                        System.out.println(nam.nextElement() + " ");
                    System.out.println(" \n");
                    break;
            }// END OF SWITCH
            System.out.println("1.yes\n2.no\n");
            n = s.nextInt();
        } while (n == 1);
    }// END OF MAIN
} // END OF CLASS
