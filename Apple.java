import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(-10);
        
        if(getX() <= 0)
        {
            resetApple();
        }
        
        if(isTouching(Bear.class))
        {
            Skull skull = new Skull();
            getWorld().addObject(skull, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetApple()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0)
        {
            setLocation(600, 300);
        } else {
            setLocation(600, 150);
        }
    }
}
