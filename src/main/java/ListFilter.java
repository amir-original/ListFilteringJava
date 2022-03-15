import java.util.ArrayList;
import java.util.List;

public class ListFilter {

    public List filterStrings(List list) {
        List result = new ArrayList();

        for(int pointer = 0; pointer < list.size() ; pointer ++){
            ObjectList objectList = new ObjectList(list.get(pointer));
            if (objectList.isInteger()) {
                result.add(list.get(pointer));
            }
        }
        return result;
    }

}
