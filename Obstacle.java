import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacale here.
 * 
 * @author Nicholas Arinduque
 * @version 9/23/2021
 */
public abstract class Obstacle extends Actor
{
    protected abstract void fall();
        
    //Retruns tru of child object is on the platform 
    protected boolean isOnGround()
    {
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2,
                                          Platform.class);
        return ground !=null; 
    }
    
    ///Removes child objects no longer in scene 
    protected void removeOutBounds(Obstacle obstacle)
    {
        if(obstacle.getY() > getWorld().getHeight()+
                            obstacle.getImage().getHeight() / 2)
        {
            getWorld().removeObject(obstacle);
        }                    
    }
}
