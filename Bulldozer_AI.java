import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bulldozer_AI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bulldozer_AI extends Creature
{
    private final int SPEED;
    
    /**
     * Constructor for objects of class Alien.
     * 
     */
    public Bulldozer_AI()
    {
        SPEED = Greenfoot.getRandomNumber(4);  
        getImage().rotate(90);
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
        if( Greenfoot.getRandomNumber(100) < 75 )
        {
            move(1);
        }
        else if ( Greenfoot.getRandomNumber(100) < 50 )
        {
            turn(6);
            move(1);
        }
        else  
        {
            turn(-6);
            move(1);
        }
        move(SPEED);    
        if ( isTouching(Alien.class) == true )
        {
            removeTouching(Alien.class);  
        }
    }
}       

