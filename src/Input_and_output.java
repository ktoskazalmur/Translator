import java.util.List;
import java.util.Scanner;

public class Input_and_output{
        public static String input(){
        String inputed_word;
        Scanner input=new Scanner(System.in);
        inputed_word=input.nextLine();
        return inputed_word;
        }    
         public static void output(String message){
            System.out.print(message);
        }
         
        public static void output(List<String> translated_word){
            System.out.println(translated_word);
        }
        
}
