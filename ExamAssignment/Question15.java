//Implement a program to reverse an array without using extra Array.

import java.util.ArrayList;
import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<>();
        

        System.out.println("Enter the number of element you want in an array: ");
        int n=scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter Element"+(i+1)+" : ");
            int element=scanner.nextInt();
            arrayList.add(element);
        }
        System.out.println("ArrayList before reverse order!!");
        for(int i:arrayList)
        {
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("ArrayList after reverse order!!");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arrayList.get(i)+" ");
        }
        scanner.close();
    }
}
