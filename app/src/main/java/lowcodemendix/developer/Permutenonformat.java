package lowcodemendix.developer;

import java.util.HashSet;

import java.util.Set;

public class Permutenonformat {
    public static void permute(char[] x, int start, int end) {
        if (start == end) {
            for (int i = 0; i < end; i++) {
                System.out.print(x[i]);
            }
            System.out.println();
            
        }

        
        Set<Character> seen = new HashSet<>();
        for (int i = start; i < end; i++) {
            if (seen.contains(x[i])) {
                continue; // ข้ามถ้าเจอตัวอักษรซ้ำ
            }
            seen.add(x[i]); // เก็บตัวอักษรที่เห็นแล้ว

            swap(x, start, i); // ทำการสับเปลี่ยน
            permute(x, start + 1, end); // การเรียกฟังก์ชันตัวเอง
            swap(x, start, i); // สลับกลับหลังจากการเรียกฟังก์ชันตัวเอง
        }
    }

    private static void swap(char[] x, int a, int b) {
        char temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

}
