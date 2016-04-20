/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Paul
 */
import java.awt.*;
public class Customer extends Rectangle{
    
    private String[] animation;
 
    
    public Customer(Dimension inf_FrameSize)
    {
        animation = new String [] {"src/pic/right1.png" , "src/pic/right2.png" , "src/pic/left1.png" , 
            "src/pic/left2.png" , "src/pic/up1.png" , "src/pic/up2.png" , "src/pic/down1.png" , "src/pic/down2.png"};
        double tempHeight = inf_FrameSize.height * .125;
        double tempWidth = inf_FrameSize.width * .05;
        double tempX = inf_FrameSize.width * .875;
        double tempY = inf_FrameSize.height * .666;
        height = (int) tempHeight;
        width = (int) tempWidth;
        x = (int) tempX;
        y = (int) tempY;
    }
    
    
    public String[] getAnimation()
    {
        return animation;
    }
}
