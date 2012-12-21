package wg.androidgames.framework.math;

public class Rectangle {
	
    public float x, y;
    public float width, height;
    
    public Rectangle(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public void addPosition(float x, float y)
    {
    	this.x += x;
    	this.y += y;
    }
    
    public Vector2 getCenter() 
    {
    	return new Vector2(this.x + this.width/2, this.y + this.height/2);
    }
    
    public float getCenterX()
    {
    	return this.x + this.width/2;
    }
    
    public float getCenterY()
    {
    	return this.y + this.height/2;
    }
    
    public float getBottom()
    {
    	return this.y + this.height;
    }
    
    public float getTop()
    {
    	return this.y;
    }
    
    public float getRight()
    {
    	return this.x + this.width;
    }
    
    public float getLeft()
    {
    	return this.x;
    }
    
}
