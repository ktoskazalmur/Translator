import java.util.List;
import java.util.Map;

public class Dictionary {
    
    Dictionary (){
    Map<String, List<String>> userWordsCollection=new HashMap<>();
    }
    Map<String, List<String>> userWordsCollection;
    
    public void addTraslate(String key, List<String> value){
        userWordsCollection.put(key, value);
    }
    
}
