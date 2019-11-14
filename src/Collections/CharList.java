package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class CharList {
    private ArrayList<Character> container; // field for divide string input

    //toString return hashCode
    //constructor to input string value
    CharList(String inputText) {
        char[] chars = inputText.toCharArray();
        container = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            container.add(chars[i]);
        }
    }

    private CharList(ArrayList<Character> list) {
        container = list;
    }

    //pereopredeliaem toString is Object v vivod znacenia stroki
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(container.size()); //StringBuilder  delaet stroki iz raznih ..
        for (Character ch : container) {
            stringBuilder.append(ch); //dobavliaem po charu kajduiu iteratiu tem samim sozdaiom stroku
        }
        return stringBuilder.toString();

    }

    //returns string length
    int length() {
        return container.size();
    }

    //returns char in determined position
    char charAt(int index) {
        return container.get(index);
    }

    //returns indexPosition of field in char value
    int indexOf(char c) {
        return container.indexOf(c);
    }

    //return a substring  with chosen range
    CharList subString(int start, int end) {
        return new CharList(new ArrayList<>(container.subList(start, end)));
    }

    //delete all same  chars  like :  Samas =>Sams  (S!=s)
    CharList removeDuplicates() {
        LinkedHashSet<Character> hashSet = new LinkedHashSet<>(container);
        ArrayList<Character> list1 = new ArrayList<>(hashSet);
        return new CharList(list1);
    }

    //delete first found chosen char
    CharList removeFirst(Character c) {
        container.remove(c);
        return new CharList(container);
    }

    //removes every chosen char
    CharList removeAll(Character c) {
        container.removeAll(Collections.singleton(c));
        CharList list = new CharList(container);
        return list;
    }

    //proveriat na pustotu  stroku
    boolean isEmpty() {
        boolean b;
        String s = container.toString();
        // System.out.println("SSS "+s.isEmpty()+" "+s);
        if (s == "[]") {
            b = true;
        } else
            b = false;
        return b;
    }

    // check if introduced char exists in text
    boolean contains(Character c) {
        if (container.toString().contains(c.toString())) {
            return true;
        } else
            return false;
    }

    CharList clearList() {
        container.clear();
        CharList list = new CharList(container);
        return list;
    }

    CharList sortList() {
        Collections.sort(container);
        CharList list = new CharList(container);
        return list;
    }

    //reverse text
    CharList reverseList() {
        Collections.reverse(container);
        CharList list = new CharList(container);
        return list;
    }


    //mixes chars in text
    CharList mixedList() {
        Collections.shuffle(container);
        CharList list = new CharList(container);
        return list;

    }
}

