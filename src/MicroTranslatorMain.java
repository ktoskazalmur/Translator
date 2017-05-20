import java.util.*;

public class MicroTranslatorMain {
        

    public static void main(String[] args) {
        
       MicroTranslator soManyWords = new MicroTranslator();
       Map<String, List<String>> dictionary_main=soManyWords.startingWords();
       InputAndOutput printAndWrite= new InputAndOutput();
       Dictionary dictionary_on=new Dictionary(); 
       
     
       boolean running=true;
       String user_input;
       String add_eng_word;
       String add_rus_word="";
       ArrayList<String> add_rus_words = new ArrayList<>();
      
       
       while(running){
       printAndWrite.output("Введите английское слово...");
       user_input=printAndWrite.input();
       if (user_input.compareTo(soManyWords.stop)==0){running=false;}
       else {
           switch(user_input){
               case ":add":
                   printAndWrite.output("Английское слово: ");
                    add_eng_word=printAndWrite.input();
                    while(!(add_rus_word==":end")){
                    printAndWrite.output("Вариант перевода: ");
                    add_rus_word=printAndWrite.input();
                    printAndWrite.output(add_rus_word);
                    add_rus_words.add(add_rus_word);
                    }
                    dictionary_on.addTraslate(add_eng_word,add_rus_words);
                    break;
           }
       if (!(dictionary_main.containsKey(user_input)))
       {printAndWrite.output("Такого слова нет в словаре ");}
       else{
       printAndWrite.output(dictionary_main.get(user_input));    
       }
       }
       }
    }
}

