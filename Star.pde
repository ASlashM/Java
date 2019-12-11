////
class Star {
  Starlocation starlocation;
  int starpositionx;
  int starpositiony;
  
  Star(Starlocation starposition) {
    starlocation = new Starlocation(starposition.starpositionx(), starposition.starpositiony());
  }
  ////
  void show() {
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
