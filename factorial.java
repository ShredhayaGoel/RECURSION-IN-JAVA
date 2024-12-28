/*public class factorial {

    public static void main(String[] args) {
        int bunnies = 5;
        int bunnyEars = 0;
        if(bunnies == 0){
            return 0;
        }
        return 2 + bunnyEars(bunnies-1); 
    }
}*/

// BunnyEars.java
public class factorial {
    // Recursive method to compute the total number of ears
    public static int totalEars(int n) {
        if (n == 0) { // Base case: no bunnies
            return 0;
        }
        return 2 + totalEars(n - 1); // Recursive case: add 2 ears for each bunny
    }

    public static void main(String[] args) {
        // Example: Calculate the total ears for a given number of bunnies
        int bunnies = 5; // Change this value to test with other numbers of bunnies
        System.out.println("Total ears for " + bunnies + " bunnies: " + totalEars(bunnies));
    }
}
