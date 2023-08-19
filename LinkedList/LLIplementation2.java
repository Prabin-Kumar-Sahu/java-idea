public class LLIplementation2 {

    Node head;

    class Node {
        Node head;
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;


    }

    public void addLast(String data) {
        Node p = head;
        Node newNode = new Node(data);
        while (p.next != null) {
            p = p.next;
        }
        p.next = newNode;
    }

    public void print() {
        Node p = head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }

    public void removefirst() {
        if (head == null) {
            System.out.println("Nothing to remove");
        }
        head = head.next;

    }

    public void removeLast() {
        if (head == null) {
            System.out.println("nothing to remove");
        }
        Node p = head;
        while (p.next.next != null) {
            p = p.next;
        }
        p.next = null;
    }


    public static void main(String[] args) {
        LLIplementation2 list = new LLIplementation2();
        list.addFirst("helloooooooooooooo");
        list.addFirst("hello");
        list.addFirst("hello");
        list.addFirst("hello");
        list.addFirst("hello");
        list.addFirst("hello");
//        list.removefirst();
//        list.removeLast();
        list.addLast("bhaisab");
        list.print();
    }
}
