package assignments.assignment_5.task10;

public class test1 {
    public int x = 3;
    public int y = 0;
    public int z = -1;
    public void case1(int x){
        int y = 12;
        this.x = y + 4 + x;
        y += this.y +1;
        case2(this.y, z);
        System.out.println(x + " "+ y + " "+ z);
        this.y = this.x + z;
        System.out.println(this.x + " "+ this.y + " "+ this.z);
    }
    public void case2(int temp, int z){
        this.x = z + temp + this.z;
        this.z = y + z;
        System.out.println(x + " "+ y + " "+ z);
        y  = x + y + z;
        temp = x;
        x = this.z;
        this.z = temp;
        System.out.println(this.x + " "+ this.y + " "+ this.z);
    }
 }
 
 
