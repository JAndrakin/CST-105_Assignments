
public class PlayerList {
	
	private NFLPlayer[] thelist = new NFLPlayer[5];
	private int i = 0;
	
	public void add(NFLPlayer n){
		if(i<thelist.length){
			thelist[i]=n;
			System.out.println("Player added at index " +i);
			i++;
		}
	}

}
