import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BombRoom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BombRoom extends World
{
    
    private String bomb  = " Go Touch The Bomb "; 
    /**
     * Constructor for objects of class BombRoom. This adds the actors to the world.
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
    
    
    /**
    * act is the method that
    * runs during every act cycle
    * of the scenario. The act method will be constantly adding the text to the world and will check 
    * whether an explosion will happen
    *
    * @param There are no parameters
    * @return Nothing is returned
    */
    public void act()
    {
        checkForExplosion(); 
        showText( " Touch the Bomb", getWidth()/2, getHeight()/2 );
    }
     
    
    
    
    /** 
     * addPlayers adds the characters that the players of the game play. this adds the players to the world
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void addPlayers()
    {
        addObject( new Martine(), 59, 299 );  
        addObject( new Piper(), 70, 299 );
    }
    
    
    
    /**
     * adds the bomb object to the world for the players to touch :)
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void addBomb()
    {
        addObject( new Bomb(), 275, 305 );  
    }
    
    
    /**
     * adds the numbers to the world to replecate a code on a bomb
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
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
    
    
    /**
     * checkForWorldChange checks if the world is changed. If their are no player controlled spaceships in the world 
     * it sets the world to the bomb room
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void checkForWorldChange()
    {
        if(getObjects( SpaceshipP_noFlames.class) .isEmpty() && getObjects(Spaceship_noFlames.class) .isEmpty() )
        {
            Greenfoot.setWorld( new BombRoom() );
        }  
    }
    
    
    /**
     * checkForExplosion checks to see if the bomb actor is still in the world, if it is not, then this method explodes the players
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void checkForExplosion()
    {
        if(getObjects( Bomb.class) .isEmpty() )
        {
            addObject( new Explosion(), 275, 305 ); 
            roomGoesBoom();
        }
    }
    
    
    /**
     * roomGoesBoom blows up the creen when you win or lose
     * 
     * @param Ther are no parameters
     * @return Nothing is returned
     */
    private void roomGoesBoom()
    {
        for( int i = 0; i < 5; i++ )
        {
            addObject( new Explosion(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber(getHeight() ));
            showText(" You Lose", getHeight()/2, getWidth()/2 );
        }
        Greenfoot.playSound("au.wav");
    }

    
}
