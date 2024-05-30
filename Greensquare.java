import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Greensquare here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Greensquare extends Actor
{
    
    //private GreenfootSound Aaa = new GreenfootSound("The World's Hardest Game - Main Theme Music.mp3");
    
    public void act()
    {
        checkTeleportation();
        checkTeleportation2();
        //Aaa.setVolume(30);
        //playLoop();
    }
    
    

    private void checkTeleportation()
    {
        if (isTouching(Player.class)) {
            World world = getWorld();
            if (world instanceof Lvl1) {
                ((Lvl1) world).goToNextLevel();
            }
        }
    }
    
    private void checkTeleportation2()
    {
        if (isTouching(Player.class)) {
            World world = getWorld();
            if (world instanceof Lvl2) {
                ((Lvl2) world).goToNextLevel();
            }
        }
    }
    
}
