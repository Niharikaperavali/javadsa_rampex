import java.util.LinkedList;
import java.util.Queue;

class Tnode{
    int data;
    Tnode left;
    Tnode right;

    Tnode(int value){
        data = value;
    }
}

class Basic {

    void level(Tnode root){
        if(root == null) return;

        Queue<Tnode> t = new LinkedList<>();
        t.offer(root);

        while(!t.isEmpty()){
            Tnode temp = t.poll();
            System.out.println(temp.data);

            if(temp.left != null)
                t.offer(temp.left);

            if(temp.right != null)
                t.offer(temp.right);
        }
    }

    Tnode BST(Tnode root, int value){
        if(root == null){
            return new Tnode(value);
        }

        if(value < root.data){
            root.left = BST(root.left, value);
        }
        else if(value > root.data){
            root.right = BST(root.right, value);
        }

        return root;
    }

    boolean search(Tnode root, int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(key < root.data){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }

    // delete only leaf node
    Tnode deleteLeaf(Tnode root, int key){

        if(root == null){
            return null;
        }

        if(key < root.data){
            root.left = deleteLeaf(root.left, key);
        }

        else if(key > root.data){
            root.right = deleteLeaf(root.right, key);
        }

        else{
            if(root.left == null && root.right == null){
                return null;
            }
        }

        return root;
    }

    public static void main(String[] args){

        Basic ob = new Basic();
        Tnode root = null;

        root = ob.BST(root, 10);
        root = ob.BST(root, 5);
        root = ob.BST(root, 20);
        root = ob.BST(root, 4);

        System.out.println("Before Deletion:");
        ob.level(root);

        root = ob.deleteLeaf(root, 4); // delete leaf node

        System.out.println("After Deletion:");
        ob.level(root);
    }
}
