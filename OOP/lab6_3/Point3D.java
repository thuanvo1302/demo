package lab6_3;

public class Point3D extends Point2D {
    private float z= 0.0f;
    public Point3D(){}
    public Point3D(float x, float y, float z)
    {
        super(x, y);
        this.z = z;
    }
    public float getZ()
    {
        return this.z;
    }
    public void setZ(float z)
    {
        this.z = z;
    }
    public float[] getXYZ()
    {
        float[] a = new float[3];
        a[1] = getX();
        a[2] = getY();
        a[3] = getZ();
        return a;
    }
    public void setXYZ(float x, float y,float z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    @Override
    public String toString()
    {
        return "x: "+this.x+"y:"+this.y+"z: "+this.z+"";
    }
}
