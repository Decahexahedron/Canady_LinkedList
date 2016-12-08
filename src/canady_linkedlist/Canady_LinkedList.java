package canady_linkedlist;

import java.util.*;

public class Canady_LinkedList {

    static Element e5 = new Element(null, 0, "e5", "d", "z");
    static Element e4 = new Element(e5, 1, "e4", "s", "y");
    static Element e3 = new Element(e4, 2, "e3", "b", "h");
    static Element e2 = new Element(e3, 3, "e2", "c", "n");
    static Element e1 = new Element(e2, 4, "e1", "x", "m");
    static Element first = e1;
    static Element last = e5;

    public static void main(String[] args) throws InterruptedException {
        add();
        listt();
    }

    static void add() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int input1;
        String input2;
        Element newitem;
        newitem = new Element(null, 0, "", "", "");
        System.out.println("What is the new element's name?");
        Thread.sleep(200);
        input2 = sc.nextLine();
        newitem.setName(input2);
        Thread.sleep(400);
        System.out.println("What is the power level of the new element?");
        Thread.sleep(200);
        input1 = sc.nextInt();
        newitem.setPower(input1);
        Thread.sleep(400);
        System.out.println("What is the species of the new element?");
        Thread.sleep(200);
        input2 = sc.nextLine();
        newitem.setSpec(input2);
        Thread.sleep(400);
        System.out.println("What is the ability of the new element?");
        Thread.sleep(200);
        input2 = sc.nextLine();
        newitem.setAbility(input2);
        Thread.sleep(400);
        newitem.setTail(first);
        first = newitem;
    }

    static void del(int e) {

    }

    static void delEnd(int e) {

    }

    static void listt() {
        Element placeholder;
        placeholder = first;
        while (placeholder.tail != null) {
            System.out.println(placeholder.toString());
            placeholder = placeholder.tail;
        }
        System.out.println(placeholder.toString());
    }
}
