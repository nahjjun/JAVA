package 자바어플리케이션;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.*;

public class 챕터10_퍼즐게임작성하기 extends JFrame implements ActionListener{
   private JButton reset;
   private JPanel panel;
   private JButton[] buttons;
   public 챕터10_퍼즐게임작성하기() {
      setTitle("퍼즐게임 작성하기");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());
      
      keyPad = new int[10];
      keyPad[9] = 1; // 비어있으면 1
      buttons = new JButton[10];
      for(int i=0; i<10; ++i) {
         buttons[i] = new JButton();
         buttons[i].setName(""+i); // 실제 자리 번호 1~9
         if(i==9) buttons[i] = new JButton("0"); // 비어있는 자리는 0으로 설정 
         else buttons[i] = new JButton(""+i);
         buttons[i].addActionListener(this);
         panel.add(buttons[i]);
      }
      
      reset = new JButton("Reset"); 
      panel = new JPanel();
      panel.setLayout(new GridLayout(0,3,0,0));
      
      add(reset, BorderLayout.SOUTH);
      add(panel, BorderLayout.CENTER);
      setPreferredSize(new Dimension(500,500));
      pack();
      setVisible(true);
   }
   private static int nearEmpty(int location, int[] keyPad) { // 근처가 비지 않았다면 -1을, 비었다면 해당 위치를 반환해주는 함수
      
   }
   @Override
   public void actionPerformed(ActionEvent e) {
      JButton b = (JButton)e.getSource();
      
   }
   
   public static void main(String[] args) {
      챕터10_키패드만들기 a = new 챕터10_키패드만들기();
   }
}
