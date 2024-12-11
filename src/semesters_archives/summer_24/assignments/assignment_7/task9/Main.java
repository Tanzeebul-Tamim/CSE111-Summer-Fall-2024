package semesters_archives.summer_24.assignments.assignment_7.task9;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 9, 2, 1 };
        Trace1 t1 = new Trace1(arr);
        int x = t1.m2(7, 2);
        System.out.println(arr[0] + " " + x + " " + arr[4]);
        t1.m1(2, 7);
    }
}

// Outputs:
/*
 * 3 9 2
 * 2 4 12
 * 5 6 1
 * 12 3 7.0
 * 2 4 15
 */