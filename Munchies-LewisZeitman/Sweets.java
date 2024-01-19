import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sweets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sweets extends Animal
{
    int[] pics = { 128, 129, 131 };
    /**
     * Act - do whatever the Sweets wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Sweets() {
        GreenfootImage image1 = getImage();
        image1.scale(51, 40);
        setImage(image1);
        setImage(pics[Greenfoot.getRandomNumber(3)] + ".gif");
    }
    
    public void act()
    {
        move(4);
        if(getX() > getWorld().getWidth() - 5) {
            getWorld().removeObject(this);
        }
    }
}
