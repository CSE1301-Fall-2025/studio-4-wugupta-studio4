package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		Color purply = new Color(200, 0, 250);
		StdDraw.setPenColor(purply);
		StdDraw.rectangle(0.5,0.5,0.45,0.3);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.line(0.05,0.2,0.140625,0.38671875);
		StdDraw.line(0.16015625,0.38671875,0.25,0.2);
		StdDraw.line(0.20,0.3,0.28515625,0.365234375);
		StdDraw.line(0.3203125,0.35546875,0.40,0.3);
		StdDraw.line(0.35,0.2,0.439453125,0.3828125);
		StdDraw.line(0.458984375,0.373046875,0.55,0.2);
		StdDraw.line(0.50,0.30,0.58203125,0.404296875);
		StdDraw.line(0.607421875,0.40234375, 0.662109375,0.318359375);
		StdDraw.line(0.5449,0.2012,0.724609375,0.380859375);
		StdDraw.line(0.767578125, 0.376953125, 0.91796875,0.203125);
		StdDraw.line(0.822265625,0.310546875,0.93359375,0.384765625);
		
		StdDraw.circle(0.94921875,0.396484375,0.01);
		StdDraw.circle(0.298828125,0.375,0.01);
		StdDraw.circle(0.447265625,0.396484375,0.01);
		StdDraw.circle(0.59765625, 0.427734375,0.01);
		StdDraw.circle(0.744140625,0.3984375,0.01);
		StdDraw.circle(0.15234375,0.40234375,0.01);
		StdDraw.arc(0.5, 0.5, 0.2, 0,243);
		StdDraw.arc(0.5,0.5,0.2,314,360);
		
		//StdDraw.line(0.5,0.609375,0.95,0.609375);

		for (int t = 0; t < 20; t++) {
			double x = StdDraw.mouseX();
			double y = StdDraw.mouseY();

			boolean isPressed = StdDraw.mousePressed();

			System.out.println("X = " + x + "Y = " + y);
			StdDraw.pause(1000);
		}
	}
}