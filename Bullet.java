import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
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
        if(Greenfoot.isKeyDown("/") )
        {
            getWorld().addObject(new Bullet(), getX(), getY()  );
        }
        bulletZoom(); 
        if (isTouching(Alien.class) == true )
        {
            removeTouching(Alien.class);
        }   
    }    
    /**
     * bulletZoom tells the bullet how far to move each act cycle
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void bulletZoom()
    {
        move(5);  
    }
    
    
}
