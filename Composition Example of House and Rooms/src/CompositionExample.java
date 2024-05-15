import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class CompositionExample extends GraphicsProgram {

    public void run() {
        // Draw the house
        GRect house = new GRect(100, 150, 300, 200);
        house.setFilled(true);
        house.setFillColor(Color.YELLOW);
        add(house);

        // Draw the rooms
        GRect room1 = new GRect(120, 170, 100, 80);
        GRect room2 = new GRect(280, 170, 100, 80);
        GRect room3 = new GRect(120, 280, 100, 60);
        GRect room4 = new GRect(280, 280, 100, 60);
        room1.setFilled(true);
        room2.setFilled(true);
        room3.setFilled(true);
        room4.setFilled(true);
        room1.setFillColor(Color.LIGHT_GRAY);
        room2.setFillColor(Color.LIGHT_GRAY);
        room3.setFillColor(Color.LIGHT_GRAY);
        room4.setFillColor(Color.LIGHT_GRAY);
        add(room1);
        add(room2);
        add(room3);
        add(room4);

        // Caption
        GLabel caption = new GLabel("Composition: A House has Rooms, and Rooms cannot exist independently.");
        caption.setFont("Serif-italic-18");
        add(caption, 50, 400);

        // Signature
        GLabel signature = new GLabel("Gavin");
        signature.setFont("Serif-italic-12");
        add(signature, getWidth() - 50, getHeight() - 10);
    }

    public static void main(String[] args) {
        (new CompositionExample()).start(args);
    }
}