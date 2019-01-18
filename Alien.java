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
    
    /**
     * Constructor for objects of class Alien.
     * 
     */
    public Alien()
    {
        SPEED = Greenfoot.getRandomNumber(4);  
    }

    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     * @param None their are no parameters
     * @return Nothing is returned
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
    /**
     * movement tells the alien how fast to move every act cycle
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void movement()
    {
        if( Greenfoot.getRandomNumber(100) > 25 )
        {
            move(2);
        }
        if ( Greenfoot.getRandomNumber(100) < 25 )
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

