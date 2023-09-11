import java.util.Random;
import java.util.Scanner;
class NumberGuess{
	public int number;
	public int inputnumber;
	 public int noofGuesses = 0;
	    public int getNoOfGuesses() {
	        return noofGuesses;
	    }
	    public void setNoOfGuesses(int noofGuesses) {
	        this.noofGuesses = noofGuesses;
	    }
	    NumberGuess(){
	    	Random rand=new Random();
	    this.number=rand.nextInt(100);
	    }
	    void userinputNumber() {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("enter the number you to checkwhether the guess is correct or not :");
	    	int inputnumber=sc.nextInt();
	    }
	    boolean isCorrectNumber(){
	        noofGuesses++;
	        if (inputnumber==number){
	            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noofGuesses);
	            return true;
	        }
	        else if(inputnumber<number){
	            System.out.println("Too low...");
	        }
	        else if(inputnumber>number){
	            System.out.println("Too high...");
	        }
	        return false;
	    }
}
public class NumberGusssinggame {
	public static void main(String[] args) {
		 NumberGuess g = new NumberGuess();
	        boolean b= false;
	        while(!b){
	        g.userinputNumber();
	        b = g.isCorrectNumber();
	        }
	}

}
