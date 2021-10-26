import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portal1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portal1 extends Actor
{
    // portalLink is the portal object that this portal object teleports another type object to
    Portal1 portalLink;
    
    /**
     * Portal Constructor: creates the image of the portal
     * (a lot more could be done with the image, but this will suffice for the demo)
     *
     * @param color A parameter that determines the color of the portal image
     */
    public Portal1(Color color)
    {
        GreenfootImage image = new GreenfootImage(60, 120);
        image.setColor(color);
        image.fillOval(0, 0, 59, 119);
        setImage(image);
    }
    
    /**
     * Method setPortalLink: allows other classes to set up the link between two portals
     *
     * @param portal A parameter being the portal object that this portal object is linked to
     */
    public void setPortalLink(Portal1 portal1)
    {
        portalLink = portal1;
    }
    
    /**
     * Method getPortalLink: allows other classes to get the linked portal object to this portal object
     *
     * @return The return value being the portal object that this portal object is linked to
     */
    public Portal1 getPortal1Link()
    {
        return portalLink;
    }
}
