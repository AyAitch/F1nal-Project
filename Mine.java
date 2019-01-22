import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mine extends Actor
{
    /**
     * Act - do whatever the Mine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     * Exprimental. PLEASE DO NOT MARK
     */
    public void act() 
    {
        // Add your action code here.
        if (isTouching(Alien.class) == true )
        {
            removeTouching(Alien.class);
        }   
        if (isTouching(Bulldozer_AI.class) == true )
        {
            removeTouching(Bulldozer_AI.class);
        }  
        if (isTouching(Alien.class) == true )
        {
            removeTouching(Alien.class);
        }  
        if (isTouching(SpaceshipP.class) == true )
        {
            removeTouching(SpaceshipP.class);
        }  
        if (isTouching(Spaceship.class) == true )
        {
            removeTouching(Spaceship.class);
        } 
        if (isTouching(Hunter.class) == true )
        {
            removeTouching(Hunter.class);
        }  
    }    
}
