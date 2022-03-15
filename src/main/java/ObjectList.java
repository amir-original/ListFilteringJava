import java.util.List;

public class ObjectList {
    Object content;

    public ObjectList(Object content) {
        this.content = content;
    }

    public boolean isInteger() {
        return this.content.getClass() == Integer.class;
    }
}
