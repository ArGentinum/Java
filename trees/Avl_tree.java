public class Avl_tree{
    public static Bst_node root=null;

    public void insert(int data){
        root=root_insert(root,data);
    }

    static Bst_node root_insert(Bst_node root,int data){
        if(root==null){
        root=new Bst_node(data);
        return root;
        }
        
        else if(data>root.data)
        root.right=root_insert(root.right,data);

        else if(data<root.data)
        root.left=root_insert(root.left,data);
        
        return root;
    }

    public  void postorder(){
        root_postorder(root);
    }

    static void root_postorder(Bst_node root){
        if(root==null)
        return;

        else{
            System.out.print(root.data+",");
            root_postorder(root.left);
            root_postorder(root.right);
        }
    }
}