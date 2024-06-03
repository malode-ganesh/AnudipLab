class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList02 {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void appendList(SinglyLinkedList02 list2) {
        if (head == null) {
            head = list2.head;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = list2.head;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList02 list1 = new SinglyLinkedList02();
        list1.add(22);
        list1.add(33);
        list1.add(44);
        list1.add(55);

        SinglyLinkedList02 list2 = new SinglyLinkedList02();
        list2.add(66);
        list2.add(77);
        list2.add(88);
        list2.add(99);

        System.out.println("List 1 before appending:");
        list1.printList();

        System.out.println("List 2:");
        list2.printList();

        list1.appendList(list2);

        System.out.println("List 1 after appending List 2:");
        list1.printList();
    }
}
