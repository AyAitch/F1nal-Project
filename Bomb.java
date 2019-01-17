import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{

    
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
        // Add your action code here.
        blowUp();
    }    
    
    /**
     * blowUp tells the bomb to blow up when piper or martine touches the bomb actor/object
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void blowUp()
    {
        if( isTouching(Piper.class) || isTouching((Martine.class) ) )
        {
            getWorld().removeObject( this );  
        }
    }
}
