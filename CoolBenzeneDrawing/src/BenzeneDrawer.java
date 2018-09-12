import java.awt.Color;
import java.util.Random;

import apcslib.DrawingTool;
import apcslib.SketchPad;


public class BenzeneDrawer {
	DrawingTool pen = new DrawingTool(new SketchPad(500,500));
		/*
	 * What information does it make sense to pass into the drawBenzene
	 * method?  This info is whatever is needed to create an image of one benzene
	 * Then, to make the cool drawing, you can call the drawBenzene method lots
	 * of times!
	 */
	public void drawBenzene(int x, int y, int radius, int angle, double hex){
		pen.up();
		pen.move(x, y);
		pen.setColor(Color.blue);
		pen.down();
		pen.drawCircle(radius);
		pen.up();
		pen.setDirection(0+angle);
		pen.move(hex);
		pen.setDirection(60+angle);
		pen.setColor(Color.black);
		pen.down();
		for(int pie = 0; pie<7; pie++){
			pen.turn(60);
			pen.move(hex);
		}
		pen.up();
	}
	
	public void drawFivezene(int x, int y, double five, int angle, double ten, int color){
		pen.move(x,y);
		if(color == 0){
			pen.setColor(Color.red);
		}
		else if(color == 1){
			pen.setColor(Color.blue);
		}
		else if(color == 2){
			pen.setColor(Color.green);
		}
		pen.down();
		pen.setDirection(73+angle);
		for(int pentacircle = 0; pentacircle < 12; pentacircle++){
			for(int pie = 0; pie < 6; pie++){
				pen.move(five);
				pen.turnLeft(72);
			}
			pen.turnRight(108);
		}
		pen.up();
	}
	
	public void drawTrizene(int x, int y, double radius, int angle, double tri){
		pen.up();
		pen.move(x, y);
		pen.setColor(Color.red);
		pen.down();
		pen.drawCircle(radius);
		pen.up();
		pen.setDirection(90+angle);
		pen.move(tri);
		pen.setDirection(120+angle);
		pen.setColor(Color.darkGray);
		pen.down();
		for(int pie = 0; pie<7; pie++){
			pen.turn(120);
			pen.move(tri);
			pen.move(tri);

		}
		pen.up();
	}
}