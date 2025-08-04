import java.util.*;

class bst{
    bst left;
    int data;
    bst right;
    int head;
     
    bst(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }


    static bst insert(bst root,int data){
        if(root==null){
        root=new bst(data);
        return root;
        }


        else if(data>root.data)
        root.right=insert(root.right,data);

        else if(data<root.data)
        root.left=insert(root.left,data);

    return root;
    }

    static void preorder(bst root){
    if(root==null)
    return;

    else{
        System.out.print(root.data+",");
        preorder(root.left);
        preorder(root.right);
    }

    }

    static void level_order(bst root){
        Queue<String> queue =new LinkedList<>();

        if (root==null)
        return;

        else{
            queue.offer(root.data);
            level_order(root.left);
            level_order(root.right);
        }

        
    }
    
public static void main(String[] args){
bst root=null;
root=insert(root,10);
root=insert(root,20);
root=insert(root,30);
root=insert(root,9);
root=insert(root,5);
root=inser(root,0);
root=insert(root,11);
preorder(root);
level_order(root);
//queue_construct(root);

}
}