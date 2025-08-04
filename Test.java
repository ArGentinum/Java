
 class Bst_node{
    Bst_node left,right;
    int data;

     Bst_node(int data){
        this.left=null;
        this.right=null;
        this.data=data;
    }
}


 class Avl_tree{
    public static Bst_node root=null;
    public static Bst_node fin_root,alt_root;

    public void insert(int data){
        root=root_insert(root,data);
    }

    static Bst_node root_insert(Bst_node root,int data){
        if(root==null)
        return new Bst_node(data);
        
        else if(data>root.data)
        root.right=root_insert(root.right,data);


        else if(data<root.data)
        root.left=root_insert(root.left,data);
        
        
        fin_root=root;
        root=find_height(fin_root);
        
        return root;
        
    }


    public int height_build(){
        int height=height(root,0,0);
        return height;
    }

    static int height(Bst_node root,int fin_height,int alt_height){
        if(root==null)
        {
            --alt_height;
            if(fin_height<alt_height)
            fin_height=alt_height;
            return fin_height;
        }

        else{

            ++alt_height;
            fin_height=height(root.left,fin_height,alt_height);
            fin_height=height(root.right,fin_height,alt_height);

            
        }
        --alt_height;
        return fin_height;
    }

    static Bst_node balance(Bst_node start,Bst_node mid,Bst_node last){
        //LL case
        if(start.left==mid&&mid.left==last){
            Bst_node temp=mid.right;
            mid.right=start;
            start.left=temp;
            return mid;
        } 

        //RR case
        else if(start.right==mid&&mid.right==last){
            Bst_node temp=mid.left;
            mid.left=start;
            start.right=temp;
            return mid;
        }

        //LR case
        else if(start.left==mid&&mid.right==last){
            Bst_node temp1=last.left;
            Bst_node temp2=last.right;
            last.left=mid;
            last.right=start;
            start.left=temp2;
            mid.right=temp1;
            return last;
        }

        //RL case
        else if(start.right==mid&&mid.left==last){
            Bst_node temp1=last.left;
            Bst_node temp2=last.right;
            last.left=start;
            last.right=mid;
            start.right=temp1;
            mid.left=temp2;
            return last;
        }

        return start;
    }


    static Bst_node find_height(Bst_node root){
        alt_root=root;
        int right_height,left_height,balance_factor;

        if(root.left==null)
        left_height=0;
        else
        left_height=height(root.left,1,1);

        if(root.right==null)
        right_height=0;
        else
        right_height=height(root.right,1,1);

        balance_factor=left_height-right_height;

        if(fin_root==alt_root){
            if(balance_factor==-1
             ||balance_factor==0
             ||balance_factor==1)
             return root;

             else if(balance_factor>1)
             root=balance(root,root.left,find_height(root.left));

             else if(balance_factor<-1)
             root=balance(root,root.right,find_height(root.right));
        }

        else{
            if(balance_factor>0)
            return root.left;

            else
            return root.right;
        }

        return root;
    } 




    public  void pre_order(){
        root_preorder(root);
    }




    static void root_preorder(Bst_node root){
        if(root==null)
        return;

        else{
            System.out.print(root.data+",");
            root_preorder(root.left);
            root_preorder(root.right);
        }
    }




}

public class Test{
public static void main(String[] args){
    Avl_tree obj=new Avl_tree();
    obj.insert(50);
    obj.insert(30);
    obj.insert(70);
    obj.insert(20);
    obj.insert(40);
    obj.insert(60);
    obj.insert(80);
    obj.insert(10);
    obj.insert(25);
    obj.insert(35);
    obj.insert(45);
    obj.insert(55);
    obj.insert(65);
    obj.insert(75);
    obj.insert(85);
    obj.insert(5);
    obj.insert(15);
    obj.insert(27);
    obj.insert(42);
    obj.insert(90);
    obj.pre_order();
    //System.out.println("height of the bst is:"+obj.height_build());

}
}