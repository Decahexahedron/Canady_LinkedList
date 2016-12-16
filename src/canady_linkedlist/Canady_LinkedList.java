package canady_linkedlist;

import java.util.*;

public class Canady_LinkedList {

    static Element e5 = new Element(null, 0, "e5", "z", "g");
    static Element e4 = new Element(e5, 1, "e4", "x", "f");
    static Element e3 = new Element(e4, 2, "e3", "c", "d");
    static Element e2 = new Element(e3, 3, "e2", "v", "s");
    static Element e1 = new Element(e2, 4, "e1", "b", "a");
    static Element first = e1;
    static Element last = e5;
    static boolean go = true;
    static boolean empty = false;

    public static void main(String[] args) throws InterruptedException {
        while (go) {
            if (first == null) {
                empty = true;
            }
            choice(empty);
        }
    }

    public static void choice(boolean e) throws InterruptedException {
        listt(e);
        System.out.println("What do");
        System.out.println("1. Create and add an item to the start");
        System.out.println("2. Remove from the start");
        System.out.println("3. Remove from the end");
        System.out.println("4. Quit");
        Scanner sc = new Scanner(System.in);
        int input;
        input = sc.nextInt();
        if (input == 1) {
            add();
        } else if (input == 2) {
            del(e);
        } else if (input == 3) {
            delEnd(e);
        } else if (input == 4) {
            go = false;
        }
        for (int i = 0; i < 32; i++) {
            System.out.println("");
        }
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
        Thread.sleep(200);
        System.out.println("What is the power level of the new element?");
        Thread.sleep(200);
        input1 = sc.nextInt();
        newitem.setPower(input1);
        Thread.sleep(200);
        System.out.println("What is the species of the new element?");
        Thread.sleep(200);
        input2 = sc.nextLine();
        input2 = sc.nextLine();
        newitem.setSpec(input2);
        Thread.sleep(200);
        System.out.println("What is the ability of the new element?");
        Thread.sleep(200);
        input2 = sc.nextLine();
        newitem.setAbility(input2);
        Thread.sleep(200);
        newitem.setTail(first);
        first = newitem;
        empty = false;
    }

    static void del(boolean e) {
        if (e) {
            System.out.println("Your list is empty!");
            return;
        } else {
            final Element ffirst = first;
            first = ffirst.tail;
            ffirst.tail = null;
        }
    }

    static void delEnd(boolean e) {
        if (e) {
            System.out.println("Your list is empty!");
        } else {
            final Element l = last;
            Element placeholder;
            placeholder = first;
            if (l == placeholder) {
                first = null;
                last = null;
                first.tail = null;
            } else {
                while (placeholder.tail != l) {
                    placeholder = placeholder.tail;
                }
                last = placeholder;
                last.tail = null;
            }
        }
    }

    static void listt(boolean e) {
        if (e) {
            System.out.println("Your list is empty!");
        } else {
            Element placeholder = first;
            while (placeholder.tail != null) {
                System.out.println(placeholder.toString());
                placeholder = placeholder.tail;
            }
            System.out.println(placeholder.toString());
        }
    }
}
