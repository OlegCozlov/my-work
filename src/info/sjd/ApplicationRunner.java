package info.sjd;

import info.sjd.model.Circle;
import info.sjd.model.Square;
import info.sjd.model.Treangle;

public class ApplicationRunner {

    public static void main(String[] args) {

    Treangle treangle = new Treangle();
    treangle.base = 10.0;
    treangle.heigth = 10.0;

        Treangle newTreangle = new Treangle(20, 20);

        System.out.println(treangle.getArea());
        System.out.println(newTreangle.getArea());
    }


}

