import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Lobster is an enemy
 * 
 * @Derek Newhall 
 * @9/2
 */
public class Lobster extends Actor
{
  public void act()
    {
        move(3);
        turnAtEdge();
    }

    // Turns the Crab at the edge
    private void turnAtEdge( )
    {
        if(isAtEdge())
        {
            turn(50);
        }
    }
}