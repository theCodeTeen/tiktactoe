package tiktactoe;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.awt.event.*;
public class demo extends Frame implements ActionListener
{
   Image img;
   Button n_game,resume,h_score,about,exit; 
   demo(Image r)
   {
    img=r;
     n_game=new Button("NEW GAME");
     resume=new Button("RESUME");
     h_score=new Button("HISTORY");
     about=new Button("ABOUT");
     exit=new Button("EXIT");
    setUndecorated(true);
    setVisible(true);
    setSize(400,600);
    setLocation(400,100);
    setLayout(null);
    
    setForeground(Color.WHITE);
    setFont(new Font("Berlin Sans FB",Font.BOLD,35));
    

    add(n_game);
    n_game.setSize(250,50);
    n_game.setLocation(75,150);
    n_game.setFont(new Font("Berlin Sans FB",Font.BOLD,25));
    n_game.setForeground(new Color(66,43,15));
    n_game.addActionListener(this);
  
    add(resume);
    resume.setSize(250,50);
    resume.setLocation(75,240);
    resume.setFont(new Font("Berlin Sans FB",Font.BOLD,25));
    resume.setForeground(new Color(66,43,15));
    resume.addActionListener(this);

    add(h_score);
    h_score.setSize(250,50);
    h_score.setLocation(75,330);
    h_score.setFont(new Font("Berlin Sans FB",Font.BOLD,25));
    h_score.setForeground(new Color(66,43,15));
    h_score.addActionListener(this);

    add(about);
    about.setSize(250,50);
    about.setLocation(75,420);
    about.setFont(new Font("Berlin Sans FB",Font.BOLD,25));
    about.setForeground(new Color(66,43,15));
    about.addActionListener(this);

    add(exit);
    exit.setSize(250,50);
    exit.setLocation(75,510);
    exit.setFont(new Font("Berlin Sans FB",Font.BOLD,25));
    exit.setForeground(new Color(66,43,15));
    exit.addActionListener(this);
   }
    
    
   public void actionPerformed(ActionEvent e)
  {
       if(e.getSource()==exit)
       System.exit(0);
       if(e.getSource()==about)
       {about a=new about(img);
        setVisible(false);
       }
       if(e.getSource()==n_game)
       {game g=new game(img,false);
        setVisible(false);
       }
       if(e.getSource()==resume)
       {game g=new game(img,true);
         setVisible(false);
        }
       if(e.getSource()==h_score)
      {
         history h=new history(img);
         setVisible(false);
      }
  }
   public void paint(Graphics g)
  {
     
     g.drawImage(img,0,0,null);
     g.drawString("TIK-TAC-TOE",90,100);
  }
  }