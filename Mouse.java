import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mouse extends Actor
{
    // This method repeats the following actions
    public void act()
    {
        move(0);
        turnAtEdge();
        checkKeyPress();
        onCollision();
        turn(-7); 
    }

    // Turns the Crab at the edge
    private void turnAtEdge( )
    {
        if(isAtEdge())
        {
            turn(50);
        }
    }
    
    // Checks for user key presses so user can turn the Crab
    private void checkKeyPress( )
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+6,getY());
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-6,getY());
        }
    
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-6);
        }
    
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+6);
        }
    }
    

    // Checks for collisions with other objects
    private void onCollision( )
    {
        if(isTouching(Pizza.class))
        {
            removeTouching(Pizza.class);
            Greenfoot.playSound("slurp.wav");
        //Winning the Game
        if(getWorld().getObjects(Pizza.class).size() == 0)
        {
            Greenfoot.setWorld(new WinSplash());
            Greenfoot.playSound("fanfare.wav");
            Greenfoot.stop();
        }
        
        if(isTouching(Lemur.class))
        {
            Greenfoot.playSound("amongus.wav");
            Greenfoot.stop();
        }
        }
    }
}