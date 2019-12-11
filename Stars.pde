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
  void make() {
    for(int count = 0; count < numberofstars; count++) {
      starposition = new Starlocation((int) random(0,1000), (int) random(50,500));
      stars[count] = new Star(starposition);
    }
  }
  ////
  void show() {
    for(int count = 0; count < numberofstars; count++) {
      stars[count].show();
    }
  }
  ////
}
////
