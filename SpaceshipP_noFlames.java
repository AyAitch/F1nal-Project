import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceshipP_noFlames here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceshipP_noFlames extends Actor
{
    /**
     * Act - do whatever the SpaceshipP_noFlames wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkForPiper();
    }    
    
    
    private void checkForPiper()
    {
        if(isTouching(Piper.class))
            {
                removeTouching(Piper.class);
            }
    }
}
