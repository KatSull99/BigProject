public class Reservation
	{
		public static final String Reservation = null;

		private static String destinationChoice; 
		private static String destination;
		private static String portChoice;
		private static String port;
		private static String startingDate;
		private static String starting;
		private static String durationLength;
		private static String duration;
		private static String roomTypes;
		private static String room;
		private static String finalize;
		private static String confirmReservations;
		private static String confirm;
		public static String getDestination()
			{
				return destination;
			}



		public static void setDestination(String destination)
			{
				Reservation.destination = destination;
			}



		public static String getPort()
			{
				return port;
			}



		public static void setPort(String port)
			{
				Reservation.port = port;
			}



		public static String getStarting()
			{
				return starting;
			}



		public static void setStarting(String starting)
			{
				Reservation.starting = starting;
			}



		public static String getDuration()
			{
				return duration;
			}



		public static void setDuration(String duration)
			{
				Reservation.duration = duration;
			}



		public static String getRoom()
			{
				return room;
			}



		public static void setRoom(String room)
			{
				Reservation.room = room;
			}



		public static String getConfirm()
			{
				return confirm;
			}



		public static void setConfirm(String confirm)
			{
				Reservation.confirm = confirm;
			}



		public static String getReservation()
			{
				return Reservation;
			}



		private static String continueAnswer;
		private static boolean shouldContinue = true;
		//private static String reservationR;
		
		
		
		public Reservation(String dChoice, String pChoice, String sDate, String dLength, String rType)
			{
				destinationChoice=dChoice;
				portChoice=pChoice;
				startingDate=sDate;
				durationLength=dLength;
				roomTypes=rType;
			}



		public static String getDestinationChoice()
			{
				return destinationChoice;
			}



		public static void setDestinationChoice(String destinationChoice)
			{
				Reservation.destinationChoice = destinationChoice;
			}



		public static String getPortChoice()
			{
				return portChoice;
			}



		public static void setPortChoice(String portChoice)
			{
				Reservation.portChoice = portChoice;
			}



		public static String getStartingDate()
			{
				return startingDate;
			}



		public static void setStartingDate(String startingDate)
			{
				Reservation.startingDate = startingDate;
			}



		public static String getDurationLength()
			{
				return durationLength;
			}



		public static void setDurationLength(String durationLength)
			{
				Reservation.durationLength = durationLength;
			}



		public static String getRoomTypes()
			{
				return roomTypes;
			}



		public static void setRoomTypes(String roomTypes)
			{
				Reservation.roomTypes = roomTypes;
			}



		public static String getFinalize()
			{
				return finalize;
			}



		public static void setFinalize(String finalize)
			{
				Reservation.finalize = finalize;
			}



		public static String getConfirmReservations()
			{
				return confirmReservations;
			}



		public static void setConfirmReservations(String confirmReservations)
			{
				Reservation.confirmReservations = confirmReservations;
			}



		public static String getContinueAnswer()
			{
				return continueAnswer;
			}



		public static void setContinueAnswer(String continueAnswer)
			{
				Reservation.continueAnswer = continueAnswer;
			}



		public static boolean isShouldContinue()
			{
				return shouldContinue;
			}



		public static void setShouldContinue(boolean shouldContinue)
			{
				Reservation.shouldContinue = shouldContinue;
			}
		
		
		
		
		
	}
		
		
		
		
		
		