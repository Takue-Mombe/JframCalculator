import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.SystemColor.text;

public class Calculator extends JFrame implements ActionListener {
JTextField CalcArea,Num1,Num2;
JButton add,subtract,multiply,divide,clear;

Calculator(){
    JFrame frame=new JFrame();
    Num1=new JTextField();
    Num1.setBounds(50,50,150,20);
    Num2=new JTextField();
    Num2.setBounds(50,100,150,20);
    CalcArea=new JTextField();
    CalcArea.setBounds(50,150,150,20);
    CalcArea.setEditable(false);

    add=new JButton("+");
    add.setBounds(50,200,50,50);
    subtract=new JButton("-");
    subtract.setBounds(120,200,50,50);
    multiply=new JButton("x");
    multiply.setBounds(120,270,50,50);
    divide=new JButton("/");
    divide.setBounds(50,270,50,50);
    clear=new JButton("C");
    clear.setBounds(50,300,50,50);
    add.addActionListener(this);
    subtract.addActionListener(this);
    clear.addActionListener(this);
    multiply.addActionListener(this);
    divide.addActionListener(this);

    frame.add(Num1);frame.add(Num2);frame.add(CalcArea);frame.add(add);frame.add(subtract);
    frame.add(divide);frame.add(multiply);frame.add(clear);

    frame.setSize(400,400);
    frame.setLayout(null);
    frame.setVisible(true);
}


    public static void main(String[] args) {

new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
    String s1=Num1.getText();
    String s2=Num2.getText();

    int a=Integer.parseInt(s1);
    int b=Integer.parseInt(s2);

    int c=0;
    if(e.getSource()==add){
        c=a+b;
    } else if (e.getSource()==subtract) {
        c=a-b;
    } else if (e.getSource()==multiply) {
        c=a*b;
    } else if (e.getSource()==divide) {
        c=a/b;
    } else if (e.getSource()==clear) {
        Num1.setText(null);
        Num2.setText(null);
        CalcArea.setText(null);
    }
            String result=String.valueOf(c);
    CalcArea.setText(result);

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
