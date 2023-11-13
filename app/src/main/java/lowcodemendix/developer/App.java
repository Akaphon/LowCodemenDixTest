package lowcodemendix.developer;

import java.util.Scanner;
import java.util.List;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string for permutation: ");
        String input = scanner.nextLine(); // อ่านข้อมูลสตริงจากผู้ใช้
        // String[] s={"aabb"};
        // char[] characters = s[0].toCharArray(); // แปลง String แรกในอาร์เรย์ s เป็น char array
        char[] characters = input.toCharArray();
        List<String> permutations = PermutationGenerator.permute(characters, 0, characters.length);
        scanner.close();
        // แสดงOutput
        System.out.println(permutations);
        
        //Firstpurmute
        // char[] characters2 = {'a','b'};
        // Permutenonformat.permute(characters2, 0, characters2.length);

    }
}
