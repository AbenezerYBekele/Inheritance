import java.util.ArrayList;

public class ModArrayList<D> extends ArrayList<D> {

    public D getUsingMod(int num) {
        if (this.isEmpty()) {
        throw new IndexOutOfBoundsException("Cannot get an element from an empty list");
        }
        int ValidNum =  (num % this.size() + this.size()) % this.size();
        return  this.get(ValidNum);
    }
}
