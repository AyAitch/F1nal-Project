import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Creature
{

    private final int SPEED;

    public Alien()
    {
        SPEED = Greenfoot.getRandomNumber(4)+2;  
    }

    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        movement();
        if( atEdgeOfWorld() == true )
        {
            turn(3);
        }
    }

    private void movement()
    {
        if( Greenfoot.getRandomNumber(100) < 75 )
        {
            move(2);
        }
        if ( Greenfoot.getRandomNumber(100) < 50 )
        {
            turn(3);

        }
        move(SPEED);
        if (isTouching(Spaceship.class) == true )
        {
            removeTouching(Spaceship.class);

        }    
        if ( isTouching(SpaceshipP.class) == true )
        {
            removeTouching(SpaceshipP.class);  
        }
    }
}    

