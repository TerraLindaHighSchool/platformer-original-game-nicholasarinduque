import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author Nicholas Arinduque
 * @version 9/16/2021
 */
public class Level2 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound Music = new GreenfootSound("incompetech_tribal.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = WinSplash.class;
    
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level2()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
        prepare();
    }
    
    public void act()
    {
        spawn();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectable.class,
            Door.class, HUD.class);
        Door door = new Door();
        addObject(door,1174,44);
        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY, MAX_HEALTH, 
                                   MAX_POWERUP, NEXT_LEVEL, Music);
        addObject(player,96,750);
        Gem gem = new Gem();
        addObject(gem, 890, 488);
        addObject(new Floor(), 600, 800);
        addObject(new BrickWall(), 0, 00);
        addObject(new BrickWall(), 960, 100);
        addObject(new SmBrickWall(),00,00);
        addObject(new SmBrickWall(), 0,0);
        addObject(new SmBrickWall(), 0,0);
        addObject(new SmBrickWall(), 0,0);
        addObject(new SmBrickWall(), 0,0);
        addObject(new SmBrickWall(), 0,0);
        addObject(new SmBrickWall(), 0,0);
        addObject(new TrapDoor(GRAVITY), 0, 00); 
        addObject(new TrapDoor(GRAVITY),000, 00);
        addObject(new Bomb(GRAVITY), 465, 115);
        addObject(new Bomb(GRAVITY), 1050, 765);
        addObject(new Gem(), 975, 160);
        addObject(new Gem(), 1030, 160);

      
        
        
        
    }
    
    private void spawn()
    {
        if(Math.random() < 0)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(0), 0);
        }
    }
    
}
