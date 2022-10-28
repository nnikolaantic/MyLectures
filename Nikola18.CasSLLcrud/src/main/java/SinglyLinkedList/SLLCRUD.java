/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinglyLinkedList;

/**
 *
 * @author Anta
 */
public class SLLCRUD {
    
    private Node head;
    private Node tail;
    private int size;

    public SLLCRUD() {
        this.size = 0;
    }   
    
    public void addFirst(int val){
        Node node = new Node(val);
        //Ako je lista prazna inicijalizujemo i head i tail
        if(head == null){
            head = node;
            tail = head;
            size += 1;
            return;
        }              
        node.next = head;
        head = node;
        size += 1;
    }
    
    public void addLast(int val) {
        if (tail == null) {
            addFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    
    public void insert(int val, int index) {
        if (index < 0 || index > size) {
            System.out.println("Uneti index [" + index + "] je van okvira nase LinkedListe cija je velicina " + size);
            return;
        }
        
        if (index == 0) {
            addFirst(val);
            return;
        }
        if (index == size) {
            addLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
//      Jako bitan korak da ne bi doslo do gubitka podataka
//        Node node = new Node(val);
//        node.next = temp.next;
//      ---------------------------------------------------
        temp.next = node;

        size++;
    }
    
    // insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }
    public Node get(int index) {
        if (index < 0 || index > size) {
            System.out.println("Uneti index [" + index + "] je van okvira nase LinkedListe cija je velicina " + size);

        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    
    public String getNodeValueInfo(int index) {
        if (index < 0 || index > size) {
            return "Uneti index [" + index + "] je van okvira nase LinkedListe cija je velicina " + size;
        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return "Vrednost trazenog Node-a je : " + node.data;
    }
    

    public String deleteFirst() {
        int data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return "Node with data: |" + data + "--> was deleted";
    }
    
    public String deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int data = tail.data;
        tail = secondLast;
        tail.next = null;
        size--;
        return "Node with data: |" + data + "--> was deleted";
    }

    public String delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int data = prev.next.data;

        prev.next = prev.next.next;
        size--;
        return "Node with data: |" + data + "--> was deleted";
    }
    
    public Node find(int val) {
        Node node = head;
        while (node != null) {
            if (node.data == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public String findNodeInfo(int value) {
        Node node = head;
        while (node != null) {
            if (node.data == value) {
                return "Node sa vrednsoscu + " + value + " je pronadjen!";
            }
            node = node.next;
        }
        return "Node sa vrednsoscu + " + value + " nije pronadjen!";
    }
    
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    
    
    public void update(int index, Node newNode){
        System.out.println(size);
        if (index < 0 || index > size) {
            System.out.println("Uneti index [" + index + "] je van okvira nase LinkedListe cija je velicina " + size);
            return;
        }
        if (index == 0) {
            head = newNode;
            newNode.next = head.next;
            return;
        }
        if(index == size){
            Node secondLatest = head;
            for (int i = 0; i < index - 2; i++) {
                secondLatest = secondLatest.next;
            }
            secondLatest.next = newNode;
            newNode.next = null;
            tail = newNode;
            return;
        }
        Node tempPrev = head;
        for (int i = 0; i < index-1; i++) {
            tempPrev = tempPrev.next;
        }
        System.out.println("Node na indexu + " + index + " je updajtovan sa vrednosti " + tempPrev.next.data + " na vrednost " + newNode.data);
//        ovo je jako bitan korak da se ne bi izgubili podacis
        newNode.next = tempPrev.next.next;
        tempPrev.next = newNode;
    }
    
    //MOJA
    public void insertFirstNode(Node n){
        if(n == null) {
            System.out.println("Ne mozete dodati prazan cvor u listu");
            return;
        }
        if(head == null) { // ako je lista prazna
            head = n;
            System.out.println("Cvor je dodat na pocetak");
            return;
        }
        n.next = head;
        head = n;
        System.out.println("cvor je dodat u listu");
    }
    //MOJA
    public void addNaKraj(Node n) { // dodadvanje na kraj liste
        if(n == null) {
            System.out.println("Ne mozete dodati prazan cvor u listu");
            return;
        }
        if(head == null) { // lista prazna
            insertFirstNode(n);
            return;
        }
        Node temp = head;
        while(temp.next != null) { // iteracija kroz clanove do poslednjeg
            temp = temp.next;
        }
        temp.next = n;
    }
        
    //MOJA MERODA ZA UPDATE
    
    public void updateList(Node n,Node p){

        if(n == null){
            System.out.println("Ne mozete updejtovati listu praznim nodom!!!");
            return;
        }
        if(head == null){
            System.out.println("Lista mora imati elemente da bi se updejtovala");
            return;
        }
        Node temp = head;
        while(temp != null){
            if(temp.data == p.data){ //ovo je ukoliko updejtujemo prvi nod u listi
                n.next = p.next; 
                head = n;
                return;
        }
        if(temp.next.data == p.data){//ovo je ukoliko updejtujemo nod koji je u sredini liste ili na kraju
            n.next = p.next; 
            temp.next = n;
            p = n;  
            return;
        } 
        temp = temp.next;
    }
    System.out.println("Nije nadjen node koji zelite zameniti");
    }
    
    public void print() {
//        if(head.next == null) {
//            System.out.println("head.next je NULL");
//            System.out.println("head.data je " + head.data);
//        }
        if(head == null) {
            System.out.println("Lista je prazna");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
            if(temp == null)
                System.out.println("NULL");
        }
    }
    
    public int size() {
        int brojac = 0;
        
        if(head == null)
            return brojac;
        
        Node temp = head;
        while(temp != null) {
            brojac++;
            temp = temp.next;
        }
        
        return brojac;
    }
    
    //Sortiranja-------------------------------------------------------------------------------------------------------------
    //Sortiranja-------------------------------------------------------------------------------------------------------------
    //Sortiranja-------------------------------------------------------------------------------------------------------------
    //Sortiranja-------------------------------------------------------------------------------------------------------------
    public void duplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.data == node.next.data) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public static SLLCRUD merge(SLLCRUD first, SLLCRUD second) {
        Node f = first.head;
        Node s = second.head;

        SLLCRUD ans = new SLLCRUD();

        while (f != null && s != null) {
            if (f.data < s.data) {
                ans.addLast(f.data);
                f = f.next;
            } else {
                ans.addLast(s.data);
                s = s.next;
            }
        }

        while (f != null) {
            ans.addLast(f.data);
            f = f.next;
        }

        while (s != null) {
            ans.addLast(s.data);
            s = s.next;
        }

        return ans;
    }

    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.data > second.data) {
                // swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }

    // recursion reverse
    private void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void reverse() {
        if (size < 2) {
            return;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
    }
}
