package tiktactoe;
import javax.imageio.*;
import java.awt.image.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;
public class about extends Frame implements ActionListener
{
  Button back;
  Image b;
  about(Image a)
  {
    b=a;
    setUndecorated(true);
    setVisible(true);
    setSize(400,600);
    setLocation(400,100);
    setLayout(null);
    setForeground(new Color(66,43,15));
    setFont(new Font("Berlin Sans FB",Font.BOLD,15));
  
    back=new Button("BACK");
    add(back);
    back.setSize(60,30);
    back.setLocation(20,550);
    back.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==back)
    {
       demo d=new demo(b);
       setVisible(false);
    } 
  }
  
  public void paint(Graphics g)
  {
     g.drawImage(b,0,0,null); 
     g.setFont(new Font("Berlin Sans FB",Font.BOLD,35));
     g.setColor(Color.WHITE);
     g.drawString("ABOUT",135,80);
     g.fillRoundRect(0,150,400,380,40,40);
    g.setColor(new Color(66,43,15)); 
     g.setFont(new Font("Constantia",Font.PLAIN,20));
    g.drawString("This game of TIK-TAC-TOE is developed",20,200);
    g.drawString("by Developer Dharmik Bhadra from YBPP.",20,230);
    g.drawString("It is developed as a micro-project for java",20,290);
    g.drawString("under guidance of Mrs Sukeshini Gawai",20,320);
    g.drawString("This game is developed using java awt and",20,350);
    g.drawString("javax.It is a simple TIK-TAC-TOE game.",20,380);
    g.drawString("This game is under CopyRight of BRO ",20,410);
    g.drawString("PVT LTD and Illegal use of game without",20,440);
    g.drawString("the permission is serious criminal offense",20,470);
   g.drawString("under YBPC Law 240,340 and 440.",20,500);
   
  }
public static void main(String args[])
{
  //about a=new about();
}
}