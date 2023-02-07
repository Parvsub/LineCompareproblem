package Com.LineComparisonProblem;

import java.util.Scanner;

public class Equalityusingcomparemethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of x and y for co-ordinate (x1,x2) (y1,y2):");
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.println("Enter value of x and y for co-ordinate (x3,x4) (y3,y4):");
        double x3 = scanner.nextDouble();
        double x4 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        double Length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("The length between two points:" + Length1);

        double Length2 = Math.sqrt((x3 - x4) * (x3 - x4) + (y4 - y3) * (y4 - y3));
        System.out.println("The length between two points:" + Length2);

        System.out.println(Double.compare(Length1, Length2));
    }
}