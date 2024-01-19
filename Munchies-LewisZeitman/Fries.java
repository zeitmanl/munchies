import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fries here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fries extends Animal
{
    private boolean spawn = false;
    private int[] directions = {35, 70, 105, 140, 175, 210, 245, 280, 315};
    
    /**
     * Act - do whatever the Fries wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Fries() {
        GreenfootImage image1 = getImage();
        image1.scale(37, 43);
        setImage(image1);
    }
    
    public void act()
    {
        move(4);
        
        if (spawn == false) {
            turn(Greenfoot.getRandomNumber(270));
            spawn = true;
        }
        
        if (atWorldEdge()) {
            turn(directions[Greenfoot.getRandomNumber(8)]);
            move(Greenfoot.getRandomNumber(6));
        }
    }
}
