import java.util.List;
import java.util.Scanner;

public class InputAndOutput{
        public String input(){
        String inputed_word;
        Scanner input=new Scanner(System.in);
        inputed_word=input.nextLine();
        return inputed_word;
        }    
         public void output(String message){
            System.out.print(message);
        }
         
        public void output(List<String> translated_word){
            System.out.println(translated_word);
        }
        
}
