import java.util.*;

class Box {
    int l, w, h;

    Box(int l, int w, int h) {
        this(); 
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box() {
        l = w = h = 1;
    }

    void display() {
        System.out.println(l + " * " + w + " * " + h);
    }

    public static void main(String[] args) {

        Box b1 = new Box(2, 3, 4);
        Box b2 = new Box();

        b1.display();
        b2.display();
    }
}
