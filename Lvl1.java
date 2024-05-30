import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
/**
 * Write a description of class Lvl1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl1 extends World
{

    /**
     * Constructor for objects of class Lvl1.
     * 
     */
    private GreenfootSound Aaa = new GreenfootSound("The World's Hardest Game - Main Theme Music.mp3");
    
    public Lvl1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(791, 592, 1);
        
        addObject(new Player(), 150, 250);
        addObject(new Greensquare(), 650, 300);
        
        //all walls
        addObject(new Onex200wall(), 97, 294);
        addObject(new Topwall1(), 147, 197);
        addObject(new Rightwall1(), 197, 231);
        addObject(new Secondtop(), 213, 271);
        addObject(new Secondleftwall(), 230, 250);
        addObject(new Topwall2(), 380, 230);
        addObject(new Thirdrightwall(), 529, 212);
        addObject(new Thirdtopwall(), 611, 196);
        addObject(new Secondrightwall(), 695, 297);
        addObject(new BottomFloor(), 646, 396);
        addObject(new Thirdleftwall(), 595, 311);
        addObject(new Secondbottomfloor(), 579, 229);
        addObject(new Fifthrightwall(), 563, 296);
        addObject(new Thirdbottomfloor(), 414, 362);
        addObject(new Sixthrightwall(), 263, 379);
        addObject(new Finialfloor(), 180, 397);
        
        //Deathball
        addObject(new Deathball(), 545, 300);
        addObject(new Deathball2(), 250, 260);
        addObject(new Deathball3(), 300, 340);
        addObject(new Deathball4(), 630, 260);
        //213
        GreenfootImage backgroundImage = new GreenfootImage(getWidth(), getHeight());
        backgroundImage.setColor(Color.RED); // Set the background color to green
        backgroundImage.fill();
        
        GreenfootImage originalImage = getBackground();
        backgroundImage.drawImage(originalImage, 0, 0);
        setBackground(backgroundImage);
        
        //audio
        Aaa.setVolume(0);
        playLoop();
    }
    
    
    
    public void playLoop()
    {
        Aaa.playLoop();
    }
    
    
    
    public void goToNextLevel()
    {
        Greenfoot.setWorld(new Lvl2());
    }
    
    
    
}
