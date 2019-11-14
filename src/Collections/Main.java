package Collections;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
CharList pervii = new CharList("abc12345");

        System.out.println(pervii.toString());
        System.out.println(pervii.length());
        System.out.println(pervii.charAt(1));
        System.out.println(pervii.indexOf('5'));
        System.out.println(pervii.subString(3,5));
        System.out.println(pervii.removeDuplicates());
        System.out.println(pervii.reverseList());
        System.out.println(pervii.removeAll('a'));
        System.out.println(pervii.mixedList());

    }

}
