/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supertipos;

/**
 *
 * @author faust
 */
import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import java.util.*;

public class Supertipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Shape> myShape = new ArrayList<>();
        myShape.add(new Rectangle(3.0, 2.0));
        myShape.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.printf("Total Shepe area: %.3f\n", totalArea(myShape));
        System.out.printf("Total Circle area: %.3f\n", totalArea(myCircles));
    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0;
        for (Shape shape : list) {
            sum += shape.area();

        }
        return sum;
    }

    public static void printList(List<?> list) {

        for (Object object : list) {
            System.out.println(object);
        }
    }

}
