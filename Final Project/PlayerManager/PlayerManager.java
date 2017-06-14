
public class PlayerManager {

		public static void main(String[] args){
		
			// Single dimensional array storing players
			//Class method CreatePlayers
			String[] CreatePlayers = {"Tom Brady","Keanu Neal","Le'Veon Bell","Grady Jarrett","Julian Edelman","Ricardo Allen"};
			
			//Forloop display players
			for (int i = 0; i < CreatePlayers.length; i++) {
				
				System.out.print(CreatePlayers[i] + " ");
			}
			
			
	}
	}


/* Create a class called PlayerManager.
The class should hold an array of players and have a class method called CreatePlayers. 
This method will create the players that will be available to be drafted and store them on the player’s array.
Students will create a class that will be responsible for managing all the players. 
For this assignment, you will implement a method that will create all the players and store them in an array. 
This method should be called during instantiation, inside the constructor.
Make use of array to hold the list of players and a method to populate the array list.
*/

/* Make use of array to hold the list of players and a method to populate the array list.


Assignment Description: 

Students will create a class that will be responsible for managing all the players. For this assignment,
 you will implement a method that will create all the players and store them in an array. This method
  should be called during instantiation, inside the constructor.


Directions:

Create a class called PlayerManager.
The class should hold an array of players and
 have a class method called CreatePlayers. 
This method will CREATE the players that will be available to be drafted and STORE them on the player’s array.
Deliverables:

PlayerManager Java class


What to submit:

You will add this class to your Final Project Java application. 
Push the PlayerManager class to the respective Git Repository folder. 
Please note that the PlayerManager is part of the Final Project, 
and should be included in the same project as the NFLPlayer class (continuous integration).

*/

//playerManagerClass