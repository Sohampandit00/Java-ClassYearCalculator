Import java.util.Scanner
public class SchoolYear
{
	public static void main(String[] args){
		Scanner myScan = new Scanner(System.in);
		System.out.println("What year of Hs are you in? 1 2 3 or 4");
		int Freshman = 1;
		int Sophmore = 2;
		int junior = 3;
		int Senior = 4;
		int Year = myScan.nextInt();

		if(Year == Freshman){
		System.out.println("You are a freshman");
		}else if(Year == Sophmore){
		System.out.println("You are a Sophmore");

		}else if(Year == junior){
		System.out.println("You are a Junior");
		}else if(Year == Senior){
		System.out.println("You are a Senior");
		}else if(Year != Senior){
		System.out.println("You are not in Hs");
		}
	}
}
