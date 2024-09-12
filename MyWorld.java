import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    /**
     * Create a small game where the bear has to navigate itself between bad objects to get to the honey?
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Bear bear = new Bear();
        addObject(bear, 100, 100);
    }
}
