package OOP;

public class classAndObject {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.SetColor("blue");
        p1.SetTip_size(5);
        System.out.println(p1.color);
        System.out.println(p1.tip_size);
    }
}

class Pen {
    String color;
    int tip_size;

    void SetColor(String new_color){
        color = new_color;
    }

    void SetTip_size(int new_tip_size){
        tip_size = new_tip_size;
    }
}