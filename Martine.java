import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Martine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Martine extends Actor
{
    /**
     * Act - do whatever the Martine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        movement();

    }    

    private void movement()
    {
        if(Greenfoot.isKeyDown("d") )
        {
            setLocation( getX()+1, getY() );
        }   
        if ( Greenfoot.isKeyDown("a") )
        {
            setLocation( getX()-1, getY() );
        }
        if ( Greenfoot.isKeyDown("w") )
        {
            setLocation( getX(), getY()-1 );
        }
        if ( Greenfoot.isKeyDown("s") )
        {
            setLocation( getX(), getY()+1 );
        }
    }

    
}
