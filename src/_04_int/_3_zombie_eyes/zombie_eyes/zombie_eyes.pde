
void setup() {
PImage face = loadImage("emoji.png");
size(500,500);
face.resize(500,500);
image(face,0,0);
}
void draw() {
fill(mouseX,mouseY,mouseX*mouseY,175);
  ellipse(130,250,150,150);
ellipse(370,250,150,150);
fill(0);
ellipse(130,250,50,50);
ellipse(370,250,50,50);
}
