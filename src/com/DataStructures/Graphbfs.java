import java.util.*;

import sun.misc.Queue;

class Graphbfs {
    static private int V;
    static private LinkedList<Integer>[] adj;

    Graphbfs(int v) {
        V = v;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destinaton) {
        adj[source].add(destinaton);
    }

    void bfs(int source) {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[source] = true;
        queue.add(source);

        while (queue.size() != 0) {
            source = queue.poll();
            System.out.print(source + " ");

            Iterator<Integer> i = adj[source].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    void dfs(int s) {
        boolean[] visited = new boolean[V];
        dfsutil(s, visited);
    }

    void dfsutil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                dfsutil(n, visited);
            }
        }
    }

    int findMotherVertex() {
        boolean[] visited = new boolean[V];
        int v = 0;
        for (int i = 0; i < V; i++) {
            // visited[i] = true;
            if (!visited[i]) {
                dfsutil(i, visited);
                v = i;
            }
        }
        for (int i = 0; i < V; i++)
            visited[i] = false;

        dfsutil(v, visited);
        int flag = 0;

        for (int i = 0; i < V; i++) {
            flag = (visited[i] == false) ? 1 : 0;
        }
        System.out.println("motherVretx" + v + " haha");
        return (flag == 0) ? v : -1;
    }

    public static void main(String[] args) {
        Graphbfs g = new Graphbfs(7);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(4, 1);
        g.addEdge(6, 4);
        g.addEdge(5, 6);
        g.addEdge(5, 2);
        g.addEdge(6, 0);
        g.bfs(3);
        System.out.println("");
        g.dfs(2);
        System.out.println("hhusy");
        System.out.println(g.findMotherVertex());
    }
}