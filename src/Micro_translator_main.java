import java.util.*;

public class Micro_translator_main {
        

    public static void main(String[] args) {
        

       Map<String, List<String>> dictionary_main=Micro_translator.filling_dictionary();
       boolean running=true;
       String user_input;
       
       while(running){
       Input_and_output.output("Введите английское слово...");
       user_input=Input_and_output.input();
       if (user_input.compareTo(Micro_translator.stop)==0){running=false;}
       else {
       if (!(dictionary_main.containsKey(user_input)))
       {Input_and_output.output("Такого слова нет в словаре");}
       else{
       Input_and_output.output(dictionary_main.get(user_input));    
       }
       }
       }
    }
    
}
