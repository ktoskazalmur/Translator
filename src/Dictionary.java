import java.util.List;
import java.util.Map;

public class Dictionary {
    Map<String, List<String>> userWordsCollection;
    
    public void addTraslate(String key, List<String> value){
        userWordsCollection.put(key, value);
    }
    
}
