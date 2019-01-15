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
    private int imageNum = 0;

    /** How much do we increment the index in the explosion animation. */
    private int increment = 1;

    private int actCycles = 0;

    public Explosion()
    {
        initializeImages();
        setImage( images[0] );
    }

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

    private synchronized static void initializeImages()
    {

        GreenfootImage baseImage = new GreenfootImage( "explosion-big.png" ); 

        int size;

        if (images == null )
        {
            images = new GreenfootImage[IMAGE_COUNT];

            for( int i = 0; i < IMAGE_COUNT; i++ )
            {
                size = (i+1)*(baseImage.getWidth()/IMAGE_COUNT);

                images[i] = new GreenfootImage(baseImage);

                images[i].scale(size,size);
            }
        }
    }

}
