import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class PrintArraywithoutAbsenteesimple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Main array size: ");
        int mainSize = scanner.nextInt();
        int[] mainArray = new int[mainSize];
        System.out.println("Enter main array elements:");
        for (int i = 0; i < mainSize; i++) {
            mainArray[i] = scanner.nextInt();
        }

        System.out.print("Absentees array size: ");
        int absSize = scanner.nextInt();
        Set<Integer> absentees = new HashSet<>();
        System.out.println("Enter absentees:");
        for (int i = 0; i < absSize; i++) {
            absentees.add(scanner.nextInt());
        }

        scanner.close();

        System.out.println("\nPresent elements:");
        for (int element : mainArray) {
            if (!absentees.contains(element)) {
                System.out.println(element);
            }
        }
    }
}