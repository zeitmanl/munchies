import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Actor
{
    public int level;
    
    public Exit() {
        GreenfootImage image1 = getImage();
        image1.scale(50, 50);
        setImage(image1);
    }
    
    /**
     * Act - do whatever the Exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkForCollisions();
    }
    
    public void checkForCollisions() {
        Actor melvin = getOneIntersectingObject(Melvin.class);
        if (melvin != null) {
            if (level == 2) {
                Greenfoot.setWorld(new Level2());
                level++;
            } else if (level == 3) {
                Greenfoot.setWorld(new Level3());
                level++;
            } else if (level == 4) {
                Greenfoot.setWorld(new Level4());
                level++;
            } else if (level == 5) {
                Greenfoot.setWorld(new Level5());
                level++;
            } else if (level == 6) {
                Greenfoot.setWorld(new VictoryScreen());
            }
        }
    }
}
