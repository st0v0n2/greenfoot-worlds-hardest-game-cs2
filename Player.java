import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int step = 3;
    int startX = 30;                    //Anfangsposition des Players
    int startY = 30;
    
    private static final int SPEED = 3;
    private boolean soundhasplayed;
    private GreenfootSound Baa = new GreenfootSound("Deathsound.mp3");
    

    public void act()
    {
        movePlayer();
        //setLocationOnTopOfGreenSquare();
        Touchwall();
        Baa.setVolume(20);
        
    }
    
    
    private void movePlayer()
    {
        int newX = getX();
        int newY = getY();
        boolean Hasmoved = true;

        if (Greenfoot.isKeyDown("w")) {
            newY -= SPEED;
            Hasmoved = false;
        }
        if (Greenfoot.isKeyDown("a")) {
            newX -= SPEED;
            Hasmoved = false;
        }
        if (Greenfoot.isKeyDown("s")) {
            newY += SPEED;
            Hasmoved = false;
        }
        if (Greenfoot.isKeyDown("d")) {
            newX += SPEED;
            Hasmoved = false;
        }

        setLocation(newX, newY);
    }

    private void setLocationOnTopOfGreenSquare()
    {
        Actor greenSquare = getOneIntersectingObject(Greensquare.class);
        if (greenSquare != null) {
            setLocation(greenSquare.getX(), greenSquare.getY());
        }
    }
    
    public void Touchwall()
    {
        int x = getX();
        int y = getY();
        
        if (getOneIntersectingObject(Onex200wall.class) != null || getOneIntersectingObject(Topwall1.class) != null || getOneIntersectingObject(Rightwall1.class) != null || getOneIntersectingObject(Secondtop.class) != null || getOneIntersectingObject(Secondleftwall.class) != null || getOneIntersectingObject(Topwall2.class) != null || getOneIntersectingObject(Thirdrightwall.class) != null || getOneIntersectingObject(Thirdtopwall.class) != null || getOneIntersectingObject(Secondrightwall.class) != null || getOneIntersectingObject(BottomFloor.class) != null || getOneIntersectingObject(Secondbottomfloor.class) != null || getOneIntersectingObject(Finialfloor.class) != null || getOneIntersectingObject(Fifthrightwall.class) != null || getOneIntersectingObject(Fourthrightwall.class) != null || getOneIntersectingObject(Sixthrightwall.class) != null || getOneIntersectingObject(Thirdbottomfloor.class) != null || getOneIntersectingObject(Thirdleftwall.class) != null || getOneIntersectingObject(Deathball.class) != null || getOneIntersectingObject(Deathball2.class) != null)
        {
            setLocation(150, 250);
            Greenfoot.playSound("Deathsound.mp3");
        } else if (getOneIntersectingObject(Lvl2leftwall.class) != null || getOneIntersectingObject(Lvl2topwall1.class) != null)
        {
            setLocation(90, 205);
            Greenfoot.playSound("Deathsound.mp3");
        }
        /*
        if (getOneIntersectingObject(Onex200wall.class) != null)
        {
            setLocation(150, 250);
        } else if (getOneIntersectingObject(Topwall1.class) != null)
        {
            setLocation(150, 250);
        } else if (getOneIntersectingObject(Rightwall1.class) != null)
        {
            setLocation(150, 250);
        } else if (getOneIntersectingObject(Secondtop.class) != null)
        {
            setLocation(150, 250);
        } else if (getOneIntersectingObject(Secondleftwall.class) != null)
        {
            setLocation(150, 250);
        } else if (getOneIntersectingObject(Topwall2.class) != null)
        {
            setLocation(150, 250);
        } else if (getOneIntersectingObject(Thirdrightwall.class) != null)
        {
            setLocation(150, 250);
        } else if (getOneIntersectingObject(Thirdtopwall.class) != null)
        {
            setLocation(150, 250);
        } else if (getOneIntersectingObject(Secondrightwall.class) != null)
        {
            setLocation(150, 250);
        } else if (getOneIntersectingObject(BottomFloor.class) != null)
        {
            setLocation(150, 250);
        } else if (getOneIntersectingObject(Secondbottomfloor.class) != null)
        {
            setLocation(150, 250);
        } else if (getOneIntersectingObject(Finialfloor.class) != null)
        {
            setLocation(150, 250);
        } else if (getOneIntersectingObject(Fifthrightwall.class) != null)
        {
            setLocation(150, 250);
        } else if(getOneIntersectingObject(Fourthrightwall.class) != null)
        {
            setLocation(150, 250);
        } else if (getOneIntersectingObject(Sixthrightwall.class) != null)
        {
            setLocation(150, 250);
        } else if(getOneIntersectingObject(Thirdbottomfloor.class) != null)
        {
            setLocation(150, 250);
        } else if(getOneIntersectingObject(Thirdleftwall.class) != null)
        {
            setLocation(150, 250);
        } else if (getOneIntersectingObject(Deathball.class) != null)
        {
            setLocation(150, 250);
        } else if (getOneIntersectingObject(Deathball2.class) != null)
        {
            setLocation(150, 250);
        }
        */
    }
   
   
   
}
