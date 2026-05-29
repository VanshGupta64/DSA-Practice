package com.example.dsa_practice.graph;

public class DisjointSetUnion {
    //we are doing union by rank/size and path compression
    //3 steps : 1. initialization of parent array, 2. findParent, 3. union by rank or size
    public int []parent;
    public int []rank;
    public int []size;

    //initialization through constructor
    public DisjointSetUnion(int n){
        parent = new int[n];
        rank = new int[n];
        size = new int[n];
        for(int i = 0; i < n; i++){
            parent[i] = i;
            size[i] = 1;
            rank[i] = 0;
        }
    }
    public int findParent(int u){
        if(parent[u] == u) return u;
        return parent[u] = findParent(parent[u]);
    }
    public void unionByRank(int u, int v){
        int pU = findParent(u);
        int pV = findParent(v);
        if(rank[pU] < rank[pV]){
            parent[pU] = pV;
        }
        else if(rank[pU] > rank[pV]){
            parent[pV] = pU;
        }
        else{
            parent[pV] = pU;
            rank[pU]++;
        }
    }
    public void unionBySize(int u, int v){
        int pU = findParent(u);
        int pV = findParent(v);
        if(size[pU] < size[pV]){
            parent[pU] = pV;
            size[pV] += size[pU];
        }
        else{
            parent[pV] = pU;
            size[pU] += size[pV];
        }
    }
}
