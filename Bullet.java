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
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
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
    
    
    private void bulletZoom()
    {
      move(5);  
    }
    
    private void touching()
    {
      if( atEdgeOfWorld() == true )
      {
        removeTouching( Bullet.class );
      }
    }
    
    private boolean atEdgeOfWorld()
    {    
        return getX()<5 || getY()<5 || getX()>getWorld().getWidth()-5 || getY()>getWorld().getHeight()-5;       
    }   
}
