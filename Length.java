package Com.LineComparisonProblem;

import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of x for co-ordinate point 1 and point 2:");
        double x1=scanner.nextDouble();
        double x2=scanner.nextDouble();
        System.out.println("Enter value of y for co-ordinate point 1 and point 2:");
        double y1=scanner.nextDouble();
        double y2=scanner.nextDouble();

        double Length = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
        System.out.println("The length between two points:" +Length);
    }
}
