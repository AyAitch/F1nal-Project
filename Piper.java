import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Piper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piper extends Actor
{
    /**
     * Act - do whatever the Piper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        movement();
        
    }   
    
    
    private void movement()
    {
     if(Greenfoot.isKeyDown("right") )
        {
            setLocation( getX()+1, getY() );
        }   
     if ( Greenfoot.isKeyDown("left") )
        {
            setLocation( getX()-1, getY() );
        }
     if ( Greenfoot.isKeyDown("up") )
        {
            setLocation( getX(), getY()-1 );
        }
     if ( Greenfoot.isKeyDown("down") )
        {
            setLocation( getX(), getY()+1 );
        }
    }
    
   
    
}
