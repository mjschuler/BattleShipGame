import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Auxiliary_Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Auxiliary_Ship extends Ships
{
    /**
     * Act - do whatever the Auxiliary_Ship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Auxiliary_Ship ship = new Auxiliary_Ship();
        MyWorld world = new MyWorld();
        world.addObject(ship,500,200);
    }    
    
}
