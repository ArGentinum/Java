from collections import deque

def dfs(graph,current,visited):
    for neighbour in graph[current]:
        if neighbour not in visited:
            visited.add(neighbour)
            dfs(graph,neighbour,visited)
    print(current)




graph={'a':['b','d'],'b':['a','d','c'],'c':['b','e'],'d':['a','b'],'e':['c']}
visited=set()
#stack=deque()
start=input('enter the element to start dfs from:')
visited.add(start)
#stack.append(start)
dfs(graph,start,visited)

