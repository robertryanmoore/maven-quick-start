package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import  org.apache.commons.lang3.StringUtils;

public class Application {

    public int coutnWords(String words){
        String[] separatWords = StringUtils.split(words, ' ');
        return (separatWords == null) ? 0: separatWords.length;
    }

    public void greet(){
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello");

        for (String greeting : greetings){
            System.out.println("Greeting: " + greeting);
        }
    }

    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
        System.out.println ("Starting Application");
        Application app = new Application();
        app.greet();
        int count = app.coutnWords("I have four words");
        System.out.println("Wor count: "+ count);
    }
}