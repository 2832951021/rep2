package JavaSX;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class t6 {

		public static void main(String[] args) 
		{	
			JFrame j1 = new JFrame("Box");   //顶层容器
			j1.setSize(200, 200);          //窗口大小
			JPanel j2 = new JPanel();       //中间容器
			
			JLabel l1 = new JLabel("游戏大全:");

			JComboBox<String> c1 = new JComboBox<String>();
			c1.addItem("-你的最爱-");
			c1.addItem("英雄联盟");
			c1.addItem("守望先锋");
			c1.addItem("穿越火线");
			c1.addItem("绝地求生");
			
			j2.add(l1);
			j2.add(c1);
			
			j1.add(j2);	
			j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			j1.setVisible(true);
		}
	}
