import java.util.ArrayList;
import java.util.List;

public class ListFilter {

    public List filterStrings(List list) {
        List result = new ArrayList();

        for(int pointer = 0; pointer < list.size() ; pointer ++){
            if (isInteger(list, pointer)){
                result.add(list.get(pointer));
            }
        }
        return result;
    }

    private boolean isInteger(List list, int pointer) {
        return list.get(pointer).getClass() == Integer.class;
    }
}
