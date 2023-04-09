import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("Greek");
        list.add("was");
        list.add("crossing");
        list.add("a");
        list.add("river");
        list.add("and");
        list.add("saw");
        list.add("a");
        list.add("Greek");
        list.add("in");
        list.add("the");
        list.add("river");
        list.add("with");
        list.add("a");
        list.add("crawfish");

        List<Word> occurance = calcOccurance(list);

        for (Word word : occurance) {
            System.out.println(word.toString());
        }
    }

    static List<Word> calcOccurance(List<String> list) {
        list.sort(null);
        int counter = 1;
        List<Word> occurance = new ArrayList<>();

        for (int i = 0; i < list.size() - 1; i++) {
            String current = list.get(i);
            String next = list.get(i + 1);
            if (current.equals(next)) {
                counter++;
            } else {
                occurance.add(new Word(current, counter));
                counter = 1;
            }
        }
        String last = list.get(list.size() - 1);
        occurance.add(new Word(last, counter));
        return occurance;
    }
}
