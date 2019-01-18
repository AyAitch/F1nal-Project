import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spaceship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spaceship extends Actor
{
     /**
     * Constructor for objects of class Alein.
     * 
     */
    public Spaceship()
    {
        getImage().rotate(90);
    }

    /**
     * Act - do whatever the Spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        crazyDumbMovement();
        move(1);
        if( Greenfoot.isKeyDown("c") )
        {
            shoot();   
        }
    }    
    
    /**
     * crazyDumbMovement is the crazy movement that the players rocketship goes through
     * 
     * @param Their are no parameters 
     * @return Nothing is returned
     */
    private void crazyDumbMovement()
    {
        if( Greenfoot.isKeyDown("d") )
        {
            turn(7);  
        }
        else if( Greenfoot.isKeyDown("a") )
        {
            turn(-10) ;  
        }
        else if( Greenfoot.isKeyDown("w") )
        {
            move(2);  
        }
        else if( Greenfoot.isKeyDown("s") )
        {
            move(-2);   
        }
    }
    
    /**
     * shoot shoots the bullet from the spaceship so you can stay safe
     * 
     * @param None Their are no parameters
     * @return Nothing is returned
     */
    private void shoot()
    {
        Bullet toAdd = new Bullet();

        toAdd.setRotation( getRotation() );

        getWorld().addObject(toAdd, getX(), getY() );
    }
}
