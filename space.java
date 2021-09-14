import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class space extends World
{

    /**
     * Constructor for objects of class space.
     * 
     */
    public space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        prepare();
    }

    private void prepare()
    {
        Mouse mouse = new Mouse();
        addObject(mouse,241,218);
        Pizza pizza = new Pizza();
        addObject(pizza,302,305);
        Pizza pizza2 = new Pizza();
        addObject(pizza2,425,170);
        Pizza pizza3 = new Pizza();
        addObject(pizza3,272,72);
        Pizza pizza4 = new Pizza();
        addObject(pizza4,414,364);
        Pizza pizza5 = new Pizza();
        addObject(pizza5,321,434);
        Pizza pizza6 = new Pizza();
        addObject(pizza6,168,392);
        Pizza pizza7 = new Pizza();
        addObject(pizza7,105,311);
        Pizza pizza8 = new Pizza();
        addObject(pizza8,168,133);
        Lemur lemur = new Lemur();
        addObject(lemur,382,266);
        Pizza pizza9 = new Pizza();
        addObject(pizza9,469,486);
        Pizza pizza10 = new Pizza();
        addObject(pizza10,60,521);
        Pizza pizza11 = new Pizza();
        addObject(pizza11,51,41);
        Pizza pizza12 = new Pizza();
        addObject(pizza12,500,58);
    }
    
}   


