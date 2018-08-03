int X = (int) random(1920);
int Y = (int) random(1080);
void setup(){
size(1920, 1080);
background(255, 255, 255);
  
  
}
void draw(){
  fill(255, 255, 255);
  ellipse(getWormX(1920), getWormY(1080), 100, 100);
  makeMagical();
  
}
float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}