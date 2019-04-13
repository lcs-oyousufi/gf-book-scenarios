import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    /**
     * Instance variavles 
     * These can be used anywhere in the class below
     */
    
    //will keep track of whether a key was just pressed
    private boolean keyAlreadyDown;
    
    
    /**
     * Create a new key.
     */
    public Key()
    {
        //no key has been pressed
        keyAlreadyDown = false;
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        
        //animate the piano key being pressed 
        //Condition 1 - is the "g" key being pressed 
        //Condition 2 - the key was NOT already down
        if (Greenfoot.isKeyDown("g") && !keyAlreadyDown)
        {
            //key is down
            setImage("white-key-down.png");
            play();
            keyAlreadyDown = true;
        }
        
        if (keyAlreadyDown == true && Greenfoot.isKeyDown("g") == false )
        {
            //key is up
            setImage("white-key.png");
            keyAlreadyDown = false;
        }
        
    }
    
    /**
     * Play the note of this key.
     */
    public void play()
    {
        Greenfoot.playSound("3a.wav");
    }
}

