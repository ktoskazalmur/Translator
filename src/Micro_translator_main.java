import java.util.*;
class Input_and_output{
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
    class Micro_translator{
    static String stop=":exit";
    
    public static Map<String, List<String>> filling_dictionary(){
        
        Map<String, List<String>> dictionary = new HashMap<>();
        
        List<String> dog=new ArrayList();
        dog.add("Собака");
        dog.add("Пес");
        dog.add("Кобель");
        dictionary.put("dog",dog);
        
        List<String> walk=new ArrayList();
        walk.add("Ходить");
        walk.add("Идти");
        walk.add("Гулять");
        dictionary.put("walk",walk);
        
        List<String> existence=new ArrayList();
        existence.add("Существование");
        existence.add("Наличие");
        existence.add("Бытие");
        existence.add("Жизнь");
        dictionary.put("existence",existence);
        
        List<String> eternity=new ArrayList();
        eternity.add("Вечность");
        dictionary.put("eternity",eternity);
        
        List<String> house=new ArrayList();
        house.add("Дом");
        house.add("Жилище");
        house.add("Театр");
        house.add("Здание");
        dictionary.put("house",house);
        
        return dictionary;
}
    
}
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
