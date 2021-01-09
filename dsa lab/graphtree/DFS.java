/*Name-Nikhila Elizabeth Shaji
  Roll no-61
  Program-Depth first search*/

import java.io.*;
import java.util.*;
class Stack
{private int[] s1;
 private int top;
 public Stack()
      {s1=new int[20];
       top=-1;}
 public boolean isEmpty()
      {return(top==-1);}
 public void push(int j)
      {s1[++top]=j;}
 public int pop()
      {return s1[top--];}
 public int peek()
      {return s1[top];}
}

class Vertex
{public char label;
 public boolean visited;
 public Vertex(char l)
      {label=l;
       visited=false;}
}

class Graph
{private Vertex Vlist[];
 private int Adjmat[][];
 private int num=0;
 private Stack st=new Stack();
 public Graph(int no)
      {Vlist=new Vertex[no];
       Adjmat=new int[no][no];
       for(int i=0;i<no;i++)
          {for(int j=0;j<no;j++)
              {Adjmat[i][j]=0;}
           }
       }

 public void AddVer(char l)
      {Vlist[num++]=new Vertex(l);}

 public void AddEdge(char sl, char el)
      {int start=0;
       int end=0;
       for(int i=0;i<num;i++)
          {if(Vlist[i].label==sl)
             start=i;
           if(Vlist[i].label==el)
             end=i;}
       Adjmat[start][end]=1;
       Adjmat[end][start]=1;
       }

 public void disVertex(int v)
       {System.out.print(Vlist[v].label);}
 
 public int AdjVer(int v)
      {for(int i=0;i<num;i++)
          {if(Adjmat[v][i]==1 && Vlist[i].visited==false)
             {return i;}
          }
       return -1;
       }
 
 public void dfs()
      {Vlist[0].visited=true;
       disVertex(0);
       st.push(0);
       while(!st.isEmpty())
            {int v=AdjVer(st.peek());
             if(v==-1)
               st.pop();
             else
               {Vlist[v].visited=true;
                disVertex(v);
                st.push(v);
               }
             }
       for(int i=0;i<num;i++)
          {Vlist[i].visited=false;}
      }
}

class DFS
{public static void main(String s[]) throws IOException
 {DataInputStream in=new DataInputStream(System.in);
  String s1;
  char c1,c2;
  int no;
  System.out.print("Enter the no of vertices:");
  s1=in.readLine();
  no=Integer.parseInt(s1);
  Graph g= new Graph(no);
  for(int i=0;i<no;i++)
     {System.out.print("Enter the vertices:");
      s1=in.readLine();
      c1=s1.charAt(0);
      g.AddVer(c1);
     }
  System.out.print("Enter the no of edges:");
  s1=in.readLine();
  no=Integer.parseInt(s1);
  for(int i=0;i<no;i++)
     {System.out.print("Enter the starting vertex of the edge:");
      s1=in.readLine();
      c1=s1.charAt(0);
      System.out.print("Enter the ending vertex of the edge:");
      s1=in.readLine();
      c2=s1.charAt(0);
      g.AddEdge(c1,c2);
     }
 System.out.print("Visits(DFS):");
 g.dfs();
 }
}

/*Output
Enter the no of vertices:6
Enter the vertices:A
Enter the vertices:B
Enter the vertices:C
Enter the vertices:D
Enter the vertices:E
Enter the vertices:F
Enter the no of edges:6
Enter the starting vertex of the edge:A
Enter the ending vertex of the edge:B
Enter the starting vertex of the edge:A
Enter the ending vertex of the edge:C
Enter the starting vertex of the edge:A
Enter the ending vertex of the edge:D
Enter the starting vertex of the edge:B
Enter the ending vertex of the edge:E
Enter the starting vertex of the edge:B
Enter the ending vertex of the edge:F
Enter the starting vertex of the edge:C
Enter the ending vertex of the edge:F
Visits(DFS):ABEFCD*/


