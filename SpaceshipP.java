import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceshipP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceshipP extends Actor
{
    
    public SpaceshipP()
    {
        getImage().rotate(90);
    }

    /**
     * Act - do whatever the SpaceshipP wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here
        final int SPEED = 15;
        crazyDumbMovement();
        move(SPEED);
    }  
    
    
    /**
     * crazyDumbMovement is the crazy movement that the players rocketship goes through
     * 
     * @param Their are no parameters 
     * @return Nothing is returned
     */
    private void crazyDumbMovement()
    {
        if( Greenfoot.isKeyDown("right") )
        {
            turn(10);  
        }
        else if( Greenfoot.isKeyDown("left") )
        {
            turn(-7) ;  
        }
        else if( Greenfoot.isKeyDown("up") )
        {
            move(4);  
        }
        else if( Greenfoot.isKeyDown("down") )
        {
            move(-7);   
        }
    }
}
