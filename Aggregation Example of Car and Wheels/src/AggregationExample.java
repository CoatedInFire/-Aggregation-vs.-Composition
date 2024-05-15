import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class AggregationExample extends GraphicsProgram {

    public void run() {
        // Draw the car body
        GRect carBody = new GRect(100, 150, 300, 100);
        carBody.setFilled(true);
        carBody.setFillColor(Color.BLUE);
        add(carBody);

        // Draw the wheels
        GOval wheel1 = new GOval(120, 230, 50, 50);
        GOval wheel2 = new GOval(330, 230, 50, 50);
        wheel1.setFilled(true);
        wheel2.setFilled(true);
        wheel1.setFillColor(Color.BLACK);
        wheel2.setFillColor(Color.BLACK);
        add(wheel1);
        add(wheel2);

        // Caption
        GLabel caption = new GLabel("Aggregation: A Car has Wheels, but Wheels can exist independently.");
        caption.setFont("Serif-italic-18");
        add(caption, 50, 400);

        // Signature
        GLabel signature = new GLabel("Gavin");
        signature.setFont("Serif-italic-12");
        add(signature, getWidth() - 50, getHeight() - 10);
    }

    public static void main(String[] args) {
        (new AggregationExample()).start(args);
    }
}