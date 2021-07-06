package tw.kevin;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Brad36 extends JFrame{ //類別 玩FJrame 無傳參數建構式
	private JButton b1,b2,b3;
	
	
	public Brad36(){
		super("我的視窗程式");
		
//		FlowLayout flowLayout = new FlowLayout();
//		setLayout(flowLayout);
		setLayout(new FlowLayout());  //setLayout 可以這樣寫 介面
		
		b1 = new JButton("B1");
		b2 = new JButton("B2");
		b3 = new JButton("B3");
		
		add(b1);add(b2);add(b3);	//多形
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {// 程式執行點 呈現視窗物件
		new Brad36();
	}
}
