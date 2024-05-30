import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deathball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deathball extends Actor
{
    /**
     * Act - do whatever the Deathball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean movey = false;
    private int speed = 2;
    public void act()
    {
        move(speed);
        if(getOneIntersectingObject(Onex200wall.class) != null || getOneIntersectingObject(Topwall1.class) != null || getOneIntersectingObject(Rightwall1.class) != null || getOneIntersectingObject(Secondtop.class) != null || getOneIntersectingObject(Secondleftwall.class) != null || getOneIntersectingObject(Topwall2.class) != null || getOneIntersectingObject(Thirdrightwall.class) != null || getOneIntersectingObject(Thirdtopwall.class) != null || getOneIntersectingObject(Secondrightwall.class) != null || getOneIntersectingObject(BottomFloor.class) != null || getOneIntersectingObject(Secondbottomfloor.class) != null || getOneIntersectingObject(Finialfloor.class) != null || getOneIntersectingObject(Fifthrightwall.class) != null || getOneIntersectingObject(Fourthrightwall.class) != null || getOneIntersectingObject(Sixthrightwall.class) != null || getOneIntersectingObject(Thirdbottomfloor.class) != null || getOneIntersectingObject(Thirdleftwall.class) != null || getOneIntersectingObject(Deathball.class) != null || getOneIntersectingObject(Deathball2.class) != null)
        {
            turn(180);
        }
    }
}
