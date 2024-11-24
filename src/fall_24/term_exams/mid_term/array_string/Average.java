package fall_24.term_exams.mid_term.array_string;

/*
    Question:
    A teacher wants to evaluate the students of their class by calculating group averages, 
    but instead of all averages, the teacher is only interested in finding the maximum average 
    from all possible groups. You are given:
    
    1. An array of integers representing the marks of the students in the class.
    2. An integer `k` that specifies the number of students in each group.

    Your task is to calculate the averages of all possible groups of size `k` in the array.

    Sample Input 1:
    int[] marks = {55, 45, 23, 56, 34, 67};
    int k = 3;

    Explanation:
    - Groups of size `k=3`:
        1. {55, 45, 23} -> Average = (55 + 45 + 23) / 3 = 41.0
        2. {45, 23, 56} -> Average = (45 + 23 + 56) / 3 = 41.33
        3. {23, 56, 34} -> Average = (23 + 56 + 34) / 3 = 37.67
        4. {56, 34, 67} -> Average = (56 + 34 + 67) / 3 = 52.33
    - Maximum Average = 52.33

    Sample Output 1:
    Max Average:
    52.33

    Sample Input 2:
    int[] marks = {70, 80, 90, 60};
    int k = 2;

    Explanation:
    - Groups of size `k=2`:
        1. {70, 80} -> Average = (70 + 80) / 2 = 75.0
        2. {80, 90} -> Average = (80 + 90) / 2 = 85.0
        3. {90, 60} -> Average = (90 + 60) / 2 = 75.0
    - Maximum Average = 85.0

    Sample Output 2:
    Max Average:
    85.00
*/

public class Average {
    static void calc(int[] marks, int k) {
        if (k > marks.length) {
            System.out
                    .println(
                            "Error: Number of students in a group cannot exceed the total number of students in the class.");
        } else {
            int groups = (marks.length - k) + 1;
            double max = 0;

            for (int i = 0; i < groups; i++) {
                int sum = 0;

                for (int j = i; j < (i + k); j++) {
                    sum += marks[j];
                }

                double avg = sum / (double) k;

                if (i == 0) {
                    max = avg;
                } else {
                    if (avg > max) {
                        max = avg;
                    }
                }
            }

            System.out.printf("Max Average:\n%.2f\n", max);
        }
    }

    public static void main(String[] args) {
        int[] marks = { 55, 45, 23, 56, 34, 67 };
        int k = 3;
        calc(marks, k);
    }
}