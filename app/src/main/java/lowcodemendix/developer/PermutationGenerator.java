package lowcodemendix.developer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationGenerator {
    public static List<String> permute(char[] x, int start, int end) {
        List<String> result = new ArrayList<>();

        if (start == end) {
            result.add(new String(x));
            return result;
        }

        Set<Character> seen = new HashSet<>();
        for (int i = start; i < end; i++) {
            if (seen.contains(x[i])) {
                continue; // ข้ามถ้าเจอตัวอักษรซ้ำ
            }
            seen.add(x[i]); // เก็บตัวอักษรที่เห็นแล้ว

            swap(x, start, i); // ทำการสับเปลี่ยน
            result.addAll(permute(x, start + 1, end)); // รวมผลลัพธ์จากการเรียกฟังก์ชันตัวเอง
            swap(x, start, i); // สลับกลับหลังจากการเรียกฟังก์ชันตัวเอง
        }
        return result;
    }

    private static void swap(char[] x, int a, int b) {
        char temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }
}
