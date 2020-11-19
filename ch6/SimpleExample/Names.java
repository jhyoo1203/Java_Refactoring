import java.util.ArrayList;
import java.util.Iterator;

public class Names {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("홍길동");
        names.add("이몽룡");
        names.add("심청");

        for(String name: names) {
            System.out.println(name);
        }

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}