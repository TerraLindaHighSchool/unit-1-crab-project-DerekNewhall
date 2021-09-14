import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lemur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lemur extends Actor
{
  public void act()
    {
        move(14);
        turnAtEdge();
        onCollision();
    }

    // Turns the Mouse at the edge
    private void turnAtEdge( )
    {
        if(isAtEdge())
        {
            turn(Greenfoot.getRandomNumber(150));
        }
    }
    
    private void onCollision( )
    {
        if(isTouching(Mouse.class))
        {
            Greenfoot.playSound("amongus.wav");
            Greenfoot.stop();
        }
    }
}