package cz.tul.knourekdaniel.uloha;

import java.awt.*;
import java.util.Scanner;

public class PoziceFigury {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Point dimensions = new Point();
        while ((dimensions.x = input.nextInt()) > 0) {
            dimensions.y = input.nextInt();
            Point position = new Point(input.nextInt(), input.nextInt());
            Point direction = new Point(input.nextInt(), input.nextInt());

            String out = "";
            Figura figura = new Figura(position, direction);
            int steps = input.nextInt();

            for (int i = 0; i < steps; i++) {
                int currentStep = input.nextInt();

                figura.makeStep(currentStep);
                if (!figura.insideBounds(dimensions)) {
                    out = "ERR";
                }
            }
            if (!out.equals("ERR")) {
                out = (figura.getPosition().x + " " + figura.getPosition().y + " ");
                out += (figura.getDirection().x + " " + figura.getDirection().y);
            }
            System.out.println(out);
        }
    }

}

class Figura {
    Point getDirection() {
        return direction;
    }
    Point getPosition() {
        return position;
    }
    private Point position;
    private Point direction;

    Figura(Point position, Point direction) {
        this.position = position;
        this.direction = direction;           
    }

    void makeStep(int step) {
        if (step == 0) {
            forward();
        } else {
            rotate(step);
        }
    }

    private void rotate(int step) {
        int x = (this.direction.x * cosInDeg(step * 90)) - (this.direction.y * sinInDeg(step * 90));
        int y = (this.direction.x * sinInDeg(step * 90)) + (this.direction.y * cosInDeg(step * 90));        
        this.direction = new Point(x, y);
    }
    
    private int sinInDeg(int deg){
        return (int) Math.round( Math.sin( Math.toRadians(deg) ) );
    }
    private int cosInDeg(int deg){
        return (int) Math.round( Math.cos( Math.toRadians(deg) ) );
    }

    private void forward() {
        this.position.x += this.direction.x;
        this.position.y += this.direction.y;
    }

    boolean insideBounds(Point corner) {
        boolean result;
        result = (this.position.x >= 0 && this.position.x < corner.x);
        result = (result && (this.position.y >= 0 && this.position.y < corner.y));
        return result;
    }
}