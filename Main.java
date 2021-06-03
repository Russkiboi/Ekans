import java.util.Scanner;//this is probably the user input module or something idk
import java.util.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
	public static void main(String[] args) {
		
		System.out.println("Hi I'm Ekans, Tell Me Anything!");
		
		int x = 1;
		Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Visit W3Schools!");
    boolean matchFound = matcher.find();
		while (x < 10) {
			Scanner myObj = new Scanner(System.in);
			String input;


			input = myObj.nextLine();
			switch (matchFound) {
			case "true":
			
			case "hey":
			case "Hello":
			case "Hey":
			case "Hey!":
			case "Hi":
			case "Hello!":
				System.out.println("Hello!");
				break;
			case "What is your name?":
			case "whats ur name?":
			case "What's your name?":
			case "Whats ur name":
			case "what's ur name":
				System.out.println("Ekans!");
				break;
			case "hi":
				System.out.println("Hello, human");
				break;
			case "help":
			case "Help!":
			case "help!":
			case "Help":
				System.out.println("I Need Somebody!");
				System.out.println("Not Just Anybody!");
				break;
			case "are you a boy?":
				System.out.println("I identify as an Appachi Attack Helicopter.");
				break;
		  case "creeper":
			case "Creeper":
			case "Creepa":
			case "Creepa!":
			case "Creeper!":
				System.out.println("Aww Man!");
				break;	
			case "what is the meaning of life?":
				System.out.println("I think it's 42.");
				break;
			case "what is ur name?":
				System.out.println("Ekans!");
				break;
			case "what is ur name":
				System.out.println("Ekans!");
				break;
			case "are you a robot?":
				System.out.println("Maybe Idk?");
				break;
			case "r u a robot":
				System.out.println("Maybe Idk?");
				break;
			case "tell me a joke":
				System.out.println("ur life");
				break;
			case "thanks":
				System.out.println("No problem");
				break;
			case "i luv u":
				System.out.println("<3");
				break;
			case ":(":
				System.out.println(":(");
				break;
			case "What's up":
				System.out.println("Not much. ¯|_(ツ)_|¯");
				break;
			case "sup":
				System.out.println("Not much. ¯|_(ツ)_|¯");
				break;
			case "i'm tired":
			case "im tired":
			case "I'm Tired":
			case "I am tired":

				System.out.println("I'm sorry to hear that. :(");
				break;
			default:
				System.out.println("Sorry I'm not sure");
			}
		}
	}
}
