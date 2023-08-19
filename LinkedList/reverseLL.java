import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class reverseLL {
    node head;

    class node {

        node next;
        int data;

        node(int data) {
            this.data = data;
            next = null;
        }

    }

    public void ADDfirst(int data) {
        node newnode = new node(data);
        newnode.next = head;
        head = newnode;

    }

    public void reversed() {
        if (head == null || head.next == null) {
            return;
        }
        node prev = head;
        node curr = head.next;
        while (curr != null) {
            node nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }

        head.next = null;
        head = prev;
    }

    public void print() {
        node p = head;
        while (p != null) {
            System.out.print(p.data + "-->" );
            p = p.next;

        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        System.out.println("hello");

        reverseLL ll=new reverseLL();


        ll.ADDfirst(50);
        ll.ADDfirst(40);
        ll.ADDfirst(30);
        ll.ADDfirst(20);
        ll.ADDfirst(10);

        ll.print();
        ll.reversed();

        System.out.println();
        ll.print();




    }


}