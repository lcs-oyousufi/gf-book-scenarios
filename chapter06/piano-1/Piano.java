import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    /**
     * Instance variables
     * (we can use these variables anywhere in the class)
     */
    int frames;
    
    //create the array(list of names)
    String[] peopleInClass = {"Julio", "Liam", "Dima", "Osman", "Nick", "Simon", "Eric", "Phillip", 
        "Joven", "Joe", "Gordon", "Jieun", "Selena", "Jason", "Sam", "Jeff"
    };
    
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        
        //Initialize the instance variables
        frames=0;
    }
    
    /**
     * act
     * (gets called repeatedly to create animation)
     */
    public void act()
    {
        //Track frames
        frames += 1;
        
        //show the frames
        showText("" + frames, 100, 100);
    }
}