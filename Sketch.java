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
   * Called repeatedly, anything drawn to the screen.
   */
  public void draw() {
    
    // The X and Y of the Happy Face (location)
    drawHappyFace(200, 200);
    drawHappyFace(100, 60);
    drawHappyFace(300, 60);
    drawHappyFace(100, 340);    
    drawHappyFace(300, 340);

    // The X and Y of the Lollipop (location) and the colour
    drawLollipop(200, 110, 255, 50, 255); 
    drawLollipop(200, 300, 0, 0, 67); 
    drawLollipop(100, 200, 150, 15, 15); 
    drawLollipop(300, 200, 0, 200, 70); 
  }

  /**
   * Calculates the colour, shape, and size of the eyes mouth and head of the happy face. 
   * @param fltX the X value 
   * @param fltY the Y value
   */
  public void drawHappyFace(float fltX, float fltY) {

    // Decides the colour of happy face based on location.
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
    // Calculating the dimensions and colour of the happy face
    ellipse(fltX, fltY, 70, 70);
    fill(0);
    ellipse(fltX - 10, fltY - 10, 12, 10); 
    ellipse(fltX + 10, fltY - 10, 12, 10); 
    fill(175,0,0);
    arc(fltX, fltY, 40, 30, 0, PI); 
    }

  /**
   * Calculates the dimensions of the lollipops. 
   * @param fltX the X value 
   * @param fltY the Y value
   * @param intRed indicates amount of red
   * @param intGreen indicates amount of green
   * @param intBlue indicates amount of blue
   */
  public void drawLollipop(float fltX, float fltY, int intRed, int intGreen, int intBlue) {
    fill(255); // Colour of rectangle 
    // Calculating the dimensions and using parameters to indicate the colour. 
    rect(fltX - 5, fltY - 50, 10, 80);
    fill(intRed, intGreen, intBlue); 
    ellipse(fltX, fltY - 35, 40, 40);
  }
  
  /**
   * Captures the X and Y coordinates of the mouse click, 
   * passes these values to the boolean method and if true is returned it draws ears.
   */
  public void mouseClicked() {
    // setting variables 
    int intX = emouseX; 
    int intY = emouseY;  
    boolean blnCenter = center(intX, intY);

    // Draw ears on center face if true
    if(blnCenter == true){
      fill(0, 98, 299);
      ellipse(180, 170, 20, 20);   
      ellipse(220, 170, 20, 20);      
    }
  }
  
  /**
   * Calculates if the mouse was clicked in the center face. 
   * @param intX the X value of the mouse click
   * @param intY the Y value of the mouse click
   * @return blnValue, true if mouse clicked on center face
   */
  public boolean center(int intX, int intY){
    boolean blnValue = false;
    if (intX > 170 && intX < 230 && intY > 170 && intY < 230){
      blnValue = true;
    }
    return blnValue; 
  }

}


   




