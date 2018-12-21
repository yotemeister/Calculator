
package Yeet;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Calculator {

        JButton add = new JButton("Addition");
        JButton mult = new JButton("Multiply");
        JButton div = new JButton("Division");
        JButton sub = new JButton("Subtraction");
        
        JTextField input1 = new JTextField(20);
        JTextField input2 = new JTextField(20);
        JTextField input3 = new JTextField(20);
        JFrame calc = new JFrame();

    
    Calculator(){
        
        Listener listener = new Listener();
        
        FlowLayout layout = new FlowLayout();
        calc.setLayout(layout);
        
        
        add.addActionListener(listener);
        mult.addActionListener(listener);
        sub.addActionListener(listener);
        div.addActionListener(listener);
        
        calc.add(input1);
        calc.add(input2);
        calc.add(input3);
        calc.add(add);
        calc.add(mult);
        calc.add(div);
        calc.add(sub);
        
        
        calc.setSize(500, 800);
        calc.setVisible(true);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setTitle("Calculator");
        
    }
    
    public class Listener implements ActionListener{
    
        Listener(){
            
        }

        @Override
        public void actionPerformed(ActionEvent e) {
        
            JButton button = (JButton) e.getSource();
            
            if (input1.getText().equals("")){
                input1.setText("0");
                input2.setText("0");
            }

            
            if (button.equals(add)){
                String text1 = input1.getText();
                String text2 = input2.getText();
                float num1 = Float.parseFloat(text1);
                float num2 = Float.parseFloat(text2);

                float result = num1 + num2;

                input3.setText(result+"");
                
            }
            
            if (button.equals(mult)){
                String text1 = input1.getText();
                String text2 = input2.getText();
                float num1 = Float.parseFloat(text1);
                float num2 = Float.parseFloat(text2);

                float result = num1 * num2;

                input3.setText(result+"");

            }
            
            if (button.equals(sub)){
                String text1 = input1.getText();
                String text2 = input2.getText();
                float num1 = Float.parseFloat(text1);
                float num2 = Float.parseFloat(text2);

                float result = num1 - num2;

                input3.setText(result+"");

            }
            if (button.equals(div)){
                
                if (input2.getText().equals("0")){
                    input3.setText("Cannot Divide by Zero");
                    return;
                }
                
                String text1 = input1.getText();
                String text2 = input2.getText();
                float num1 = Float.parseFloat(text1);
                float num2 = Float.parseFloat(text2);

                float result = num1 / num2;

                input3.setText(result+"");

            }
            //System.out.println("you pressed a button!");       
            
            
        }
        
        
    }
    
    public static void main(String[] args){
    
        Calculator button1 = new Calculator();
        
    }
    
    
    
}
