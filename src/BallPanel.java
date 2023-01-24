import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallPanel extends JPanel{
    Ball[] balls= new Ball[100];
    Ball yo = new Ball((int)(Math.random()*40),(int)(Math.random()*40),(int)(Math.random()*40),(int)(Math.random()*40),(int)(Math.random()*40));


    public BallPanel(){
        setFocusable(true);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
            int keyCode= e.getKeyCode();
            if(keyCode==68){
                yo.moveRight();
            }
            if(keyCode==65){
                yo.moveLeft();
            }
            if(keyCode==87){
                yo.moveUp();
            }
            if(keyCode==83){
                yo.moveDown();
            }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        setBackground(Color.BLUE);
        for(int i=0; i<balls.length;i++){
            balls[i]=new Ball((int)(Math.random()*40),(int)(Math.random()*40),(int)(Math.random()*40),(int)(Math.random()*40),(int)(Math.random()*40));

        }
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i=0; i<balls.length;i++){
            balls[i].drawBall(g);
            balls[i].moveBall(this);
        }
        yo.drawBall(g);





        try{
            Thread.sleep(14);
        }catch(Exception e){
            System.out.println(e);
        }
        repaint();
    }

}