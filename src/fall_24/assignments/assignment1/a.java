package fall_24.assignments.assignment1;

public class a {
    static double squareRoot(double num) {
        double guess = num / 2; // Initial guess
        double threshold = 0.0001; // Desired precision level

        // Iteratively improve the guess
        while (Math.abs(guess * guess - num) > threshold) {
            guess = (guess + num / guess) / 2;
        }

        return guess;
    }

    public static void main(String[] args) {
        System.out.println(squareRoot(100));
    }
}
