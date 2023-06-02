package maven.java.programming;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }
	
	public int countWords(String words) {
		String[] seperateWords = StringUtils.split(words, ' ');
		return (seperateWords == null) ? 0 : seperateWords.length;
	}
	
	public void greet() {
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello ... ");
		for(String greeting : greetings) {
			System.out.println("Greeting : " + greeting);
		}
	}
	
	// method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
		int count = app.countWords("aa bb cc dd");
		System.out.println("words count : "+count);
    }
	
}