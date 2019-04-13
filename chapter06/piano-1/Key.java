import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    /**
     * Create a new key.
     */
    public Key()
    {
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        
        //animate the piano key being pressed 
        if (Greenfoot.isKeyDown("g") )
        {
            //key is down
            setImage("white-key-down.png");
        }
        else
        {
            //key is up
            setImage("white-key.png")
        }
        
    }
    
    /**
     * Play the note of this key.
     */
}

