import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hunter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hunter extends Actor
{
    
    /** add the hunter in at your own discreation. This will make the 2nd world very challenging
    /**
     * Act - do whatever the Hunter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        huntBulldozers();
    }    
    
    
    
    private void huntBulldozers()
    {
      if( getWorld().getObjects(Bulldozer_AI.class).size() > 0)
        {
            turnTowards( getNearestActor().getX(), getNearestActor().getY() );
        }   
    }
    
    
    /**
     * getNearestActor finds the nearset bulldozer and 
    */
    private Actor getNearestActor()
    {
        //Hunts the bulldozers
        List<Bulldozer_AI> closeDozer = getObjectsInRange(800,Bulldozer_AI.class);
        Actor nearestActor = closeDozer.get(0);
        double nearestDistance = 800;
        double currentDistance;
        for(int i=0; i< closeDozer.size(); i++)
        {
            currentDistance = getDistance(closeDozer.get(i) );
            if(currentDistance < nearestDistance)
            {
                nearestActor = closeDozer.get(i);
                nearestDistance=currentDistance;
            }
        }
        
        return nearestActor;
        
    }
    
    /**
     * getDistance finds the distance between x1/y1 and x2/y2 
       */
    private double getDistance(Actor otherActor)
    {
        return Math.hypot(otherActor.getX()-getX(), otherActor.getY()-getY() );
    }
}
