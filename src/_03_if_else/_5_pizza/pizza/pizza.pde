  PImage pepperoni; 
void setup() {
    size(500,500);
    fill(#F5E285);
    ellipse(250,250,400,400);
    fill(#ED4318);
    ellipse(250,250,390,390);
    fill(#EDCE18);
    ellipse(250,250,380,380);
 pepperoni = loadImage("pepperoni.png");
 pepperoni.resize(100,100);
}
void draw() {
 image(pepperoni,250,250);
}
