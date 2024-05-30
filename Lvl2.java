import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl2 extends World
{

    /**
     * Constructor for objects of class Lvl2.
     * 
     */
    public Lvl2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(541, 407, 1); 
        
        addObject(new Player(), 90, 205);
        addObject(new Greensquare(), 450, 203);
        
        addObject(new Lvl2leftwall(), 67, 203);
        addObject(new Lvl2topwall1(), 100, 180);
        
        GreenfootImage backgroundImage = new GreenfootImage(getWidth(), getHeight());
        backgroundImage.setColor(Color.RED); // Set the background color to green
        backgroundImage.fill();
        
        GreenfootImage originalImage = getBackground();
        backgroundImage.drawImage(originalImage, 0, 0);
        setBackground(backgroundImage);
    }
    
    public void goToNextLevel()
    {
        Greenfoot.setWorld(new Lvl3());
    }
}
