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
  void make() {
    for(int count = 0; count < numberofmountainranges; count++) {
      mountainrangeposition = new Mountainrangelocation(0,500);
      mountainranges[count] = new Mountainrange(mountainrangeposition);
    }
  }
  ////
  void show() {
    for(int count = 0; count < numberofmountainranges; count++) {
      mountainranges[count].show();
    }
  }
  ////
}
////
