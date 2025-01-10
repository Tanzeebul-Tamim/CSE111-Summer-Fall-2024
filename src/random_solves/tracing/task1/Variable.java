package random_solves.tracing.task1;

@SuppressWarnings("static-access")
public class Variable {
    public static int one = 1;
    public static int ten = 10;

    public int two = 2;
    public int five = 5;

    public Variable() {
        int one = ten - 3;
        this.two = one + (this.one++) + Variable.ten;
        Variable.ten = 9 - (--five) + one;
        System.out.println(two + " " + ten);
    }

    public static Variable operation() {
        Variable object = new Variable();
        object.ten += object.five + (one++) * 3;
        System.out.println(ten + " " + object.two);
        return object;
    }

    public Variable operation(Variable var) {
        five = 3 - two;
        int five = Variable.one + this.five;
        System.out.println(five + " " + this.five);
        this.five -= five - ten;
        return this;
    }

    public static void main(String[] args) {
        Variable v1 = new Variable();
        Variable v2 = v1.operation();
        v1 = v2.operation(v1);
        System.out.println(v1.one + " " + v1.five);
    }

}

// Outputs:
/*
    18 12
    23 14
    27 23
    -16 -20
    4 23
 */