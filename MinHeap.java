import java.util.Scanner;
public class MinHeap{
    static int minheap[]=new int[100];
    static int last_index=0;


    static void swap(int x,int y){
        int temp=minheap[x];
        minheap[x]=minheap[y];
        minheap[y]=temp;
    }

    static void heapify_up(int index){
        int parent_index=(index-1)/2;
        if(index==0||minheap[index]>minheap[parent_index])return;

        else{
            swap(index,parent_index);
            heapify_up(parent_index);
        }
    }

    static void insert(int data){
        minheap[last_index]=data;
        heapify_up(last_index);
        ++last_index;
    }

    static void print_minheap(){
        for(int i=0;i<last_index;++i){
        System.out.print(minheap[i]);
        if(i<last_index-1)
        System.out.print(",");
        }
        System.out.print("\n");
    }

    static void delete(int index){
        if(index>=last_index){
            System.out.print("index out of minheap bounds!");
            return;
        }

        else{
            swap(index,last_index-1);
            --last_index;
            heapify_down(index);
        }
    }

    static void heapify_down(int index){
        int lchild=index*2+1;
        int rchild=index*2+2;
        int smallest=index;

        if(lchild<last_index&&minheap[lchild]<minheap[smallest])
        smallest=lchild;

        if(rchild<last_index&&minheap[rchild]<minheap[smallest])
        smallest=rchild;

        if(smallest!=index){
            swap(smallest,index);
            heapify_down(smallest);
        }
    }

    public static void main(String[] args){
        //int minheap[]=new int[100];
        Scanner scan=new Scanner(System.in);
        insert(2);                                   //      1
        insert(100);                                //   2       5
        insert(5);                                //  100 10    7
        insert(10);
        insert(1);
        insert(7);
        print_minheap();
        System.out.print("enter the index of the element to be deleted:");
        delete(scan.nextInt());
        print_minheap();
    }
}