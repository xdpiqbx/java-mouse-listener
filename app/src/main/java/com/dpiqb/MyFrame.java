package com.dpiqb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {
  JLabel label;
  MyFrame(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 500);
    this.setLayout(null);

    label = new JLabel();
    label.setBounds(0,0,100,100);
    label.setBackground(Color.RED);
    label.setOpaque(true);
    label.addMouseListener(this);

    this.add(label);
    this.setVisible(true);
  }

  @Override
  public void mouseClicked(MouseEvent e) {
//    System.out.println("mouse Clicked");
  }

  @Override
  public void mousePressed(MouseEvent e) {
//    System.out.println("mouse Pressed");
    label.setBackground(Color.YELLOW);
  }

  @Override
  public void mouseReleased(MouseEvent e) {
//    System.out.println("mouse Released");
    label.setBackground(Color.GREEN);
  }

  @Override
  public void mouseEntered(MouseEvent e) {
//    System.out.println("mouse Entered");
    label.setBackground(Color.BLUE);
  }

  @Override
  public void mouseExited(MouseEvent e) {
//    System.out.println("mouse Exited");
    label.setBackground(Color.RED);
  }
}
