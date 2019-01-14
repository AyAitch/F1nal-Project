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
    
    
    
    public void act()
    {
        checkForWorldChange();
    }
    
    
    
    
    private void addShips()
    {
      addAliens();
      addPlayerShips();
    }
    
    
    
    private void addAliens()
    {
        for( int i = 0; i < 150; i++ )
        {
            addObject( new Alien(), Greenfoot.getRandomNumber(400), Greenfoot.getRandomNumber(400));
        }
      
      
      
    }
    
    
    private void addPlayerShips()
    {
       addObject( new SpaceshipP(), Greenfoot.getRandomNumber(400)+400, Greenfoot.getRandomNumber(400)+400 );
       addObject( new Spaceship(), Greenfoot.getRandomNumber(400)+400, Greenfoot.getRandomNumber(400)+400 );
    }
    
    
    
    private void checkForWorldChange()
    {
      if(getObjects(Alien.class) .isEmpty() )
      {
        Greenfoot.setWorld( new BombRoom() );
      }  
    }
}
