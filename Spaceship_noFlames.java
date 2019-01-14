import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spaceship_noFlames here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spaceship_noFlames extends Actor
{
    /**
     * Act - do whatever the Spaceship_noFlames wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkForMartine();
    }   
    
    
    private void checkForMartine()
    {
        if(isTouching(Martine.class))
            {
                removeTouching(Martine.class);
            }
    }
}
