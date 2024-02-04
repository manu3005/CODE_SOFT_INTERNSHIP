import java.util.Scanner;
public class Student_Grade_Calculator {
        public static void main(String[] args) {
            int count;
             int i;
            float totalMark = 0;
                    float percentage;
                    float average;
           Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Number of Subject");
            count = scanner.nextInt();

            System.out.println("Enter Marks of " + count + " Subject");
            for (i = 0; i < count; i++) {
                totalMark += scanner.nextInt();
            }
            System.out.println("Total MArks : " + totalMark);
            percentage = (totalMark / (count * 100)) * 100;

            switch ((int) percentage / 10) {
                case 8:
                    System.out.println("Grade : A+");
                    break;
                case 7:
                    System.out.println("Grade : A");
                    break;
                case 6:
                    System.out.println("Grade : B");
                    break;
                case 5:
                    System.out.println("Grade : C");
                    break;
                default:
                    System.out.println("Grade : D");
                    break;
            }
        }

}
