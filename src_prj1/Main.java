package prj1;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.BoxLayout;
import javax.swing.JTextArea;

public class Main extends Applet implements ActionListener {

	TextField X1, Y1, Z1, W1,  X0, Y0, Z0, W0, Xc, Yc, Zc, Wc;
	Button calcBtn;
	JTextArea myConsole;
	
	public void init() {
		Label label1 = new Label("Данные о товаре: ");
		X1 = new TextField("50");    // 730,  75
		Y1 = new TextField("150");   // 400,  75
		Z1 = new TextField("250");   // 220,  110
		W1 = new TextField("0.5");   // 15.5, 0.5

		Label label0 = new Label("Типоразмеры ячееки: ");
		X0 = new TextField("1200");    // 1200, 1000
		Y0 = new TextField("800");     // 800,  400
		Z0 = new TextField("1400");    // 500,  650
		W0 = new TextField("750");     // 750   750

		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(4,2));
		p1.add(new Label("Длина:"));  p1.add(X1);
		p1.add(new Label("Ширина:"));  p1.add(Y1);
		p1.add(new Label("Высота:")); p1.add(Z1);
		p1.add(new Label("Вес:"));     p1.add(W1);

		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(4,2));
		p2.add(new Label("Длина:"));  p2.add(X0);
		p2.add(new Label("Ширина:"));  p2.add(Y0);
		p2.add(new Label("Высота:")); p2.add(Z0);
		p2.add(new Label("Вес:"));     p2.add(W0);

		Panel p3 = new Panel();
		calcBtn = new Button("Расчитать");
		calcBtn.addActionListener(this);
		p3.add(calcBtn);
	
		Panel M = new Panel();
		M.setLayout(new BoxLayout(M, BoxLayout.Y_AXIS));
		M.add(label1);M.add(p1);M.add(label0);M.add(p2);M.add(p3);
		
		myConsole = new JTextArea();
		myConsole.setLineWrap(true);
		myConsole.setSize(new Dimension(400,300));
		myConsole.setText("\n>> Введите данные и нажмите [Расчитать]");
		M.add(myConsole);
		
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setSize(new Dimension(450,500));
		this.add(M);
	}

	public void actionPerformed(ActionEvent e) {
		
		int iX1 = Integer.parseInt(X1.getText());
		int iX0 = Integer.parseInt(X0.getText());
		int iXc = iX0/iX1;
		
		int iY1 = Integer.parseInt(Y1.getText());
		int iY0 = Integer.parseInt(Y0.getText());
		int iYc = iY0/iY1;
		
		int iZ1 = Integer.parseInt(Z1.getText());
		int iZ0 = Integer.parseInt(Z0.getText());
		int iZc = iZ0/iZ1;
		
		double iW1 = Double.parseDouble(W1.getText());
		
		int maxC = iXc*iYc*iZc;
		double maxW = maxC*iW1;
		double maxV = (double)(maxC*iX1*iY1*iZ1)/(double)(iX0*iY0*iZ0);
		String txt = String.format(
	            "Максимальное количество упаковок с товаром, которое может разместиться в ячейке: %1$d\n" +
	            "Проверка ограничения по весу (Произведение количества товара в ячейке и веса одной единицы): %2$.2f\n" +
	            "Расчет коэффициента заполнения объема ячейки (отношение объема товара к объему ячейки): %3$.2f",
	            	maxC, maxW, maxV);
		myConsole.setText( txt);
	 }
}