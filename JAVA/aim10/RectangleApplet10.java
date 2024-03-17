// Write an applette to display a rectangle with specify co-ordinate and color passed as parameter from the html file.

import java.awt.*;
import java.applet.*;

public class RectangleApplet10 extends Applet {

    int x, y, width, height;
    Color color;

    // Initialization method to get parameters from HTML
    public void init() {
        // Get parameters from HTML using getParameter() method
        x = Integer.parseInt(getParameter("x")); // Get x-coordinate
        y = Integer.parseInt(getParameter("y")); // Get y-coordinate
        width = Integer.parseInt(getParameter("width")); // Get width
        height = Integer.parseInt(getParameter("height"));// Get height
        color = Color.decode(getParameter("color")); // Get color in hexadecimal format
    }

    // Paint method to draw the rectangle
    public void paint(Graphics g) {
        // Set the color for drawing the rectangle
        g.setColor(color);

        // Draw a rectangle with the specified parameters
        g.drawRect(x, y, width, height);
    }
}
