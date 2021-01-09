/*Name-Nikhila Elizabeth Shaji
  Roll no-61
  Program-Priority Queue
*/
import java.io.*;
import java.util.*;
class Link
 {int data;
  int pri;
  Link next;
  Link(int d,int p)
      {data=d;
       pri=p;}
 }

class DLink
{Link first=null;
 public void insert(int d, int p)
 {Link node=new Link(d,p);
  if(first==null)
    {first=node;}
  else if(first.pri>node.pri)
    {node.next=first;
     first=node;}
  else
     {Link current=first;
      while(current.next!=null && current.next.pri<=node.pri)
           {current=current.next;}
      node.next=current.next;
      current.next=node;
     }
   System.out.println("Element is inserted");
  }
  
 public void dis()
 {Link current=first;
  if(first==null)
    System.out.println("Queue is empty");
  else
    {System.out.println("Data\tPriority");
     while(current!=null)
          {System.out.println(current.data+"\t"+current.pri);
           current=current.next;
          }
    }
 }

 public void delete(int d)
 {int flag=1; 
  Link current=first;
  Link prev=current;
  if(first==null)
    System.out.println("Deletion not possible since queue is empty");
  else
   {if(current.data==d)
      {first=current.next;
       flag=0;}
    else
      {while(current!=null)
            {if(current.data==d)
               {flag=0;
                prev.next=current.next;
                break;}
              prev=current;
              current=current.next;
            }
       }
    if(flag==1)
       System.out.println("Element not found");
    else
       System.out.println("Element is deleted");
    }
 } 

}

class PQueue
{public static void main(String s[])throws Exception
      {DataInputStream in=new DataInputStream(System.in);
       DLink pque=new DLink();
       String st;
       int ch,d,p;
       while(true)
           {System.out.println("\n1.Insert\n2.Delete\n3.Display\n4.Exit\nEnter your choice\t");
            st=in.readLine();
            ch=Integer.parseInt(st);
            if (ch==1)
               {System.out.println("Enter the element:-");
                st=in.readLine();
                d=Integer.parseInt(st);
                System.out.println("Enter the priority:-");
                st=in.readLine();
                p=Integer.parseInt(st);
                pque.insert(d,p);}
            else if(ch==2)
                {System.out.println("Enter the element:-");
                 st=in.readLine();
                 d=Integer.parseInt(st);
                 pque.delete(d);}
            else if(ch==3)
                pque.dis();
            else if(ch==4)
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
4.Exit
Enter your choice	
1
Enter the element:-
1
Enter the priority:-
1
Elemnt is inserted

1.Insert
2.Delete
3.Display
4.Exit
Enter your choice	
1
Enter the element:-
4
Enter the priority:-
2
Elemnt is inserted

1.Insert
2.Delete
3.Display
4.Exit
Enter your choice	
1
Enter the element:-
6
Enter the priority:-
3
Elemnt is inserted

1.Insert
2.Delete
3.Display
4.Exit
Enter your choice	
3
Data	Priority
1	1
4	2
6	3

1.Insert
2.Delete
3.Display
4.Exit
Enter your choice	
2
Enter the element:-
4
Element is deleted

1.Insert
2.Delete
3.Display
4.Exit
Enter your choice	
3
Data	Priority
1	1
6	3

1.Insert
2.Delete
3.Display
4.Exit
Enter your choice	
2
Enter the element:-
5
Element not found

1.Insert
2.Delete
3.Display
4.Exit
Enter your choice	
4
*/
