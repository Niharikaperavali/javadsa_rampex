class node{
    int data;
    node right;
    node left;
}
class Basic{
    node head;
    node tail;
     int length;
     void addFirst(int value){
        node newNode=new node();
        newNode.data=value;
        if(head==null){
            head=newNode;
            tail=newNode;

        }
        else{
            newNode.right=head;
            head.left=newNode;
            head=newNode;
        }
       }
       void addLast(int value){
         node newNode=new node();
        newNode.data=value;
        if(head==null){
            head=newNode;
            tail=newNode;

        }
       }
       void display(){
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.right;
        }
       }
       
}
public class linkedlist {
    public static void main(String[] args) {
        Basic list=new Basic();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.display();
    }
}