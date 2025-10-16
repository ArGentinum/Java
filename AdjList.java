//import heap.MinHeap;
//import java.util.Scanner;
import java.util.ArrayList;

public class AdjList{
    int weight;
    int edge;

    public AdjList(int weight,int edge){
        this.edge=edge;
        this.weight=weight;
}

static void insert_into_AdjacencyList(ArrayList<ArrayList<AdjList>> AdjacencyList,int index,int weight,int edge){
AdjacencyList.get(index).add(new AdjList(weight,edge));
}


static void print(ArrayList<ArrayList<AdjList>> AdjacencyList){
for(int i=0;i<AdjacencyList.size();++i){
    System.out.printf("node: %d",i);
    for(AdjList adj:AdjacencyList.get(i)){
    System.out.printf("  ->[to:%d,weight:%d]",adj.edge,adj.weight);
    }
    System.out.println("\n");
}
}



    public static void main(String[] args){
        ArrayList<ArrayList<AdjList>> edge=new ArrayList<>();
        int n=4;

        //initialise edges 
        for(int j=0;j<n;++j){
            edge.add(new ArrayList<AdjList>());
        }


        insert_into_AdjacencyList(edge,0,5,1);                   
         insert_into_AdjacencyList(edge,0,1,2);                
          insert_into_AdjacencyList(edge,2,1,0);                  
           insert_into_AdjacencyList(edge,2,3,3);
             insert_into_AdjacencyList(edge,3,3,2);
              insert_into_AdjacencyList(edge,1,5,0);
                                                                     
       

       //print the adjacency list
       print(edge);

      
}
}