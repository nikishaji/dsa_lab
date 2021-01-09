/*Name-Nikhila Elizabeth Shaji
  Roll no-61
  Program-Binary Search Tree*/

import java.io.*;
import java.util.*;
class Node
 {public int data;
  public Node lchild;
  public Node rchild;
  public Node(int d)
       {data=d;}
  public void display()
       {System.out.println(data);}
  public String toString()
       {return data+" ";}
  public String getValue()
       {return " "+data;}
  public Node getRight()
       {return rchild;}
  public Node getLeft()
       {return lchild;}
 }

class DLink
{public Node root;
 public DLink()
      {root=null;}

  public void insert()
      {Scanner sc=new Scanner(System.in);
       System.out.println("Enter the element");
       int d=sc.nextInt();
       Node newnode=new Node(d);
       if(root==null)
         {root=newnode;}
       else
          {Node current=root;
           Node parent;
           while (true)
                 {parent=current;
                  if (d<current.data)
                     {current=current.lchild;
                      if (current==null)
                        {parent.lchild=newnode;
                         return;}
                      }
                   else
                     {current=current.rchild;
                      if(current==null)
                        {parent.rchild=newnode;
                         return;}
                     }
                  }
           } 
        }
  
  public void del()
      {Scanner sc5=new Scanner(System.in);
       System.out.println("Enter the element");
       int key=sc5.nextInt();
       Node temproot=delete(root,key);
       }

  public Node delete(Node temproot,int key)
      {if(temproot==null)
         {System.out.println("BST is empty");
          return temproot;}
       if(key<temproot.data)
          temproot.lchild=delete(temproot.lchild,key);
       else if(key>temproot.data)
          temproot.rchild=delete(temproot.rchild,key);
       else 
          {if(temproot.lchild==null)
              return temproot.rchild;
           else if(temproot.rchild==null)
              return temproot.lchild;
           temproot.data=minValue(temproot.rchild);
           temproot.rchild=delete(temproot.rchild,temproot.data);
          }
        return temproot;
        }

 int minValue(Node temproot)
    {int min=temproot.data;
     while(temproot.lchild!=null)
         {min=temproot.lchild.data;
          root=temproot.lchild;}
     return min;
     }

 public void inorder(Node temproot)
      {if(temproot!=null)
         {inorder(temproot.lchild);
          temproot.display();
          inorder(temproot.rchild);}
      }

 public void preorder(Node temproot)
      {if(temproot!=null)
         {temproot.display();
          preorder(temproot.lchild);
          preorder(temproot.rchild);}
      }
 
 public void postorder(Node temproot)
      {if(temproot!=null)
         {postorder(temproot.lchild);
          postorder(temproot.rchild);
          temproot.display();}
      }


 public void printTree(StringBuilder sb, String padding, String pointer, Node node) 
      {if(node != null) 
         {sb.append(padding);
          sb.append(pointer);
          sb.append(node.getValue());
          sb.append("\n");
          StringBuilder paddingBuilder = new StringBuilder(padding);
          paddingBuilder.append("│  ");
          String paddingForBoth = paddingBuilder.toString();
          String pointerForRight = "└──";
          String pointerForLeft = (node.getRight() != null) ? "├──" : "└──";
          printTree(sb, paddingForBoth, pointerForRight, node.getRight());
          printTree(sb, paddingForBoth, pointerForLeft, node.getLeft());}
      }

 public void dis(DLink tree) 
     {StringBuilder sb = new StringBuilder();
      printTree(sb, "", "", tree.root);
      System.out.println(sb.toString());
      }
}

class Binary
{public static void main(String s[])throws IOException
  {DLink bst=new DLink();
   Scanner sc1=new Scanner(System.in);
   int ch;
   while(true)
       {System.out.println("\n1.Insert\n2.Delete\n3.Display\n4.Preorder\n5.Inorder\n6.Postorder\n7.Exit");
        ch=sc1.nextInt();
        if(ch==1)
          bst.insert();
        else if(ch==2)
          bst.del();
        else if(ch==3)
          bst.dis(bst);
        else if (ch==4)
          {System.out.println("Preorder is:-");
           bst.preorder(bst.root);}
        else if(ch==5)
          {System.out.println("Inorder is:-");
           bst.inorder(bst.root);}
        else if(ch==6)
          {System.out.println("Postorder is:-");
	   bst.postorder(bst.root);}
        else if(ch==7)
            break;
        else
          System.out.println("Invalid choice");
       }
   }
}

/*Output

1.Insert
2.Delete
3.Display
4.Preorder
5.Inorder
6.Postorder
7.Exit
1
Enter the element
7

1.Insert
2.Delete
3.Display
4.Preorder
5.Inorder
6.Postorder
7.Exit
1
Enter the element
8

1.Insert
2.Delete
3.Display
4.Preorder
5.Inorder
6.Postorder
7.Exit
1
Enter the element
3

1.Insert
2.Delete
3.Display
4.Preorder
5.Inorder
6.Postorder
7.Exit
1
Enter the element
5

1.Insert
2.Delete
3.Display
4.Preorder
5.Inorder
6.Postorder
7.Exit
1
Enter the element
3

1.Insert
2.Delete
3.Display
4.Preorder
5.Inorder
6.Postorder
7.Exit
1
Enter the element
-1

1.Insert
2.Delete
3.Display
4.Preorder
5.Inorder
6.Postorder
7.Exit
1
Enter the element
6

1.Insert
2.Delete
3.Display
4.Preorder
5.Inorder
6.Postorder
7.Exit
3
 7
│  └── 8
│  ├── 3
│  │  └── 5
│  │  │  └── 6
│  │  │  ├── 3
│  │  ├── -1


1.Insert
2.Delete
3.Display
4.Preorder
5.Inorder
6.Postorder
7.Exit
4
Preorder is:-
7
3
-1
5
3
6
8

1.Insert
2.Delete
3.Display
4.Preorder
5.Inorder
6.Postorder
7.Exit
5
Inorder is:-
-1
3
3
5
6
7
8

1.Insert
2.Delete
3.Display
4.Preorder
5.Inorder
6.Postorder
7.Exit
6
Postorder is:-
-1
3
6
5
3
8
7

1.Insert
2.Delete
3.Display
4.Preorder
5.Inorder
6.Postorder
7.Exit
2
Enter the element
5

1.Insert
2.Delete
3.Display
4.Preorder
5.Inorder
6.Postorder
7.Exit
3
 7
│  └── 8
│  ├── 3
│  │  └── 6
│  │  │  └── 3
│  │  ├── -1


1.Insert
2.Delete
3.Display
4.Preorder
5.Inorder
6.Postorder
7.Exit
7
*/
 
    
