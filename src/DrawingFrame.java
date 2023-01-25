//added a comment
//yooooo
import javax.swing.*;
import java.awt.*;
public class DrawingFrame{
    public static void main(String[] args){
        JFrame myFrame=new JFrame();
        myFrame.setSize(500,500);
        //drawPanel myPanel=new drawPanel();
        BallPanel bPanel= new BallPanel();


        myFrame.add(bPanel);
        myFrame.setVisible(true);

    }
}