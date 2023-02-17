package lab6_3;

public class Point2D {
    protected float x=0.0f;
    protected float y=0.0f;
    public Point2D(){}
    public Point2D(float x, float y )
    {
        this.x = x;
        this.y = y;
    }
    public float getX()
    {
        return this.x;

    }
    public void setX(float x)
    {
        this.x=x;
    }
    public float getY()
    {
        return this.y;
    }
    public void setY(float y)
    {
        this.y = y;
    }
    public float[] getXY()
    {
        float[] a = new float[2];
        a[1] = getX();
        a[2]=getY();
        return a;
    }
    public void setXY(float x, float y)
    {
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString()
    {
        return "x: "+this.x+"y:"+this.y+"";
    }
}
