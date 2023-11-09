import processing.core.PApplet;

public class Sketch extends PApplet {
	
	/**
   * A program that defines methods with parameters and defines methods with return values.
   * @author: L. Wong
   */

  /**
   * Called at the beginning of execution, the size call.
   */
  public void settings() {
	// size call 
    size(400, 400);
  }
  
  /** 
   * Called  at the beginning of execution.  
   * Initial set up values: background. 
   */
  public void setup() {
    background(96, 172, 235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // The X and Y of the Happy Face (location)
    drawHappyFace(200, 200);
    drawHappyFace(100, 60);
    drawHappyFace(300, 60);
    drawHappyFace(100, 340);    
    drawHappyFace(300, 340);

    // The X and Y of the Lollipop (location)
    drawLollipop(200, 110, 255, 50, 255); 
    drawLollipop(200, 300, 0, 0, 67); 
    drawLollipop(100, 200, 150, 15, 15); 
    drawLollipop(300, 200, 0, 200, 70); 

  }

  /**
   * Calculates the colour, shape, and size of the eyes mouth and head of the happy face. 
   * @param fltX
   * @param fltY
   */
  public void drawHappyFace(float fltX, float fltY) {
    if (fltX > 200 && fltY > 200){
      fill(175, 255, 0); 
    }
    else if (fltX < 200 && fltY < 200){
      fill(0, 250, 200);
    }
    else if (fltX == 200 && fltY == 200){
      fill(0, 98, 299);
    }
    else if (fltX > 200 && fltY < 200){
      fill(255, 170, 200); 
    }
    else{
      fill(45, 221, 66); 
    }
    ellipse(fltX, fltY, 70, 70);
    fill(0);
    ellipse(fltX - 10, fltY - 10, 12, 10); 
    ellipse(fltX + 10, fltY - 10, 12, 10); 
    fill(175,0,0);
    arc(fltX, fltY, 40, 30, 0, PI); 

    }

  /**
   * Calculates the shape, size, and colour of the lollipops. 
   * @param fltX
   * @param fltY
   * @param intRed
   * @param intGreen
   * @param intBlue
   */
  public void drawLollipop (float fltX, float fltY, int intRed, int intGreen, int intBlue) {
    fill(255);
    rect(fltX - 5, fltY - 50, 10, 80);
    fill(intRed, intGreen, intBlue); 
    ellipse(fltX, fltY - 35, 40, 40);
  }

    

    }




