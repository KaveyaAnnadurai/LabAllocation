import java.util.Scanner;

public class LabAllocationToStudents {
    public static void main(String[] args) {
        int n, minimumDifference = Integer.MAX_VALUE,correctLab=0;
        int[] noOfSystems = new int[3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter systems in lab1:");
        noOfSystems[0] = scanner.nextInt();
        System.out.println("Enter systems in lab2:");
        noOfSystems[1] = scanner.nextInt();
        System.out.println("Enter systems in lab3:");
        noOfSystems[2] = scanner.nextInt();
        System.out.println("Enter number of students:");
        n=scanner.nextInt();

        for(int iterator : noOfSystems){
            if(iterator > n && minimumDifference > (iterator - n)){
                minimumDifference = iterator - n;
                correctLab = iterator;
            }
        }
        if(correctLab == noOfSystems[0])
            System.out.println("The correct lab is L1");
        else if (correctLab == noOfSystems[1])
            System.out.println("The correct lab is L2");
        else System.out.println("The correct lab is L3");

    }
}