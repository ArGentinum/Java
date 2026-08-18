import heapq

def bestfs(graph,heuristic,start,goal):
    visited=set()
    min_heap=[]
    heapq.heappush(min_heap,(heuristic[start],start))
    visited.add('a')
    while min_heap:
        curr_h,curr=heapq.heappop(min_heap)
        if curr=='f':
            print('goal:'+curr+' reached!')
            return

        for neighbour in graph[curr]:
            if neighbour not in visited:
                visited.add(neighbour)
                heapq.heappush(min_heap,(heuristic[neighbour],neighbour))

        print('visited:'+curr)



graph={'a':['b','d'],'b':['a','c','e'],'c':['b','e','f'],'d':['a','e'],'e':['d','b','c','f'],'f':['c']}
heuristic={'a':50,
           'b':10,
           'c':2,
           'd':5,
           'e':11,
           'f':0}
bestfs(graph,heuristic,'a','f')
