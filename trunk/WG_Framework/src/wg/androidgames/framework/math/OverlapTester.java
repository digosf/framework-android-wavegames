package wg.androidgames.framework.math;

public class OverlapTester {
    public static boolean overlapCircles(Circle c1, Circle c2) {
        float distance = c1.center.distSquared(c2.center);
        float radiusSum = c1.radius + c2.radius;
        return distance <= radiusSum * radiusSum;
    }
    
    public static boolean overlapRectangles(Rectangle r1, Rectangle r2) {
        if(r1.x < r2.x + r2.width &&
           r1.x + r1.width > r2.x &&
           r1.y < r2.y + r2.height &&
           r1.y + r1.height > r2.y)
            return true;
        else
            return false;
    }
    
    public static boolean overlapCircleRectangle(Circle c, Rectangle r) {
        float closestX = c.center.x;
        float closestY = c.center.y;
        
        if(c.center.x < r.x) {
            closestX = r.x; 
        } 
        else if(c.center.x > r.x + r.width) {
            closestX = r.x + r.width;
        }
          
        if(c.center.y < r.y) {
            closestY = r.y;
        } 
        else if(c.center.y > r.y + r.height) {
            closestY = r.y + r.height;
        }
        
        return c.center.distSquared(closestX, closestY) < c.radius * c.radius;           
    }
    
    public static boolean pointInCircle(Circle c, Vector2 p) {
        return c.center.distSquared(p) < c.radius * c.radius;
    }
    
    public static boolean pointInCircle(Circle c, float x, float y) {
        return c.center.distSquared(x, y) < c.radius * c.radius;
    }
    
    public static boolean pointInRectangle(Rectangle r, Vector2 p) {
        return r.x <= p.x && r.x + r.width >= p.x &&
               r.y <= p.y && r.y + r.height >= p.y;
    }
    
    public static boolean pointInRectangle(Rectangle r, float x, float y) {
        return r.x <= x && r.x + r.width >= x &&
               r.y <= y && r.y + r.height >= y;
    }
}