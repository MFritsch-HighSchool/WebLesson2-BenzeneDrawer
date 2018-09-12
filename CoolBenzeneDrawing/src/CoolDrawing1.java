/*
 *  @Author: Matthew Fritsch
 * 
 */

import java.util.Random;


public class CoolDrawing1 {

	public static void main(String[] args) {
		BenzeneDrawer renoir = new BenzeneDrawer();
		looping(renoir);
	}
	
	private static void looping(BenzeneDrawer renoir) {
		// code to have the benzeneDrawer do something cool...
		int xben = 140;
		//for loop
		//renoir.drawBenzene(20, 20, 50, 15, 75);
		for(int looper = 0; looper<45; looper++){
			renoir.drawBenzene(xben, 40, 50, 45, 75);
			xben+=10;
		}
		xben = 20;
		int xloc = 190;
		int yloc = 190;
		double hex = 37;
		for(int looper = 0; looper<45; looper++){
			renoir.drawBenzene(xloc, yloc, xben, 0, hex);
			xben+=2;
			xloc-=5;
			yloc-=2;
			hex = xben*1.5;
		}
		int xang = 0;
		xloc = -150;
		yloc = 350;
		for(int looper = 0; looper < 180; looper++){
			renoir.drawBenzene(xloc, yloc, 50, xang, 75);
			xang+=3;
			xloc-=1;
			yloc-=1;
		}
		int size = 3;
		xang = 0;
		for(int loop2 = 0; loop2 < 20; loop2++){
			renoir.drawFivezene(-400, -175, size, xang, 50, 0);
			size+=2;
			xang+=5;
			renoir.drawFivezene(-400, -175, size, xang, 50, 1);
			size+=2;
			xang+=5;
			renoir.drawFivezene(-400, -175, size, xang, 50, 2);
			size+=2;
			xang+=5;
		}
		size = 10;
		xang = 0;
		for(int looper = 0; looper < 360; looper++){	
			renoir.drawTrizene(200, -200, 25, xang, size+25);
			size+=1;
			xang+=1;
		}
	}
}
