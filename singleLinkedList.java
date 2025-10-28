import java.util.Scanner;
   class node{
        int data;
        node next;

        node(int data){
            this.data=data;
            this.next=null;
        }
    }
public class singleLinkedList {
    Scanner sc = new Scanner(System.in);
    node head=null;
    node temp=head;
    int data;

    void create(int n){
        for(int i=0; i<n; i++){
            System.out.print("Enter the data of the "+(i+1)+" node: ");
            data=sc.nextInt();
            node newnode = new node(data);
            if(head==null)
            head=temp=newnode;
            else{
                temp.next=newnode;
                temp=newnode;
            }
        }
    }
    void display(){
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
     
    void insertAtBeg(int data){
        node newnode = new node(data);
        if(head==null)
        head=newnode;
        else{
            newnode.next=head;
            head=newnode;
        }
    }

    void insertAtPos(int pos, int data){
        node newnode = new node(data);
        if(head==null)
        head=newnode;
        else{
            temp=head;
            while(temp!=null){
                if(temp.data==pos){
                    newnode.next=temp.next;
                    temp.next=newnode;
                }
                temp=temp.next;
            }
        }
    }

    void insertAtEnd(int x){
        node newnode = new node(x);
        if(head==null){
            head=newnode;
        }
        else{
            temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }

    void deleteAtBeg(){
        if(head==null){
            System.out.println("There's nothing to delete here!!");
        }
        else{
            head=head.next;
        }
    }

    void deleteAtPos(int pos){
       if(head==null){
            System.out.println("There's nothing to delete here!!");
        }
        else{
            node pre=head;
            temp=head.next;
            while(temp.next!=null){
                if(temp.data==pos){
                    pre.next=temp.next;
                }
                temp=temp.next;
                pre=pre.next;
            }
        } 
    }

    void delAtEnd(){
        if(head==null){
            System.out.println("There's nothing to delete here!!");
        }
        else{
            temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
    }
    public static void main(String[] args){
        singleLinkedList sll = new singleLinkedList();
        sll.create(5);
        sll.display();
        sll.insertAtBeg(0);
        sll.display();
        sll.insertAtPos(3, 8);
        sll.display();
        sll.insertAtEnd(6);
        sll.display();
        sll.deleteAtBeg();
        sll.display();
        sll.deleteAtPos(3);
        sll.display();
        sll.delAtEnd();
        sll.display();
    }
}
