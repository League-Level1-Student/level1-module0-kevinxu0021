PImage pictureOfRecord;  //as member variable
  int amount = 0;
void setup(){
  size(1920, 1080);
  
pictureOfRecord= loadImage("Titan X.png");  //in setup method  

 
  
  
  
  
  
  
  
  
  
}
void draw(){
background(255,255,255);
  if(mousePressed){
    amount++;
   rotateImage(pictureOfRecord, amount);
  image(pictureOfRecord, 0, 0);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
    void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}