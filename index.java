int x = 200;
int y = 200;
int score = 0;

void setup() {
	size(400, 400);
}

void draw() {
	background(0);
	noStroke();
	//goals
  rect(150, 0, 100, 20);
  rect(150, 380, 100, 20);
  //piece
  rect(x, y, 15, 15);

  //tallies score for goal at top of canvas
  if(x >= 140 && x <= 250){
    if(y <= 20){
      x = 200;
      y = 200;
      score++;
    }
  }

  //Write a conditional statement that accurately tallies score for the goal at the bottom of the canvas. Be sure once the rectangle lands in the goal it increments score by 1 then resets to the center of the screen

  println(score);
}

void keyPressed(){

  if(key == 'w'){
    y-=10;
  }else if(key == 's'){
    y+=10;
  }else if(key == 'a'){
    x-=10;
  }else if(key == 'd'){
    x+=10;
  }else{
    x = 200;
    y = 200;
  }

}