import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Creature extends Actor
{
    /**
     * at edge of world detects if the Alien is near the edge of the world and 
     * will rotate itself
     */
    public boolean atEdgeOfWorld()
    {
        return getX()<5 || getY()<5 || getX()>getWorld().getWidth()-5 || getY()>getWorld().getHeight()-5;
    }   
}
