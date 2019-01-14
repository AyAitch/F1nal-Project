import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceshipP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceshipP extends Actor
{
    private int speed = 15;
    public SpaceshipP()
    {
        getImage().rotate(90);
    }
    /**
     * Act - do whatever the SpaceshipP wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here
        crazyDumbMovement();
        move(1);
        if( Greenfoot.isKeyDown("/") )
        {
         shoot();   
        }
    }  
    
    private void shoot()
    {
     Bullet toAdd = new Bullet();
     
     toAdd.setRotation( getRotation() );
     
     getWorld().addObject(toAdd, getX(), getY() );
    }
    
    
    private void crazyDumbMovement()
    {
      if( Greenfoot.isKeyDown("right") )
      {
        turn(5);  
      }
      else if( Greenfoot.isKeyDown("left") )
      {
        turn(-5) ;  
      }
      else if( Greenfoot.isKeyDown("up") )
      {
        move(3);  
      }
      else if( Greenfoot.isKeyDown("down") )
      {
        move(-2);   
      }
    }
}
