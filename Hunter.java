import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Hunter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hunter extends Actor
{

    /**
     * Constructor for objects of class Hunter.
     * 
     */
    public Hunter()
    {
        getImage().rotate(90);  
    }

    /** add the hunter in at your own discreation. This will make the 2nd world very challengin
     */
    /**
     * Act - do whatever the Hunter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        huntBulldozers();
        move(1);
        if (isTouching(Bulldozer_AI.class) == true )
        {
            removeTouching(Bulldozer_AI.class);
        }
    }    

    /** 
     * huntBulldozers gives the hunter orders to hunt down the rest of the world actors if their are no more bulldozers
     * 
     * @param Their are no parameters
     * @return Nothing is returned
     */
    private void huntBulldozers()
    {
        if( getWorld().getObjects(Bulldozer_AI.class).size() > 0)
        {
            turnTowards( getNearestActor().getX(), getNearestActor().getY() );
        }   
        
    }

    /**
     * getNearestActor finds the nearset bulldozer and tracks it down 
     * 
     * @param There are no parameters
     * @retunr A actor is returned
     */
    private Actor getNearestActor()
    {
        //Hunts the bulldozers
        List<Bulldozer_AI> closeDozer = getObjectsInRange(1600,Bulldozer_AI.class);
        Actor nearestActor = closeDozer.get(0);
        double nearestDistance = 1600;
        double currentDistance;
        for(int i=0; i< closeDozer.size(); i++)
        {
            currentDistance = getDistance( closeDozer.get(i) );
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
