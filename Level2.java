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
    private final Class NEXT_LEVEL = Level3.class;
    
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
        addObject(gem, 0, 0);
        addObject(new Floor(), 600, 800);
        addObject(new BrickWall(), 1300, 100);
        addObject(new SmBrickWall(), 900,150);
        addObject(new SmBrickWall(), 800,200);
        addObject(new SmBrickWall(), 675,250);
        addObject(new SmBrickWall(), 550,300);
        addObject(new SmBrickWall(), 425,350);
        addObject(new SmBrickWall(), 300,400);
        addObject(new SmBrickWall(), 175,450);
        addObject(new SmBrickWall(), 50, 500);
        
        addObject(new SmBrickWall(), 1100, 300);
        addObject(new SmBrickWall(), 925, 350);
        addObject(new SmBrickWall(), 800, 400);
        addObject(new SmBrickWall(), 675, 450);
        addObject(new SmBrickWall(), 550, 500);
        addObject(new SmBrickWall(), 425, 600);
        addObject(new SmBrickWall(), 300, 650);
        addObject(new SmBrickWall(), 325, 650); 
        
        addObject(new Bomb(GRAVITY), 325, 600);
        addObject(new Bomb(GRAVITY), 50, 450);
        addObject(new Bomb(GRAVITY), 800, 150);

        
        addObject(new Gem(), 200, 400);
        addObject(new Gem(), 100, 600);
        addObject(new Gem(), 0, 0);

      
        
        
        
    }
    
    private void spawn()
    {
        if(Math.random() < 0.0015)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1000), 1);
        }
        
              if(Math.random() < 0.0015)
        {
            addObject(new AcidRain(GRAVITY), Greenfoot.getRandomNumber(1000), 1);
        }
    }
    
}
