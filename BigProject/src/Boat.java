import java.awt.*;
import java.util.Scanner;

import javax.swing.*;
 
	
	public class Boat extends Canvas 
	{
		private static final long	serialVersionUID	= 1L;
		
		public static void main(String[] args) 
			{
		        Boat canvas = new Boat();
		        JFrame frame = new JFrame();
		        frame.setSize(500, 500);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.getContentPane().add(canvas).setBackground(Color.cyan);
		        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
		        frame.setResizable(false);
		        frame.setVisible(true);
				}
		
			
		public void paint(Graphics graphics)
	    	{
//	    		water
	    		graphics.setColor(Color.BLUE);
			    graphics.fillRect(0, 250, 500, 250);
				
//				sun
			    graphics.setColor(Color.yellow);
				graphics.fillOval(50, 50, 100, 100);
				
				for (int i = 0; i < 500; i++)
		        	{
//		        		boat
		        		graphics.setColor(Color.gray);
						graphics.fillRect(i, 275, 230, 75);
						graphics.setColor(Color.lightGray);
						graphics.fillRect(i, 245, 215, 40);
						
//						stripe
						graphics.setColor(Color.white);
						graphics.fillRect(i,  295,  230, 5);
						graphics.setColor(Color.white);
						graphics.fillRect(i,  305,  230, 5);
						graphics.setColor(Color.white);
						graphics.fillRect(i,  315,  230, 5);
						
						
			        delay();
			        
//			        movement
			        graphics.setColor(Color.BLUE);
			        graphics.fillRect(i, 275, 230, 75);
			        graphics.setColor(Color.BLUE);
			        graphics.fillRect(i, 245, 215, 40);
			        graphics.setColor(Color.BLUE);
					graphics.fillRect(i,  295,  230, 5);
					graphics.setColor(Color.BLUE);
					graphics.fillRect(i,  305,  230, 5);
					graphics.setColor(Color.BLUE);
					graphics.fillRect(i,  315,  230, 5);
					 
			        
		        	}
	    		}
	    	
	    		public void delay()
	    			{
	    	        try
	    					{
	    					Thread.sleep(40);
	    					} catch (InterruptedException e)
	    					{
	    					e.printStackTrace();
	    					}

				
		
				
	    	}
	}

	
	
	
	
	
	
	
	
	
