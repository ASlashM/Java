////
class Mountainrange {
  Mountainrangelocation mountainrangelocation;
  int mountainrangepositionx;
  int mountainrangepositiony;
  
  Mountainrange(Mountainrangelocation mountainrangeposition) {
    mountainrangelocation = new Mountainrangelocation(mountainrangeposition.mountainrangepositionx(), mountainrangeposition.mountainrangepositiony());
  }
  ////
  void show() {
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
