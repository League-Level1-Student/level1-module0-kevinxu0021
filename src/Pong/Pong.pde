int ballX = 960;
PImage backgroundImage;
import ddf.minim.*;  
Minim minim;
AudioSample sound;
int ballY = 540;
int speedX = 3;
int speedY = 3;
void setup(){
 size(1920, 1080); 
 background(255, 255, 255);
 backgroundImage = loadImage("image.jpg");
 minim = new Minim (this);
 sound = minim.loadSample("pong.wav", 128);
}
void draw(){
  image(backgroundImage, 0, 0);
  image(backgroundImage, 0, 0, width, height);
  fill(255, 0, 0);
  stroke(0, 0, 0);
  ellipse(ballX, ballY, 15, 15);
  rect(mouseX ,1050 , 100, 30);

  ballX += speedX;
  ballY += speedY;
  if(ballX >= width || ballX <= 0){
   speedX *= -1; 
  }
  
  if(ballY >= height || ballY <= 0){
   speedY *= -1; 
     intersects(ballX, ballY, mouseX, 1050, 100);
  }
  if(intersects(ballX, ballY, mouseX, 1050, 100) == true){
   speedY *= -1; 
  }
  if(ballY >= height){
   sound.trigger(); 

  }
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}