import java.util.ArrayList;
import java.util.List;

public class December {
    public static class Note {
        public final List<String> notes = new ArrayList<>();

        public synchronized void addNote(int index, String note) {
            System.out.println("A note will be added now [" + note + "] one the position " + index);
            notes.add(index, note);
            System.out.println("A note has already been added [" + note + "]");
        }

        public synchronized void removeNote(int index) {
            System.out.println("A note on the position will be added now " + index);
            String note = notes.remove(index);
            System.out.println("The not has already been deleted [" + note + "] on the position " + index);
        }
    }
}
