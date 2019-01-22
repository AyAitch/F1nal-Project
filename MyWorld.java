import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends greenfoot.World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        addShips();
    }

    /**
     * act is the method that
     * runs during every act cycle
     * of the scenario
     *
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act()
    {
        checkForWorldChange();
    }

    /**
     * addShips adds the players and the aliens to the world
     * 
     * @param There are no parameters 
     * @return Nothing is returned
     */
    private void addShips()
    {
        addAliens();
        addPlayerShips();
    }

    /**
     * addAliens adds a alien multiple times to the world
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void addAliens()
    {
        for( int i = 0; i < 750; i++ )
        {
            addObject( new Alien(), Greenfoot.getRandomNumber(400) - 200, Greenfoot.getRandomNumber(400) + 200);
        }
        addObject( new Hunter(), 10, 785 );
    }

    /**
     * addPlayerships adds the location of the player ships to the world
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void addPlayerShips()
    {
        addObject( new SpaceshipP(), Greenfoot.getRandomNumber(400)+400, Greenfoot.getRandomNumber(400)+400 );
        addObject( new Spaceship(), Greenfoot.getRandomNumber(400)+400, Greenfoot.getRandomNumber(400)+400 );
        for( int i = 0; i < 25; i++ )
        {
            addObject( new Bulldozer_AI(), Greenfoot.getRandomNumber(200)+600, Greenfoot.getRandomNumber(250) );
        }
        for( int i = 0; i < 10; i++ )
        {
            addObject( new Bulldozer_AI(), Greenfoot.getRandomNumber(15), Greenfoot.getRandomNumber(25) ) ;
            
        }
    }

    /**
     * checkForWorldChange checks to see if piper and martine are gone. If they are gone, it sets the world to MyWorld
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void checkForWorldChange()
    {
        if(getObjects(Alien.class) .isEmpty() )
        {
            Greenfoot.setWorld( new BombRoom() );
        }  
    }
}
