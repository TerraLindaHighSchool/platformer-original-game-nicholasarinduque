import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author Nicholas Arinduque
 * @version 9/16/2021
 */
public class Level4 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound Music = new GreenfootSound("soundepic.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = WinSplash.class;
    
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level4()
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
        addObject(door,600,44);
        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY, MAX_HEALTH, 
                                   MAX_POWERUP, NEXT_LEVEL, Music);
        addObject(player,96,750);
        Gem gem = new Gem();

        addObject(new Floor(), 600, 800);

        
        addObject(new SmBrickWall(), 500, 700);
        addObject(new TrapDoor(GRAVITY), 350, 600);
        addObject(new TrapDoor(GRAVITY), 150, 500);
        addObject(new TrapDoor(GRAVITY), 50, 400);
        addObject(new TrapDoor(GRAVITY), 250, 300);
        addObject(new SmBrickWall(), 450, 200);
        
        addObject(new SmBrickWall(), 650, 700);
        addObject(new TrapDoor(GRAVITY), 800, 600);
        addObject(new TrapDoor(GRAVITY), 950, 500);
        addObject(new TrapDoor(GRAVITY), 1150, 400);
        addObject(new TrapDoor(GRAVITY), 950, 300);
        addObject(new TrapDoor(GRAVITY), 800, 200);
        addObject(new SmBrickWall(), 600, 100);
        
        addObject(new SmBrickWall(), 600,300);
        addObject(new SmBrickWall(), 600,500);
        
        addObject(new SmBrickWall(), 400, 400);
        addObject(new SmBrickWall(), 800, 400);
        
        

        addObject(new Bomb(GRAVITY), 800, 155);
        addObject(new Bomb(GRAVITY), 500, 155);


      
        
        
        
    }
    
    private void spawn()
    {
        if(Math.random() < 0.02)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1000), 1);
        }
        
              if(Math.random() < 0.001)
        {
            addObject(new AcidRain(GRAVITY), Greenfoot.getRandomNumber(1000), 1);
        }
    }
    
}
