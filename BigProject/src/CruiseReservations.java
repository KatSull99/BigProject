import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CruiseReservations extends JFrame
	{
	private static final long serialVersionUID = 1L;
	static String destinationChoice; 
	static String destination;
	static String portChoice;
	static String port;
	static String startingDate;
	static String starting;
	static String durationLength;
	static String duration;
	static String roomTypes;
	static String room;
	static String finalize;
	static String confirmReservations;
	static String confirm;
	static JFrame frame = new JFrame();
	
	static boolean shouldContinue = true;
		
	
	public static void main(String[] args)
	    {
	    	
	    	while(shouldContinue)
	    		{
	    	final String[] destinationChoice= {"Alaska", "Bahamas", "Bermuda", "Canada & New England", "Caribbean", "Europe", "Hawaii", "Mexico"};

				{
				final JFrame frame = new JFrame();
			    destination= (String) JOptionPane.showInputDialog(frame, 
			            "Where would you like to vacation?",
			            "Your destination",
			            JOptionPane.QUESTION_MESSAGE, 
			            null, 
			            destinationChoice,
			            destinationChoice[0]);
						    	
						switch(destination)
						{
						case "Alaska":
							{
							JOptionPane.showMessageDialog(frame, "This itinerary allows you to visit Juneau, Skagway, and cruise Glacier Bay in Alaska! "
									+ "You will end your trip in Vancouver, Canada, so make sure you bring you passprt!");
							break;
							}
						case "Bahamas":
							{
							JOptionPane.showMessageDialog(frame, "This itinerary allows you to visit Jacksonville, Florida; Freeport; Half Moon Cay; Nassau! "
									+ "You will end your trip in Jacksonville, Florida!");
							break;
							}
						case "Bermuda":
							{
							JOptionPane.showMessageDialog(frame, "This itinerary allows you to visit the white beaches of Bermuda! "
									+ "You will end your trip in Port Canaveral, Florida!");
							break;
							}
						case "Canada & New England":
							{
							JOptionPane.showMessageDialog(frame, "This itinerary allows you to visit Boston, Portland, Saint John, and Halifax! "
									+ "You will end your trip in New York!");
							break;
							}
						case "Caribbean":
							{
							JOptionPane.showMessageDialog(frame, "This itinerary allows you to visit Tampa, the Grand Cayman Islands, and Cozumel! "
									+ "You will end you trip in Tampa, Florida!");
							break;
							}
						case "Europe":
							{
							JOptionPane.showMessageDialog(frame, "This itinerary allows you to visit Palermo, Sicily; Naples, Capri & Pompeii; Rome, Civitavecchia; Livorno, Florence & Pisa; Marseille, Provence; Palma De Mallorca! "
									+ "You will end you trip in Barcelona, Spain!");
							break;
							}
						case "Hawaii":
							{
							JOptionPane.showMessageDialog(frame, "This itinerary allows you to visit Hilo, Kona, Kauai, and Maui! "
									+ "You will end you trip in Honolulu!");
							break;
							}
						case "Mexico":
							{
							JOptionPane.showMessageDialog(frame, "This itinerary allows you to visit the Catalina Islands and Ensenada! "
									+ "You will end you trip in Long Beach, Los Angeles!");
							break;
							}
						}	
				}
				
					final String[] portChoice= {"Miami, Florida", "Port Canaveral, Florida", "Long Beach, Los Angeles, California", "Galveston, Texas", "Baltimore, Maryland", "Barcelona, Spain", "Tampa, FL", "Jacksonville, FL", "New York, New York", "Seattle, Washington"};
						{
					final JFrame frame = new JFrame();
				    port= (String) JOptionPane.showInputDialog(frame, 
				            "Where would you like to set sail from?",
				            "Your port.",
				            JOptionPane.QUESTION_MESSAGE, 
				            null, 
				            portChoice,
				            portChoice[0]);
					}	
							
							
					final String[] startingDate= {"June 3", "June 10", "June 17", "June 24", "July 1", "July 8", "July 15", "July 22", "July 29", "August 5", "August 12", "August 19", "August 26", "September 3"};
						{
					final JFrame frame = new JFrame();
					   starting= (String) JOptionPane.showInputDialog(frame, 
					           "When would you like your starting date to be?",
					           "Set sail.",
					           JOptionPane.QUESTION_MESSAGE, 
					           null, 
					           startingDate,
					           startingDate[0]);
						}
																		
							
							
					final String[] durationLength= {"2-5 days", "6-9 days", "10+ days"};
							{
						final JFrame frame = new JFrame();
					    duration= (String) JOptionPane.showInputDialog(frame, 
					            "Please choose a duration for you voyage",
					            "Enjoy.",
					            JOptionPane.QUESTION_MESSAGE, 
					            null, 
					            durationLength,
					            durationLength[0]);
							}
							
					final String[] roomTypes= {"Interior cost: $179", "Ocean View cost: &199", "Balcony cost $344", "Suite cost: $419"};

							{
							final JFrame frame = new JFrame();
						    room= (String) JOptionPane.showInputDialog(frame, 
						            "Please choose a room.",
						            "Your destination",
						            JOptionPane.QUESTION_MESSAGE, 
						            null, 
						            roomTypes,
						            null);
							}	
				
							finalize = JOptionPane.showInputDialog("Please enter your name below to approve your choices." +  
							destination  +  
							port + 
							starting + 
							duration + 
							room);  
				
				
				
				confirmReservations = (String) JOptionPane.showInputDialog("Would you like to confirm your cruise reservations for" + starting + "to set sail to" + destination + "?");  
				JOptionPane.showMessageDialog(frame, "Your reservations are confirmed. Have a good time on your trip!");
						
					answer = (String) JOptionPane.showInputDialog("Would you like to make another reservation?");  
					JOptionPane.showMessageDialog(frame, + answer  );
				if (answer==true)
						{	
					}
	    		}		
			}
	}

