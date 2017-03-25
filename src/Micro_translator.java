
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Micro_translator{
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