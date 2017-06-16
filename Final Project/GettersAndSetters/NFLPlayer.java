//Class NFL PLAYER
public class NFLPlayer {
	
		
			
			//Player name and stats
			String PlayerName = "";
			
			int PlayerNumber = 0, 
				PlayerAge = 0;

			
			//double data with decimals that have numbers on other side of decimal
			double  PlayerPassingAverage = 0.0, 
					PlayerHeight = 0.0,
					PlayerWeight = 0.0;
			
			//constructor getter and setters
			public NFLPlayer(){
			}
			

		    public void setPlayerName(String newPlayerName) {
	            PlayerName = newPlayerName;
	        }
	        
	        public void setPlayerNumber(int newPlayerNumber) {
	            PlayerNumber= newPlayerNumber;
	        }
	        
	        public void setPlayerAge(int newPlayerAge) {
	            PlayerAge = newPlayerAge;
	        }
	        
	        public void setPlayerHeight(double newPlayerHeight) {
	            PlayerHeight = newPlayerHeight;
	        }
	        
	        public void setPlayerWeight(double newPlayerWeight) {
	            PlayerWeight = newPlayerWeight;
	        }
	        
	        public void setPlayerPassingAverage(double newPlayerPassingAverage) {
	            PlayerPassingAverage = newPlayerPassingAverage;
	        }
			
			public String getPlayerName() {
				return PlayerName;
			}
		
			public int getPlayerNumber() {
				return PlayerNumber;
			}
			
		
			public int getPlayerAge() {
				return PlayerAge;
			}
			
		
			public double getPlayerHeight() {
				return PlayerHeight;
			}
			
		
			public double getPlayerWeight() {
				return PlayerWeight;
			}
			
				
			public double GetPlayerPassingAverage() {
				return PlayerPassingAverage;
			}
		
			
		// Method used
		public static void main(String[] args){	

		}
	}


	/* 
	 Create the NFLPlayer class.


	Assignment Description: 

	Students will be required to fully implement a class,
	 making use of at least two variable types to define its 
	 properties.
	 
	Create the NFLPlayer class and add its properties.
	Include player statistics found on the NFL website.
	Use the variable types learned so far to create the 
	player properties.
	Deliverables:

	NFLPlayer class

	Submit the NFLPlayer class to your final project
	Git Repository folder.
	http://www.nfl.com/stats/player
	 */


