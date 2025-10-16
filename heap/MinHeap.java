package heap;
//import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class MinHeap{
    //static int minheap[]=new int[100];
    //static int last_index=0;
    static ArrayList <Integer>MinHeap=new ArrayList<>(); 


    static void swap(int x,int y){
        int temp=MinHeap.get(x);
        MinHeap.set(x,MinHeap.get(y));
        MinHeap.set(y,temp);
    }

    static void heapify_up(int index){
        int parent_index=(index-1)/2;
        if(index==0||MinHeap.get(index)>MinHeap.get(parent_index))return;

        else{
            swap(index,parent_index);
            heapify_up(parent_index);
        }
    }

    public void insert(int data){
        MinHeap.add(data);
        heapify_up(MinHeap.size()-1);
    }

    
    public void print_minheap(){
        System.out.print(MinHeap+"\n");
    }


    public void delete(int index){
        if(index>=MinHeap.size()){
            System.out.print("index out of minheap bounds!");
            return;
        }

        else{
            swap(index,MinHeap.size()-1);
            MinHeap.remove(MinHeap.size()-1);    
            heapify_down(index);
        }
    }

    

    static void heapify_down(int index){
        int lchild=index*2+1;
        int rchild=index*2+2;
        int smallest=index;

        if(lchild<MinHeap.size()&&MinHeap.get(lchild)<MinHeap.get(smallest))
        smallest=lchild;

        if(rchild<MinHeap.size()&&MinHeap.get(rchild)<MinHeap.get(smallest))
        smallest=rchild;

        if(smallest!=index){
            swap(smallest,index);
            heapify_down(smallest);
        }
    }

    

    public static void main(String[] args){
        //int minheap[]=new int[100];
        Scanner scan=new Scanner(System.in);
        MinHeap minheap=new MinHeap();
        minheap.insert(2);                                   //      1
        minheap.insert(100);                                //   2       5
        minheap.insert(5);                                //  100 10    7
        minheap.insert(10);
        minheap.insert(1);
        minheap.insert(7);
        minheap.print_minheap();
        System.out.print("enter the index of the element to be deleted:");
        minheap.delete(scan.nextInt());
        minheap.print_minheap();
        scan.close();
    }
        
        
}