import processing.core.PApplet;

public class Ecker_MouseInteraction extends PApplet {

    public static void main(String[] args) {
        PApplet.main("Ecker_MouseInteraction");
    }

    public void settings() {
        size(500,500);
    }

    public void setup() {
        frameRate(20);
    }

    public void draw() {
        System.out.printf("( %d | %d ) \n" , mouseX , mouseY);
    }
}
