

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Calculator {

        JButton add = new JButton("Add");
        JButton mult = new JButton("Multiply");
        JButton div = new JButton("Division");
        JButton sub = new JButton("Subtraction");
        
        JTextField input1 = new JTextField(20);
        JTextField input2 = new JTextField(20);
        JTextField input3 = new JTextField(20);

    
    Calculator(){
        JFrame calc = new JFrame();
        
        Listener listener = new Listener();
        
        FlowLayout layout = new FlowLayout();
        calc.setLayout(layout);
        
        mult.addActionListener(listener);
        add.addActionListener(listener);
        div.addActionListener(listener);
        sub.addActionListener(listener);
        
        calc.add(input1);
        calc.add(input2);
        calc.add(input3);
        calc.add(add);
        calc.add(mult);
        calc.add(div);
        calc.add(sub);
        
        calc.setSize(500, 600);
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
        	
        	if (button.equals(add)) {
        		//System.out.println("you pressed a button!");       
                
                String text1 = input1.getText();
                String text2 = input2.getText();
                float num1 = Float.parseFloat(text1);
                float num2 = Float.parseFloat(text2);
                
                float result = num1 + num2;
                
                input3.setText(result+"");
                	
        	}
        	
        	if (button.equals(mult)) {
        		
        		//System.out.println("you pressed the multiplication button");
        		
        		String text1 = input1.getText();
        		String text2 = input2.getText();
                float num1 = Float.parseFloat(text1);
                float num2 = Float.parseFloat(text2);
        		
                float result = num1 * num2;
                
                input3.setText(result + "");
        		
        	}
        	if (button.equals(div)) {
        		
        		//System.out.println("you pressed the multiplication button");
        		
        		String text1 = input1.getText();
        		String text2 = input2.getText();
                float num1 = Float.parseFloat(text1);
                float num2 = Float.parseFloat(text2);
        		
                float result = num1 / num2;
                
                input3.setText(result + "");
        		
        	}
        	if (button.equals(sub)) {
        		
        		//System.out.println("you pressed the multiplication button");
        		
        		String text1 = input1.getText();
        		String text2 = input2.getText();
                float num1 = Float.parseFloat(text1);
                float num2 = Float.parseFloat(text2);
        		
                float result = num1 - num2;
                
                input3.setText(result + "");
        		
        	}
        
            
        }
        
    }
    
    
    public static void main(String[] args){
    
        Calculator button1 = new Calculator();
        
    }
    
    
    
}
