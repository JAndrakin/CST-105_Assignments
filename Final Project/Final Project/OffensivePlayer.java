import java.util.*;
import java.util.LinkedList;


public class OffensivePlayer extends NFLPlayer{
	
	public static void main(String[] args) {
    	
	String[] things = {"Alex Adamson", "Boris Bigglesworth", "Clarence Cunningham", "Daryl Dickson", "Flyn Farnham", "Gale Gustafson", "Hector Horatio", "John Jones" };
	List<String> list1 = new LinkedList<String>();
	for(String x : things)
		list1.add(x); //populates list 1 with things

	}
	public OffensivePlayer() {
	//	super("The Title Bar");
	//	setLayout(new FlowLayout()/*default layout*/);
	/*	
		item1 = new JLabel("this is a sentencew");
		item1.setToolTipText("this is gonna show up on hover");
		add(item1);
		*/
	}

}


// not all players have passing or rushing yards only offensive players have that dog
//concrete class