# Graphs
Implementing Graphs, Minimum Spaning Trees and Shortest Path Algorithms

## Graph :
a graph is a non-empty finite set V of elements called vertices together with a possibly empty set E of pairs of vertices called edges. G(V,E)


##  Minimum Spanning Tree
**Weighted Graphs:** A weighted graph is a graph, in which each edge has a weight (some real number).

**A Minimum Spanning Tree** in an undirected connected weighted graph is a spanning tree of minimum weight (among all spanning trees).
The minimum spanning tree may not be unique. However, if the weights of all the edges are pairwise distinct, it is indeed unique.

**MST Problem:** Given a connected weighted undirected graph G , design an algorithm that outputs a minimum spanning tree (MST) of G.


*Prim’s Algorithm*
The Prim’s algorithm makes a nature choice of the cut in each iteration – it
grows a single tree and adds a light edge in each iteration.


## Shortest Path Algorithm
The shortest path between two vertices is a path with the shortest length(weight).

**Dijkstra’s Algorith**
The Dijkstra’s algorithm is a solution to the single-source shortest path problem in graph theory !
Both directed and undirected graphs !
All edges must have nonnegative weights !
Graph must be connected
