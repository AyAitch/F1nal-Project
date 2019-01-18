import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * An explosion. It starts by expanding and then collapsing. 
 * The explosion will explode other obejcts that the explosion intersects.
 * 
 * @author Poul Henriksen
 * @version 1.0.1
 */
public class Explosion extends Actor
{
    /** How many images should be used in the animation of the explostion */
    private static final int IMAGE_COUNT = 12;

    /** 
     * The images in the explosion. This is static so the images are not
     * recreated for every object (improves performance significantly).
     */
    private static GreenfootImage[] images; 

    /** Current size of the explosion */
    // sets the integer value of imageNum to 0
    private int imageNum = 0;

    /** How much do we increment the index in the explosion animation. */
    // sets the integer value of increment to 1
    private int increment = 1;
    
    // sets the integer value of actCycles to 0
    private int actCycles = 0;
    
    /**
     * Constructor for objects of class Explosion.
     * 
     */
    public Explosion()
    {
        initializeImages();
        setImage( images[0] );
    }
    
    
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

        actCycles++;
        setImage(images[imageNum] );
        imageNum+= increment;
        if( imageNum >= IMAGE_COUNT )
        {
            increment = -increment;
            imageNum = imageNum + increment;
        }
        if ( imageNum < 0 )
        {
            getWorld().removeObject(this); 
            actCycles = 0;
        }

    }

    /**
     * initializeImages initializes the images  for all explosions at once
     * 
     * @param None Their are no parameters
     * @return Nothing is returned
     */    
    private synchronized static void initializeImages()
    {

        GreenfootImage baseImage = new GreenfootImage( "explosion-big.png" ); 

        int size;

        if (images == null )
        {
            images = new GreenfootImage[IMAGE_COUNT];
            // as long as i is less that IMAGE_COUNT...
            for( int i = 0; i < IMAGE_COUNT; i++ )
            {
                // size is i + 1 multiplyied by the width of the of the base image divided by IMAGE_COUNT
                size = (i+1)*(baseImage.getWidth()/IMAGE_COUNT);
               
                images[i] = new GreenfootImage(baseImage);
                
                // scales the size of the images to the integer varible size for the height and width
                images[i].scale(size,size);
            }
        }
    }

}
