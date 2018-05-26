int score = 0;
int raindropX = (int) random(1920);
int raindropY = 0;
void setup() {
  size(1920, 1080);
}
void draw() {
  background(255, 255, 255);
  fill(18, 216, 222);
  stroke(0, 0, 0);
  ellipse(raindropX, raindropY, 25, 25);
  rect(mouseX, 980, 50, 100);
  raindropY+=5;
  if(raindropY == 1080){
     checkCatch(raindropX);
    raindropX = (int) random(1920);
    raindropY=0;
  }
  fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
}
  void checkCatch(int x){
     if (x > mouseX && x < mouseX+100)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); 
   }