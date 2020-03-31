public class Ball{
    
    private double rx, ry;
    private double vx, vy;
    private double final radius;
    
    public void move(double t){
        if(rx + t * vx < radius  || rx + t * vx < 1 - radius){
            vx = -vx;
        }
        if(ry + t * vy < radius  || ry + t * vy < 1 - radius){
            vy = -vy;
        }
    }
    
    public void draw(){
        StdDraw.filledCircle(rx,ry,radius);
    }
    
}
