import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Alex Hackbart
 * PTEC
 * Mr.Hardman
 * 1-17-2019
 */
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
        addPlayers();
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
        addActors();  
    }
    
    
    /**
     * addActors adds the actors and messages to the main screen
     * 
     * @param There aer no parameters
     * @return Nothing is returned
     */
    private void addActors()
    {
        addLadders();
        addPlayerShips();
        checkForWorldChange();
        messages();
    }
    
    
    /**
     * addLadders, this method adds the location of the ladders to the world
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void addLadders()
    {
        addObject( new Ladder(), 535, 263 );
        addObject( new Ladder(), 535, 295 );
    }
    
    
    /**
     * addPlayers adds the player controlled actors ( martine, piper ) to the world
     * 
     * @param There are no parameters
     * @returned Nothing is returned
     */
    private void addPlayers()
    {
        addObject( new Martine(), 402, 292 );  
        addObject( new Piper(), 417, 292   );
    }
    
    
    /**
     * addPlayerShips to the world so te players can get into them and fly away
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void addPlayerShips()
    {
        addObject( new SpaceshipP_noFlames(), 566, 241 );  
        addObject( new Spaceship_noFlames(), 583, 241 );
    }
    
    
    /**
     * checkForWorldChange checks to see if piper and martine are gone. If they are gone, it sets the world to MyWorld
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void checkForWorldChange()
    {
        if(getObjects( Piper.class) .isEmpty() && getObjects(Martine.class) .isEmpty() )
        {
            Greenfoot.setWorld( new MyWorld() );
        }  
    }
    
    
    /**
     * messages adds some messages to the world for the player
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void messages()
    {
        showText("Martine, Use WASD to move: Piper use the arrow keys", getWidth()/2-50, getHeight()/2-50 );  
        showText("Mission: Get to your Spaceships", getWidth()/2-100, getHeight()/2-100 );
        showText("Play this with someone ;)", getWidth()/2-150, getHeight()/2-150 );
    }
}
