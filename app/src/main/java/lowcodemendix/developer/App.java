package lowcodemendix.developer;

import java.util.Scanner;
import java.util.List;


public class App {
    public static void main(String[] args) {
        /////////////////ข้อที่ 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string for permutation: ");
        String input = scanner.nextLine(); // อ่านข้อมูลสตริงจากผู้ใช้
        // String[] s={"aabb"};
        // char[] characters = s[0].toCharArray(); // แปลง String แรกในอาร์เรย์ s เป็น char array
        char[] characters = input.toCharArray();
        List<String> permutations = PermutationGenerator.permute(characters, 0, characters.length);
        
        // แสดงOutput
        System.out.println(permutations);
        
        //Firstpurmute
        // char[] characters2 = {'a','b'};
        // Permutenonformat.permute(characters2, 0, characters2.length);

        ///////////////ข้อที่2
        System.out.println("------Ans2------");
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter the number of elements for the array: ");
        int n = scanner.nextInt();
        int[] input2 = new int[n];
        // int input2[] ={1,2,2,3,3,3,4,3,3,3,2,2,1}; example no.13: 1 2 2 3 3 3 4 3 3 3 2 2 1 ans=4
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            input2[i] = scanner2.nextInt();
        }

        FindTheOddInt.FindTheOdd(input2);
            
        
        
        scanner.close();
        scanner2.close();
    }
}
