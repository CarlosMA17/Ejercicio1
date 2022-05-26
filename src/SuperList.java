import java.util.Iterator;

public class SuperList<T> extends ListManager {
    @Override
    public void addElement(Object element) {
        list.add(element);
    }

    @Override
    public Object removeElement(int position) {
        T borrador = (T) list.get(position);
        list.remove(position);
        return borrador;
    }

    @Override
    public void showElements() {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() );
        }

    }

    @Override
    public void showReversedElements() {
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i));

        }

    }
}
