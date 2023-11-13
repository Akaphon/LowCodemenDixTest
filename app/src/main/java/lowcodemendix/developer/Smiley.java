package lowcodemendix.developer;

public class Smiley {
    public static int countSmileys(String[] arr){
        int count = 0;
        for (String face : arr) {
            // System.out.println("Checking: " + face);
            if (face.matches("[:;][-~]?[)D]")) {
                // System.out.println("Matched: " + face);
                count++;
            }
        }

        System.out.println(count);
        // System.out.println("Total count: " + count);
        return count;
    }
}
