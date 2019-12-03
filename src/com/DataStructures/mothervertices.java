/*package whatever //do not write package name here */

import java.util.Scanner;
import java.util.LinkedList;

class MotherVertices {
    int v;
    int l = -1;
    LinkedList<Integer> adj[];

    public MotherVertices(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int src, int dest) {
        adj[src].add(dest);
    }

    void dfsUtil(int i, boolean visited[]) {
        visited[i] = true;
        for (Integer j : adj[i]) {
            if (!visited[j])
                dfsUtil(j, visited);
        }
    }

    void dfs() {
        boolean visited[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                l = i;
                dfsUtil(i, visited);
            }
        }
        for (int i = 0; i < v; i++)
            visited[i] = false;
        dfsUtil(l, visited);
        int f = 0;
        for (int i = 0; i < v; i++) {
            if (visited[i] == false) {
                f = 1;
                break;
            }
        }
        if (f == 0)
            System.out.println("Mother Vertices " + l);
        else
            System.out.println("No Mother Vertices");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        MotherVertices ob = new MotherVertices(v);
        int e = sc.nextInt();
        while (e-- > 0) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            ob.addEdge(src, dest);
        }
        ob.dfs();
    }
}

// sample input
// 7 8
// 0 1
// 0 2
// 1 3
// 4 1
// 6 0
// 6 4
// 5 2
// 5 6