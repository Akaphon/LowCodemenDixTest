package lowcodemendix.developer;

public class FindTheOddInt {
    public static int FindTheOdd(int[] x) {
        int result = 0;
        // System.out.println("Initial result: " + result);

        // ใช้ XOR กับทุกตัวเลขในอาร์เรย์
        for (int num : x) {
            // ทำการ XOR กับ result และ num
            result ^= num;

            // ผลลัพธ์หลังจากการ XOR 
            // System.out.println("After XOR with " + num + ": result is now " + result);
        }
        // พิมพ์จำนวนเต็มที่เหลือหลังจากทำ XOR ทั้งหมด
        // System.out.println("The number that appears an odd number of times is: " + result);
        System.out.println(result);
        return result; // คืนค่า result
        
    }

}
