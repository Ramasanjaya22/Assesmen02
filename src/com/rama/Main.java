package com.rama;

public class Main {

    public static void main(String[] args)
    {

        //buat node
        Node n1=new Node("London");
        Node n2=new Node("Salisbury");
        Node n3=new Node("Bristol");
        Node n4=new Node("Birmingham");
        Node n5=new Node("Cardiff");
        Node n6=new Node("Manchester");
        Node n7=new Node("Kingston");
        Node n8=new Node("Liverpool");
        Node n9=new Node("Newcastle");
        Node n10=new Node("Edinburgh");
        Node n11=new Node("Glasgow");

        //buat graf, tambah nodes, buat edge antar node nya
        Graph g=new Graph();
        g.addNode(n1);
        g.addNode(n2);
        g.addNode(n3);
        g.addNode(n4);
        g.addNode(n5);
        g.addNode(n6);
        g.addNode(n7);
        g.addNode(n8);
        g.addNode(n9);
        g.addNode(n10);
        g.addNode(n11);
        g.setRootNode(n1);

        g.connectNode(n1,n2);
        g.connectNode(n1,n4);

        g.connectNode(n2,n3);

        g.connectNode(n3,n4);

        g.connectNode(n4,n5);
        g.connectNode(n4,n6);
        g.connectNode(n4,n7);

        g.connectNode(n6,n8);
        g.connectNode(n6,n7);
        g.connectNode(n6,n9);
        g.connectNode(n6,n11);

        g.connectNode(n7,n9);

        g.connectNode(n9,n10);

        g.connectNode(n10,n11);

        //cetak graf traversalnya
        System.out.println("DFS Traversal of a tree is ---------->");
        g.dfs();

        System.out.println("\nBFS Traversal of a tree is ---------->");
        g.bfs();




    }

}
