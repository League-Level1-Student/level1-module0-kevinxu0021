import ddf.minim.*;
Minim minim;
AudioPlayer song;
PImage pictureOfRecord;  //as member variable
  int amount = 0;
void setup(){
  size(1920, 1080);
pictureOfRecord= loadImage("Titan X.png");  //in setup method  
minim = new Minim(this);  
 song = minim.loadFile("429155__greek555__5-vocals-loops-128-bpm.mp3", 512);

  
  
  
  
  
  
}
void draw(){
background(255,255,255);
  if(mousePressed){
    amount+=180;
   rotateImage(pictureOfRecord, amount);
  image(pictureOfRecord, 0, 0);
  }
  if(mousePressed){
song.play();}
else{
song.pause();}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
    void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}