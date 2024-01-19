import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Butter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Butter extends Animal
{
    public Butter() {
        GreenfootImage image1 = getImage();
        image1.scale(49, 23);
        setImage(image1);
    }
    
    /**
     * Act - do whatever the Butter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        if(getX() > getWorld().getWidth() - 5) {
            getWorld().removeObject(this);
        }
    }
}
