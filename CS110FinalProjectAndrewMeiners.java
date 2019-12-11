import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class CS110FinalProjectAndrewMeiners extends PApplet {

////
/*
Project: Final Project
Programmer: Andrew Meiners
Assigned: November 14th, 2019
Deadline: December 10th, 2019
Creation Date: November 18th, 2019
*/
////
/*
1. The sketch must have at least 3 classes in addition to the main program.
> The classes of the program, that are in addition to the main program, are 'Mountainranage', 'Mountainranges', 'Mountainrangelocation', 'Star', 'Starlocation', and 'Stars'.
2. One of the classes must contain an array of objects of one of the other classes.
> Both the class 'Mountainranges' and 'Stars' contain an array of objets from other classes
3. The program must have some type of interactive component using either the mouse or the keyboard.
> The interactive component used is a 'mouseX' function that changes the background color
4. The program must use map, rotation(2D or 3D), and vertex shape.
> The 'map()' funciton is used in the 'CS110FinalProjectAndrewMeiners' window, the 'rotate()' function is used in the 'Star' window, and the 'vertex()' function is used in 'Mountainrange' class
5. Use pushMatrix and popMatrix as needed.
> the 'pushMatrix' and 'popMatrix' functions are used in 'Star' in rotating the shape of the stars
6. You are encouraged to include the use test in some way.
> Unincluded in program
7. The program may include the use of images in some way.
> Unused in program
8. The program may use PShape, PFont, and PImage.
> The use of PFont for the text instructions
9. The program may use pixel operations.
> Unused in program
10. This project must not simply recycle your previous work or examples provided by others!
> I pledge that I have neither given nor recieved any unauthorized aid on this project
*/
////
Mountainranges mountainranges;
Stars stars;
int numberofmountainranges;
int numberofstars;
float backgroundbluecolor;
PFont myFont;
////
public void setup() {
  myFont = createFont("monospace",15);
  textFont(myFont);
  
  numberofmountainranges = 1;
  numberofstars = 5000;

  mountainranges = new Mountainranges(numberofmountainranges);
  stars = new Stars(numberofstars);
  
  frameRate(60);
  
  
  stars.make();
  mountainranges.make();
}
////
public void draw() {
  background();
  instructions();
  stars.show();
  mountainranges.show();
}
////
public void background() {
  backgroundbluecolor = map(mouseX,0,1000,0,200);
  background(10,10,backgroundbluecolor);
  fill(255);
  stroke(0);
  rect(0,0,1000,50);
}
////
public void instructions() {
  fill(0);
  text("Instructions:",10,15);
  fill(0);
  text("Moving the mouse from the left side of the screen to the right side of the screen will change the backgound to more blue",10,30);
  fill(0);
  text("Which changes the beautiful scenary from night into dusk or dawn",10,45);
}
////
////
class Mountainrange {
  Mountainrangelocation mountainrangelocation;
  int mountainrangepositionx;
  int mountainrangepositiony;
  
  Mountainrange(Mountainrangelocation mountainrangeposition) {
    mountainrangelocation = new Mountainrangelocation(mountainrangeposition.mountainrangepositionx(), mountainrangeposition.mountainrangepositiony());
  }
  ////
  public void show() {
    fill(0);
    noStroke();
    beginShape();
      vertex(0,500);
      vertex(0,400);
      vertex(89,371);
      vertex(147,423);
      vertex(246,378);
      vertex(356,369);
      vertex(421,441);
      vertex(532,432);
      vertex(689,391);
      vertex(711,402);
      vertex(832,437);
      vertex(945,357);
      vertex(1000,400);
      vertex(1000,500);
      vertex(0,500);
    endShape();
  }
  ////
}
////
////
class Mountainrangelocation {
  int mountainrangepositionx;
  int mountainrangepositiony;
  
  Mountainrangelocation(int mountainrangeposx, int mountainrangeposy) {
    mountainrangepositionx = mountainrangeposx;
    mountainrangepositiony = mountainrangeposy;
  }
  ////
  public int mountainrangepositionx() {
    return mountainrangepositionx;
  }
  ////
  public int mountainrangepositiony() {
    return mountainrangepositiony;
  }
  ////
}
////
class Mountainranges {
  Mountainrange[] mountainranges;
  Mountainrangelocation mountainrangeposition;
  int totalnumberofmountainranges;
  
  Mountainranges(int numberofmountainranges) {
    totalnumberofmountainranges = numberofmountainranges;
    mountainranges = new Mountainrange[numberofmountainranges];
  }
  ////
  public void make() {
    for(int count = 0; count < numberofmountainranges; count++) {
      mountainrangeposition = new Mountainrangelocation(0,500);
      mountainranges[count] = new Mountainrange(mountainrangeposition);
    }
  }
  ////
  public void show() {
    for(int count = 0; count < numberofmountainranges; count++) {
      mountainranges[count].show();
    }
  }
  ////
}
////
////
class Star {
  Starlocation starlocation;
  int starpositionx;
  int starpositiony;
  
  Star(Starlocation starposition) {
    starlocation = new Starlocation(starposition.starpositionx(), starposition.starpositiony());
  }
  ////
  public void show() {
    pushMatrix();
    fill(200,200,0);
    noStroke();
    rotate(0);
    rect(starlocation.starpositionx(), starlocation.starpositiony(),2,2);
    popMatrix();
    
    pushMatrix();
    fill(200,200,0);
    noStroke();
    rotate(45);
    rect(starlocation.starpositionx(), starlocation.starpositiony(),2,2);
    popMatrix();
  }
  ////
}
////
////
class Starlocation {
  int starpositionx;
  int starpositiony;
  
  Starlocation(int starposx, int starposy) {
    starpositionx = starposx;
    starpositiony = starposy;
  }
  ////
  public int starpositionx() {
    return starpositionx;
  }
  ////
  public int starpositiony() {
    return starpositiony;
  }
  ////
}
////
class Stars {
  Star[] stars;
  Starlocation starposition;
  int totalnumberofstars;
  
  Stars(int numberofstars) {
    totalnumberofstars = numberofstars;
    stars = new Star[numberofstars];
  }
  ////
  public void make() {
    for(int count = 0; count < numberofstars; count++) {
      starposition = new Starlocation((int) random(0,1000), (int) random(50,500));
      stars[count] = new Star(starposition);
    }
  }
  ////
  public void show() {
    for(int count = 0; count < numberofstars; count++) {
      stars[count].show();
    }
  }
  ////
}
////
  public void settings() {  size(1000,500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "CS110FinalProjectAndrewMeiners" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
