package learn;

import java.util.Scanner;

public class SeatingAvi {
	static int[] system;
    static int[] remaining;
    static Scanner sc = new Scanner(System.in);

    static void seat() {
        System.out.println("Enter the number of system:");
        int n = sc.nextInt();
        system = new int[n];
        System.out.println("Enter the number of users");
        int user = sc.nextInt();
        if (n > 0 && user > 0) {
            if (n < user) {
                User_assign(n);
                res_assign(n, user);
            }
            if (n > user) {
                User_assign(user);
            } else if (n == user) {
                system_assign(n);
            }
            display(n);

        } else
            System.out.println("Invalid input for System and user:\n1.System:" + n + "\n2.Users:" + user);

    }

    private static void res_assign(int n, int user) {
        remaining = new int[user - n];
        int count = user - n;
        System.out.println(user - n + " users waiting for the system:");
        if (delete()) {
            System.out.println(display(system.length) + " system is free now and waiting users are " + count);
            for (int i = 0; i < system.length; i++) {
                if (system[i] == 0) {
                    int r = i + 1;
                    System.out.println("Next user occupies the system: " + r);
                    system[i] = 1;
                    count--;
                }
            }
            if (count > 0) {
                System.out.println(count + " users are still waiting...");
                res_assign(0, count);
            } else
                System.out.println("All system is occupied");
        } else {
            System.out.println("No system is free...");
        }
    }


    private static boolean delete() {
        System.out.println("The users want to leave:(Y?N)");
        String ch = sc.next();
        int count = 0;
        if (ch.equalsIgnoreCase("y")) {
            System.out.println("users are leaving the system:");
            String sys = sc.next();
            String[] array = sys.split(",");
            for (int i = 0; i < system.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (i == Integer.parseInt(array[j]) - 1) {
                        system[i] = 0;
                        count++;
                        break;
                    }
                }
            }
            if (count > 0) {
                return true;
            } else
                return false;
        } else {
            System.out.println("nobody is ready to leave check for the ");
            return false;
        }
    }

    private static int display(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (system[i] == 0) {
                count++;
            }
            System.out.println(system[i]);
        }
        return count;
    }

    public static void system_assign(int n) {
        System.out.println("assign the users");
        for (int i = 0; i < n; i++) {
            system[i] = sc.nextInt();
        }
    }

    public static void User_assign(int n) {
        System.out.println("assign the users");
        for (int i = 0; i < n; i++) {
            system[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        seat();
    }
}
