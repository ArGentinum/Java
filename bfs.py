from collections import deque

def dfs(graph,start):
    queue=deque()
    visited=set()
    queue.append(start)
    visited.add(start)

    while queue:
        current=queue.popleft();
        print(current)
        for neighbour in graph[current]:
            if neighbour not in visited:
                visited.add(neighbour)
                queue.append(neighbour)


graph={'a':['b','d'],'b':['a','d','c'],'c':['b','e'],'d':['a','b'],'e':['c']}
start=input('enter the element to start dfs from:')
dfs(graph,start)