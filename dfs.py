from collections import deque

def dfs(graph,current,visited):
    if current not in visited:
        visited.add(current)
    for neighbour in graph[current]:
        if neighbour not in visited:
            dfs(graph,neighbour,visited)
    print(current)




graph={'a':['b','d'],'b':['a','d','c'],'c':['b','e'],'d':['a','b'],'e':['c']}
visited=set()
start=input('enter the element to start dfs from:')
dfs(graph,start,visited)

