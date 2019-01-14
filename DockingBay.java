import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DockingBay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DockingBay extends World
{

    /**
     * Constructor for objects of class DockingBay.
     * 
     */
    public DockingBay()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addActors();
        checkForWorldChange();
    }
    
    
    
    private void addActors()
    {
     addLadders();
     addPlayers();
     addPlayerShips();
    }
    
    
    private void addLadders()
    {
        addObject( new Ladder(), 535, 263 );
        addObject( new Ladder(), 535, 295 );
    }
    
    
    private void addPlayers()
    {
      addObject( new Martine(), 402, 292 );  
      addObject( new Piper(), 417, 292   );
    }
    
    private void addPlayerShips()
    {
      addObject( new SpaceshipP_noFlames(), 566, 241 );  
     addObject( new Spaceship_noFlames(), 583, 241 );
    }
    
    
    private void checkForWorldChange()
    {
      if(getObjects( Piper.class) .isEmpty() && getObjects(Martine.class) .isEmpty() )
      {
        Greenfoot.setWorld( new MyWorld() );
      }  
    }
    
    private void messages()
    {
      showText("Martine, Use WASD to move: Piper use the arrow keys", getWidth()/2-50, getHeight()/2-50 );  
      showText("Mission: Get to your Spaceships", getWidth()/2-100, getHeight()/2-100 );
      showText("Play this with someone ;)", getWidth()/2-150, getHeight()/2-150 );
    }
}
