package general.zohofamily;

import java.util.*;

class Person {
    String name;
    Person parent;
    List<Person> children;

    Person(String name) {
        this.name = name;
        parent = null;
        children = new ArrayList<>();
    }
}

public class Main {
    public static void main(String[] args) {

        String[][] given = {{"luke", "shaw"},
                {"wayne", "rooney"},
                {"rooney", "ronaldo"},
                {"shaw", "rooney"}};
        HashMap<String, Person> hm = new HashMap<>();
        for (int i = 0; i < given.length; i++) {
            if (hm.containsKey(given[i][0])) {
                if (hm.containsKey(given[i][1])) {
                    hm.get(given[i][0]).parent = hm.get(given[i][1]);
                    hm.get(given[i][1]).children.add(hm.get(given[i][0]));
                } else {
                    Person temp = new Person(given[i][1]);
                    hm.get(given[i][0]).parent = temp;
                    temp.children.add(hm.get(given[i][0]));
                    hm.put(given[i][1], temp);
                }
            } else {
                Person temp = new Person(given[i][0]);
                hm.put(given[i][0], temp);
                if (hm.containsKey(given[i][1])) {
                    hm.get(given[i][0]).parent = hm.get(given[i][1]);
                    hm.get(given[i][1]).children.add(hm.get(given[i][0]));
                } else {
                    Person temp1 = new Person(given[i][1]);
                    temp1.children.add(hm.get(given[i][0]));
                    temp.parent = temp1;
                    hm.put(given[i][1], temp1);
                }
            }
        }

        String q = "ronaldo";
        Person person = hm.get(q);
        int count = 0;
        for(Person p : person.children){
            count += p.children.size();
        }
        System.out.println(count);
    }
}
