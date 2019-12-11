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
void setup() {
  myFont = createFont("monospace",15);
  textFont(myFont);
  
  numberofmountainranges = 1;
  numberofstars = 5000;

  mountainranges = new Mountainranges(numberofmountainranges);
  stars = new Stars(numberofstars);
  
  frameRate(60);
  size(1000,500);
  
  stars.make();
  mountainranges.make();
}
////
void draw() {
  background();
  instructions();
  stars.show();
  mountainranges.show();
}
////
void background() {
  backgroundbluecolor = map(mouseX,0,1000,0,200);
  background(10,10,backgroundbluecolor);
  fill(255);
  stroke(0);
  rect(0,0,1000,50);
}
////
void instructions() {
  fill(0);
  text("Instructions:",10,15);
  fill(0);
  text("Moving the mouse from the left side of the screen to the right side of the screen will change the backgound to more blue",10,30);
  fill(0);
  text("Which changes the beautiful scenary from night into dusk or dawn",10,45);
}
////
