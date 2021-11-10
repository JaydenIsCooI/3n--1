package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String line = "--------------------------------------------------";
        String line2 = "-------------------------";
        Scanner in = new Scanner(System.in);
        System.out.print(line + "\nEnter Smaller Integer Value for Variable i :: ");
        int i = in.nextInt();
        System.out.println(line);
        System.out.print("Enter Larger Integer Value for Variable j :: ");
        int j = in.nextInt();
        System.out.println(line);
        System.out.println("                Variable i = " + i + "\n" + "           " + line2);
        System.out.println("                Variable j = " + j + "\n" + line);
        int i2 = i;
        int i3 = i;

        int k = 1;
        int numberOfCycles = 0;
        int maxCycles = 0;

        while (i2 <= j)
        {
            k--;
            i = i2;
            System.out.println("                Cycled Number : " + i + "\n" + line);
            while (k == 0)
            {
                if (i % 2 == 0)
                {
                    i /= 2;
                    System.out.print(i + " ");

                } else if (i % 2 == 1)
                {
                    i = (3 * i) + 1;
                    System.out.print(i + " ");
                }
                if (i == 1)
                {
                    k++;
                    numberOfCycles++;
                }
                numberOfCycles++;
            }
            System.out.println("\n" + "Number of Cycles :: " + numberOfCycles + "\n" + line);

            if (numberOfCycles > maxCycles)
            {
                maxCycles = numberOfCycles;
            }
            numberOfCycles = 0;
            i2++;
        }

        System.out.println("" + "\n" + line);

        System.out.println("Variable i :: " + i3);
        System.out.println("Variable j :: " + j + "\n");
        System.out.println("Maximum Cycle Length :: " + maxCycles + "\n" + line);
    }
}
