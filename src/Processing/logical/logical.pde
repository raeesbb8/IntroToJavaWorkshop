void setup() {
  size(800, 800);
}

void draw() {
  
   //2. make it a nice color
   fill(255,0,0);
   //3. if the mouse is pressed, fill the circle with a different color          
   if(mousePressed){
      fill(0,255,0);
      ellipse(mouseX,mouseY,100,100);
    
   }else{
      ellipse(200,200,500,500);}
   }


