package tiktactoe;
import javax.imageio.*;
import java.awt.image.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;
class game extends Frame implements ActionListener
{  
   Image a;
   Button b1,b2,b3,b4,b5,b6,b7,b8,b9,back;
   Label l;
   Button bb2;
   File f,f2;
   Dialog d;
   BufferedWriter bw,bw2;
   BufferedReader br,br2;
   int i=1;
   int in;
   String s1,s2;
   game(Image r,boolean b)
   {
    
    setSize(400,600);
    setUndecorated(true);
    setVisible(true);
    setSize(400,600);
    setLocation(400,100);
    setLayout(null);
    setForeground(new Color(66,43,15));
    setFont(new Font("Berlin Sans FB",Font.BOLD,40));

    a=r;
    back=new Button("BACK");
    back.setSize(70,20);
    back.setLocation(10,570);
    back.addActionListener(this);
    back.setFont(new Font("Berlin Sans FB",Font.BOLD,20));
    add(back);

    b1=new Button();
    b1.setSize(130,160);
    b1.setLocation(2,70);
    b1.addActionListener(this);
    add(b1);

    b2=new Button();
    b2.setSize(130,160);
    b2.setLocation(135,70);
    b2.addActionListener(this);
    add(b2);

    b3=new Button();
    b3.setSize(130,160);
    b3.setLocation(268,70);
    b3.addActionListener(this);
    add(b3);
    
    b4=new Button();
    b4.setSize(130,160);
    b4.setLocation(2,235);
    b4.addActionListener(this);
    add(b4);

    b5=new Button();
    b5.setSize(130,160);
    b5.setLocation(135,235);
    b5.addActionListener(this);
    add(b5);

    b6=new Button();
    b6.setSize(130,160);
    b6.setLocation(268,235);
    b6.addActionListener(this);
    add(b6);

    b7=new Button();
    b7.setSize(130,160);
    b7.setLocation(2,400);
    b7.addActionListener(this);
    add(b7);

    b8=new Button();
    b8.setSize(130,160);
    b8.setLocation(135,400);
    b8.addActionListener(this);
    add(b8);

    b9=new Button();
    b9.setSize(130,160);
    b9.setLocation(268,400);
    b9.addActionListener(this);
    add(b9);
    
    
    try{
    f=new File("D:\\desktop imp\\tiktactoe\\ScoreBook.txt");
    if(!f.exists())
    f.createNewFile();
    
    f2=new File("D:\\desktop imp\\tiktactoe\\History.txt");
    if(!f2.exists())
    f2.createNewFile();
    
    bw2=new BufferedWriter(new FileWriter(f2,true));
    br=new BufferedReader(new FileReader(f));
    
    if(b)
    {
       while((s1=br.readLine())!=null)
       {
          s2=br.readLine();
          in=Integer.parseInt(s1);
          switch(in)
          {
            case 1:
            b1.setLabel(s2);
            break;
            case 2:
            b2.setLabel(s2);
            break;
            case 3:
            b3.setLabel(s2);
            break;
            case 4:
            b4.setLabel(s2);
            break;
            case 5:
            b5.setLabel(s2);
            break;
            case 6:
            b6.setLabel(s2);
            break;
            case 7:
            b7.setLabel(s2);
            break;
            case 8:
            b8.setLabel(s2);
            break;
            case 9:
            b9.setLabel(s2);
            break;
         }
       }
    }
    bw=new BufferedWriter(new FileWriter(f));
    }catch(Exception ee){}
   }
   public void actionPerformed(ActionEvent e)
  {
      Button b=(Button)e.getSource();
      String s=b.getLabel();
      
      if(s.equals(""))
     {
      if(i%2==1)
      b.setLabel("X");
      else
      b.setLabel("O");
      i++;
     }
     if(e.getSource()==back)
     {
        demo dd=new demo(a);
        
        setVisible(false);
        try{
        if(!(b1.getLabel().equals("")))
        { 
           bw.write("1");
           bw.newLine();
           bw.write(b1.getLabel());
           bw.newLine();
        }
        if(!(b2.getLabel().equals("")))
        { 
           bw.write("2");
           bw.newLine();
           bw.write(b2.getLabel());
           bw.newLine();
        }
        if(!(b3.getLabel().equals("")))
        { 
           bw.write("3");
           bw.newLine();
           bw.write(b3.getLabel());
           bw.newLine();
        }
        if(!(b4.getLabel().equals("")))
        { 
           bw.write("4");
           bw.newLine();
           bw.write(b4.getLabel());
           bw.newLine();
        }
        if(!(b5.getLabel().equals("")))
        { 
           bw.write("5");
           bw.newLine();
           bw.write(b5.getLabel());
           bw.newLine();
        }
        if(!(b6.getLabel().equals("")))
        { 
           bw.write("6");
           bw.newLine();
           bw.write(b6.getLabel());
           bw.newLine();
        }
        if(!(b7.getLabel().equals("")))
        { 
           bw.write("7");
           bw.newLine();
           bw.write(b7.getLabel());
           bw.newLine();
        }
        if(!(b8.getLabel().equals("")))
        { 
           bw.write("8");
           bw.newLine();
           bw.write(b8.getLabel());
           bw.newLine();
        }
        if(!(b9.getLabel().equals("")))
        { 
           bw.write("9");
           bw.newLine();
           bw.write(b9.getLabel());
           bw.newLine();
        }
        bw.close();
        }catch(Exception ee){}
     }
     
          
    if(e.getSource()==bb2)
    {
       demo dd=new demo(a);
       setVisible(false);
       d.setVisible(false);
       try{bw2.close();}catch(Exception ee){}
       
    }
    else if(((b1.getLabel().equals(b2.getLabel())&&b2.getLabel().equals(b3.getLabel()))||(b1.getLabel().equals(b4.getLabel())&&b4.getLabel().equals(b7.getLabel())))&&((!b1.getLabel().equals(""))))
    {
         
          bb2=new Button("OK");
          bb2.setSize(50,20);
          bb2.setLocation(175,150);
          bb2.setFont(new Font("Berlin Sans FB",Font.BOLD,15));
          bb2.addActionListener(this);
          d=new Dialog(this,"winner");
          d.setLayout(null);
           d.setBackground(new Color(66,43,15));
           d.setUndecorated(true);
         d.setFont(new Font("Berlin Sans FB",Font.BOLD,25));
           d.setSize(400,200);
           d.setLocation(400,300);
           d.add(bb2);
           d.setVisible(false);
          if(b1.getLabel().equals("X"))
          {
           l=new Label("Player 1 wins");
           try{bw2.write("1");
           bw2.newLine();}catch(Exception ee){}
           l.setSize(180,30);
           l.setLocation(110,80);
           l.setForeground(Color.WHITE);
           d.add(l);
           d.setVisible(true);
          }
          if(b1.getLabel().equals("O"))
          {
           l=new Label("Player 2 wins");
           try{bw2.write("2");
           bw2.newLine();}catch(Exception ee){}
           l.setSize(180,30);
           l.setLocation(110,80);
           l.setForeground(Color.WHITE);
           d.add(l);
           d.setVisible(true);
          }
      }
      else if(((b9.getLabel().equals(b8.getLabel())&&b8.getLabel().equals(b7.getLabel()))||(b9.getLabel().equals(b6.getLabel())&&b6.getLabel().equals(b3.getLabel())))&&((!b9.getLabel().equals(""))))
    {
         
          bb2=new Button("OK");
          bb2.setSize(50,20);
          bb2.setLocation(175,150);
          bb2.setFont(new Font("Berlin Sans FB",Font.BOLD,15));
          bb2.addActionListener(this);
          d=new Dialog(this,"winner");
          d.setLayout(null);
           d.setBackground(new Color(66,43,15));
           d.setUndecorated(true);
         d.setFont(new Font("Berlin Sans FB",Font.BOLD,25));
           d.setSize(400,200);
           d.setLocation(400,300);
           d.add(bb2);
           d.setVisible(false);
          if(b9.getLabel().equals("X"))
          {
           l=new Label("Player 1 wins");
           try{bw2.write("1");
           bw2.newLine();}catch(Exception ee){}
           l.setSize(180,30);
           l.setLocation(110,80);
           l.setForeground(Color.WHITE);
           d.add(l);
           d.setVisible(true);
          }
          if(b9.getLabel().equals("O"))
          {
           l=new Label("Player 2 wins");
           try{bw2.write("2");
           bw2.newLine();}catch(Exception ee){}
           l.setSize(180,30);
           l.setLocation(110,80);
           l.setForeground(Color.WHITE);
           d.add(l);
           d.setVisible(true);
          }
      }
      else if(((b2.getLabel().equals(b5.getLabel())&&b5.getLabel().equals(b8.getLabel()))||(b4.getLabel().equals(b5.getLabel())&&b5.getLabel().equals(b6.getLabel()))||(b1.getLabel().equals(b5.getLabel())&&b5.getLabel().equals(b9.getLabel()))||(b3.getLabel().equals(b5.getLabel())&&b5.getLabel().equals(b7.getLabel())))&&((!b5.getLabel().equals(""))))
    {
         
          bb2=new Button("OK");
          bb2.setSize(50,20);
          bb2.setLocation(175,150);
          bb2.setFont(new Font("Berlin Sans FB",Font.BOLD,15));
          bb2.addActionListener(this);
          d=new Dialog(this,"winner");
          d.setLayout(null);
           d.setBackground(new Color(66,43,15));
           d.setUndecorated(true);
         d.setFont(new Font("Berlin Sans FB",Font.BOLD,25));
           d.setSize(400,200);
           d.setLocation(400,300);
           d.add(bb2);
           d.setVisible(false);
          if(b5.getLabel().equals("X"))
          {
           l=new Label("Player 1 wins");
           try{bw2.write("1");
           bw2.newLine();}catch(Exception ee){}
           l.setSize(180,30);
           l.setLocation(110,80);
           l.setForeground(Color.WHITE);
           d.add(l);
           d.setVisible(true);
          }
          if(b5.getLabel().equals("O"))
          {
           l=new Label("Player 2 wins");
           try{bw2.write("2");
           bw2.newLine();}catch(Exception ee){}
           l.setSize(180,30);
           l.setLocation(110,80);
           l.setForeground(Color.WHITE);
           d.add(l);
           d.setVisible(true);
          }
      }
      else if(i>9)
      {
          bb2=new Button("OK");
          bb2.setSize(50,20);
          bb2.setLocation(175,150);
          bb2.setFont(new Font("Berlin Sans FB",Font.BOLD,15));
          bb2.addActionListener(this);
          d=new Dialog(this,"winner");
          d.setLayout(null);
           d.setBackground(new Color(66,43,15));
           d.setUndecorated(true);
         d.setFont(new Font("Berlin Sans FB",Font.BOLD,25));
           d.setSize(400,200);
           d.setLocation(400,300);
           d.add(bb2);
           d.setVisible(false);
           l=new Label("It is a draw!!!");
           try{bw2.write("0");
           bw2.newLine();}catch(Exception ee){}
           l.setSize(180,30);
           l.setLocation(110,80);
           l.setForeground(Color.WHITE);
           d.add(l);
           d.setVisible(true);
      }
      
      
  }
   public void paint(Graphics g)
  {
     g.drawImage(a,0,0,null);
     g.fillRect(0,70,400,490);
     g.setFont(new Font("Berlin Sans FB",Font.BOLD,22));
     g.setColor(Color.WHITE);
     g.drawString("PLAYER 1-X",10,30);
     g.drawString("PLAYER 2-O",250,30);
  }
  public static void main(String args[])
  {
Image rimg = null,ig = null;
     try{ 
     ig=ImageIO.read(new File("backWood.jpg"));
     rimg=ig.getScaledInstance((int)(168*2.4),(int)(300*2),Image.SCALE_FAST);
    }catch(Exception e){}
      game g=new game(rimg,false);
  }
}