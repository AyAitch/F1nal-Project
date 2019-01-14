import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BombRoom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BombRoom extends World
{

    /**
     * Constructor for objects of class BombRoom.
     * 
     */
    public BombRoom()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addPlayers();
        addNumbers();
        addBomb();
    }
    
    public void act()
    {
        
    }
    
    
    private void addPlayers()
    {
      addObject( new Martine(), 59, 299 );  
      addObject( new Piper(), 70, 299 );
    }
    
    private void addBomb()
    {
      addObject( new Bomb(), 275, 305 );  
    }
    
    private void addNumbers()
    {
      addObject( new One(), 50, 200 );
      addObject( new Two(), 100, 200 );
      addObject( new Three(), 150, 200 );
      addObject( new Four(), 200, 200 );
      addObject( new Five(), 250, 200 );
      addObject( new Six(), 300, 200 );
      addObject( new Seven(), 350, 200 );
      addObject( new Eight(), 400, 200 );
      addObject( new Nine(), 450,200 );
    }
    
    private void checkForWorldChange()
    {
      if(getObjects( SpaceshipP_noFlames.class) .isEmpty() && getObjects(Spaceship_noFlames.class) .isEmpty() )
      {
        Greenfoot.setWorld( new BombRoom() );
      }  
    }
    
    
}
