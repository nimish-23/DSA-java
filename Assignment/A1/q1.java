package Assignment.A1;
//Question 1 :Write a Java method to compute the averageof three numbers..
public class q1 {

    public static int average(int a, int b, int c){
        return (a+b+c)/3;
    }

    public static void main(String[] args){
        System.out.println(average(2, 3, 4));
    }
}
