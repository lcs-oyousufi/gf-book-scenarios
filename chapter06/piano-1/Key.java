import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    /**
     * Instance variavles 
     * These can be used anywhere in the class below
     */
    
    //will keep track of whether a key was just pressed
    private boolean keyAlreadyDown;
    //Will contain the key and sound file that this istance of the class will play
    private String key;
    private String sound;
    
    /**
     * Create a new key.
     */
    public Key(String keyName, String soundFile)
    {
        //no key has been pressed
        keyAlreadyDown = false;
        
        //set the instance varaibles using the parameters
        key = keyName;
        sound = soundFile;
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        
        //animate the piano key being pressed 
        //Condition 1 - is the "g" key being pressed 
        //Condition 2 - the key was NOT already down
        if (Greenfoot.isKeyDown(key) && !keyAlreadyDown)
        {
            //key is down
            setImage("white-key-down.png");
            play();
            keyAlreadyDown = true;
        }
        
        if (keyAlreadyDown == true && !Greenfoot.isKeyDown(key))
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
        Greenfoot.playSound(sound + ".wav");
    }
}

