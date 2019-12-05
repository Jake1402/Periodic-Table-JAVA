package Calculator;

import java.lang.Math;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class calc extends JFrame{

	private JFrame scene = new JFrame("Molar Calculator");
	
	private JButton clear = new JButton("Ce");
	private JButton back = new JButton("←");
	private JButton openBracket = new JButton("(");
	private JButton closeBracket = new JButton(")");
	private JButton divide = new JButton("÷");
	
	private JButton seven = new JButton("7");
	private JButton eight = new JButton("8");
	private JButton nine = new JButton("9");
	private JButton mult = new JButton("X");
	
	private JButton four = new JButton("4");
	private JButton five = new JButton("5");
	private JButton six = new JButton("6");
	private JButton minus = new JButton("-");
	
	private JButton one = new JButton("1");
	private JButton two = new JButton("2");
	private JButton three = new JButton("3");
	private JButton plus = new JButton("+");
	
	private JButton Mol = new JButton("M");
	private JButton zero = new JButton("0");
	private JButton _float_ = new JButton(".");
	private JButton equals = new JButton("=");
	
	private JTextField result = new JTextField();
	
	public calc() {
		
		for(int x = 0; x < 650; x++) {
			for(int y = 0; y < 850; y++) {
				if(x == 10 && y == 10) {
					scene.add(result);
					result.setBounds(x, y, 351, 70);
				}
				if(x == 10 && y == 90) {
					scene.add(clear);
					clear.setBounds(x,y, 80, 35);
					clear.setFont(new Font("Schriftbild", Font.BOLD, 25));
				}
				if(x == 10 && y == 125) {
					scene.add(back);
					back.setBounds(x, y, 80, 35);
					back.setFont(new Font("Schriftbild", Font.BOLD, 25));
				}
				if(x == 100 && y == 90) {
					scene.add(openBracket);
					openBracket.setBounds(x, y, 80, 70);
					openBracket.setFont(new Font("Schriftbild", Font.BOLD, 25));
				}
				if(x == 190 && y == 90) {
					scene.add(closeBracket);
					closeBracket.setBounds(x, y, 80, 70);
					closeBracket.setFont(new Font("Schriftbild", Font.BOLD, 25));
				}
				if(x == 280 && y == 90) {
					scene.add(divide);
					divide.setBounds(x, y, 80, 70);
					divide.setFont(new Font("Schriftbild", Font.BOLD, 25));
				}
				if(x == 10 && y == 170) {
					scene.add(seven);
					seven.setBounds(x,y,80,70);
					seven.setFont(new Font("Schriftbild", Font.BOLD, 25));
				}
				if(x == 100 && y == 170) {
					scene.add(eight);
					eight.setBounds(x, y, 80, 70);
					eight.setFont(new Font("Schriftbild", Font.BOLD, 25));
				}
				if(x == 190 && y == 170) {
					scene.add(nine);
					nine.setBounds(x, y, 80, 70);
					nine.setFont(new Font("Schriftbild", Font.BOLD, 25));
				}
				if(x == 280 && y == 170) {
					scene.add(mult);
					mult.setBounds(x, y, 80, 70);
					mult.setFont(new Font("Schriftbild", Font.BOLD, 25));
				}
				if(x == 10 && y == 250) {
					scene.add(four);
					four.setBounds(x, y, 80, 70);
					four.setFont(new Font("Schriftbild", Font.BOLD, 25));
				}
				if(x == 100 && y == 250) {
					scene.add(five);
					five.setBounds(x, y, 80, 70);
					five.setFont(new Font("Schriftbild", Font.BOLD, 25));
				}
				if(x == 190 && y == 250) {
					scene.add(six);
					six.setBounds(x, y, 80, 70);
					six.setFont(new Font("Schriftbild", Font.BOLD, 25));
				}
				if(x == 280 && y == 250) {
					scene.add(minus);
					minus.setBounds(x, y, 80, 70);
					minus.setFont(new Font("Schriftbild", Font.BOLD, 25));
				}
				if(x == 10 && y == 330) {
					scene.add(one);
					one.setBounds(x, y, 80, 70);
					one.setFont(new Font("Schriftbild", Font.BOLD, 25));
				}
				if(x == 100 && y == 330) {
					scene.add(two);
					two.setBounds(x, y, 80, 70);
					two.setFont(new Font("Schriftbild", Font.BOLD, 25));
				}
				if(x == 190 && y == 330) {
					scene.add(three);
					three.setBounds(x, y, 80, 70);
					three.setFont(new Font("Schriftbild", Font.BOLD, 25));
				}
				if(x == 280 && y == 330) {
					scene.add(plus);
					plus.setBounds(x, y, 80, 70);
					plus.setFont(new Font("Schriftbild", Font.BOLD, 25));
				}
				if(x == 10 && y == 410) {
					scene.add(Mol);
					Mol.setBounds(x, y, 80, 70);
					Mol.setFont(new Font("Schriftbild", Font.BOLD, 25));
				}
				if(x == 100 && y == 410) {
					scene.add(zero);
					zero.setBounds(x, y, 80, 70);
					zero.setFont(new Font("Schriftbild", Font.BOLD, 25));
				}
				if(x == 190 && y == 410) {
					scene.add(_float_);
					_float_.setBounds(x, y, 80, 70);
					_float_.setFont(new Font("Schriftbild", Font.BOLD, 25));
				}
				if(x == 280 && y == 410) {
					scene.add(equals);
					equals.setBounds(x, y, 80, 70);
					equals.setFont(new Font("Schriftbild", Font.BOLD, 25));
				}
			}
		}
		
		handler react = new handler();
		clear.addActionListener(react);
		back.addActionListener(react);
		openBracket.addActionListener(react);
		closeBracket.addActionListener(react);
		divide.addActionListener(react);
		
		seven.addActionListener(react);
		eight.addActionListener(react);
		nine.addActionListener(react);
		mult.addActionListener(react);
		
		four.addActionListener(react);
		five.addActionListener(react);
		six.addActionListener(react);
		minus.addActionListener(react);
		
		one.addActionListener(react);
		two.addActionListener(react);
		three.addActionListener(react);
		plus.addActionListener(react);
		
		Mol.addActionListener(react);
		zero.addActionListener(react);
		_float_.addActionListener(react);
		equals.addActionListener(react);
		
		/////*****Main setup*****\\\\\
		result.setEditable(false);
		result.setBackground(Color.WHITE);
		result.setFont(new Font("Schriftbild", Font.BOLD, 30));
		scene.setLayout(null);
		scene.setResizable(false);
		scene.setSize(390, 542);
		scene.setVisible(true);
		
	}
	
	private class handler implements ActionListener{

		String answerString = "";
		String Save[] = new String[160000000];

		int pos = 1;
		
		private final String MOL = Double.toString(6.02*Math.pow(10, 23));
		
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == clear) {
				answerString = "";
				result.setText(answerString);
			}
			if(e.getSource() == back) {
				pos-=1;
				if(pos<0) {
					pos=0;
				}
				answerString = Save[pos];
				if(answerString == null) {
					answerString = "";
				}
				result.setText(answerString);
			}
			if(e.getSource() == openBracket) {
				answerString = answerString + "(";
				
				pos+=1;
				Save[pos] = answerString;
				
				result.setText(answerString);
			}
			if(e.getSource() == closeBracket) {
				answerString = answerString + ")";
				pos+=1;
				Save[pos] = answerString;
				result.setText(answerString);
			}
			if(e.getSource() == divide) {
				answerString = answerString + "/";
				pos+=1;
				Save[pos] = answerString;
				result.setText(answerString);
			}
			if(e.getSource() == seven) {
				answerString = answerString + "7";
				pos+=1;
				Save[pos] = answerString;
				result.setText(answerString);
			}
			if(e.getSource() == eight) {
				answerString = answerString + "8";
				pos+=1;
				Save[pos] = answerString;
				result.setText(answerString);
			}
			if(e.getSource() == nine) {
				answerString = answerString + "9";
				pos+=1;
				Save[pos] = answerString;
				result.setText(answerString);
			}
			if(e.getSource() == mult) {
				answerString = answerString + "*";
				pos+=1;
				Save[pos] = answerString;
				result.setText(answerString);
			}
			if(e.getSource() == four) {
				answerString = answerString + "4";
				pos+=1;
				Save[pos] = answerString;
				result.setText(answerString);
			}
			if(e.getSource() == five) {
				answerString = answerString + "5";
				pos+=1;
				Save[pos] = answerString;
				result.setText(answerString);
			}
			if(e.getSource() == six) {
				answerString = answerString + "6";
				pos+=1;
				Save[pos] = answerString;
				result.setText(answerString);
			}
			if(e.getSource() == minus) {
				answerString = answerString + "-";
				pos+=1;
				Save[pos] = answerString;
				result.setText(answerString);
			}
			if(e.getSource() == one) {
				answerString = answerString + "1";
				pos+=1;
				Save[pos] = answerString;
				result.setText(answerString);
			}
			if(e.getSource() == two) {
				answerString = answerString + "2";
				pos+=1;
				Save[pos] = answerString;
				result.setText(answerString);
			}
			if(e.getSource() == three) {
				answerString = answerString + "3";
				pos+=1;
				Save[pos] = answerString;
				result.setText(answerString);
			}
			if(e.getSource() == plus) {
				answerString = answerString + "+";
				pos+=1;
				Save[pos] = answerString;
				result.setText(answerString);
			}
			if(e.getSource() == Mol) {
				answerString = answerString + MOL;
				pos+=1;
				Save[pos] = answerString;
				result.setText(answerString);
			}
			if(e.getSource() == zero) {
				answerString = answerString + "0";
				pos+=1;
				Save[pos] = answerString;
				result.setText(answerString);
			}
			if(e.getSource() == _float_) {
				answerString = answerString + ".";
				pos+=1;
				Save[pos] = answerString;
				result.setText(answerString);
			}
			if(e.getSource() == equals) {
				try {
					ScriptEngineManager mgr = new ScriptEngineManager();
				    ScriptEngine engine = mgr.getEngineByName("JavaScript");
				    try {
						Object answerEngine = engine.eval(answerString);
						answerString = answerEngine.toString();
						if(answerString == "Infinity") {
							answerString = "Bigger than 2^64";
							result.setText(answerString);
						}
						result.setText(answerString);
					} catch (ScriptException e1) {
						
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "Somethings wrong? Solutions:\n Try a different sum.\n Try reinstalling.\n Try restarting program.", "Somethings gone wrong!", 0);
					}
				}catch(Exception value) {
					result.setText("Needs values numpty!");
				}
			}
		}
		
	}
	
}