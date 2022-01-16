package tiktactoe;
import javax.imageio.*;
import java.awt.image.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;
public class history extends Frame implements ActionListener
{
   Image img;
   Button b;
   File f;
   BufferedReader br;
   BufferedWriter bw;
   Vector<String> vec;
   String s;
   int count;
   history(Image rimg)
   {
      count=0;
      img=rimg;
    try{f=new File("D:\\desktop imp\\tiktactoe\\History.txt");
    if(!f.exists())
    f.createNewFile();
    br=new BufferedReader(new FileReader(f));
    }catch(Exception ee){}
    vec=new Vector<String>();
    setSize(400,600);
    setUndecorated(true);
    setVisible(true);
    setSize(400,600);
    setLocation(400,100);
    setLayout(null);
    setForeground(new Color(66,43,15));
    setFont(new Font("Berlin Sans FB",Font.BOLD,30));

    b=new Button("BACK");
    b.setSize(70,20);
    b.setLocation(10,570);
    b.setFont(new Font("Berlin Sans FB",Font.BOLD,20));
    b.addActionListener(this);
    add(b);

    try{
      vec.clear();
       while((s=br.readLine())!=null)
       {   vec.add(s);
           count++; 
       }
     
     }catch(IOException ee){ee.printStackTrace();}
   }
   
   public void actionPerformed(ActionEvent e)
  {
    demo d=new demo(img);
    setVisible(false);
  }
   public void paint(Graphics g)
  {
     int y=55,x2=30,y2=100;
     
     g.drawImage(img,0,0,null);
     g.setColor(Color.WHITE);
     g.drawString("HISTORY",140,35);
     g.fillRoundRect(5,55,390,500,15,15);
     g.setColor(new Color(66,43,15));
     for(int i=0;i<10;i++)
     {
         g.drawLine(5,y,395,y);
         y+=50;
      }
     g.setFont(new Font("Constantia",Font.PLAIN,25));
     if(count<=10)
    {
      for(int i=vec.size()-1;i>=0;i--)
       {
           s=vec.get(i);
          if(!s.equals("0"))
          g.drawString("Player "+s+" won",x2,y2);
          else
          g.drawString("Its an draw",x2,y2); 
          y2+=50;
      }
    }
    else
    {   y2=550;
       try{
       bw=new BufferedWriter(new FileWriter(f));
       for(int i=vec.size()-10;i<vec.size();i++)
       {
           s=vec.get(i);
           bw.write(s);
           bw.newLine();
           if(!s.equals("0"))
          g.drawString("Player "+s+" won",x2,y2);
          else
          g.drawString("Its an draw",x2,y2); 
          y2-=50;
       }
       bw.close();
       }catch(Exception ee){ee.printStackTrace();}
    

    } 
  }
 
}