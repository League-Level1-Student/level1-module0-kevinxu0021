int ballX = 960;
import ddf.minim.*;  
Minim minim;
AudioSample sound;
int ballY = 540;
int speedX = 3;
int speedY = 3;
void setup(){
 size(1920, 1080); 
 background(255, 255, 255);
 minim = new Minim (this);
 sound = minim.loadSample("pong.wav", 128);
}
void draw(){
  background(255, 255, 255);
  fill(18, 120, 250);
  stroke(0, 0, 0);
  ellipse(ballX, ballY, 15, 15);
  ballX += speedX;
  ballY += speedY;
  if(ballX >= width || ballX <= 0){
   speedX *= -1; 
  }
  
  if(ballY >= height || ballY <= 0){
   speedY *= -1; 
  }
  if(ballY >= height){
   sound.trigger(); 
  }
}