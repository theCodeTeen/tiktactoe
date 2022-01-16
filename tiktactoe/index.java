package tiktactoe;
import javax.imageio.*;
import javax.*;
import java.awt.*;
import java.io.*;
class index
{
public static void main(String args[])
  {
    Image rimg = null,ig = null;
     try{ 
     System.out.println("some try");
     ig=ImageIO.read(new File("D:\\desktop imp\\tiktactoe\\backWood.jpg"));
     System.out.println("some ig");
     rimg=ig.getScaledInstance((int)(168*2.4),(int)(300*2),Image.SCALE_FAST);
    }catch(Exception e){System.out.println("some error");}
    demo d=new demo(rimg);
  }
}