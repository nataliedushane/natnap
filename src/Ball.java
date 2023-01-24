import javax.swing.*;
import java.awt.*;
public class Ball{
    private int x,y,size,xSpeed,ySpeed, r, green, b;


    public Ball(int inputX, int inputY, int inputSize,int inxSpeed, int inySpeed){
        x=inputX;
        y=inputY;
        size=inputSize;
        xSpeed=inxSpeed;
        ySpeed=inySpeed;
        r=(int)(Math.random()*256);
        green= (int)(Math.random()*256);
        b=(int)(Math.random()*256);
    }


    public void drawBall(Graphics g){
        g.fillOval(x,y,size,size);
        g.setColor(new Color(r,green,b));
    }
    public void moveBall(JPanel bPanel){
        x+=xSpeed;
        y+=ySpeed;
        if(x>=bPanel.getWidth()-size||x<=0){
            xSpeed*=-1;
        }
        if(y>=bPanel.getHeight()-size||y<0){
            ySpeed*=-1;
        }
    }
    public void moveRight(){
        x=x+xSpeed;
    }
    public void moveLeft(){
        x=x-xSpeed;
    }
    public void moveUp(){
        y=y-ySpeed;
    }
    public void moveDown(){
        y=y+ySpeed;
    }


    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getSize(){
        return size;
    }
}