/*Name:-Nikhila Elizabeth Shaji
  Roll no:-61
  Program:-Circular Queue */

import java.io.*;
import java.util.*;
class Link
{public int data;
 public Link next;
 public Link(int d)
       {data=d;}
 public void display()
       {System.out.println(data);}
}

class DLink
{private Link front;
 private Link rear;
 public DLink()
       {front=rear=null;}
 
 public void insert (int d)
 {Link node= new Link(d);
  if (front==null)
     {front=rear=node;
     }
  else
     {Link current=front;
      while(current!=rear)
           {current=current.next;}
      current.next=node;
      rear=node;
      node.next=front;
      }
  System.out.println("Element is inserted");
  }

 public void dis()
 {Link current=front;
  if(front==null)
     {System.out.println("Queue is Empty");}
  else
     {System.out.println("Queue is:-");
      while (current!=rear)
           {current.display();
            current=current.next;
           }
       current.display();
      }
 }

 public void delete()
 {if(front==rear)
    {front=rear=null;}
  else if (front==null)
     {System.out.println("Deletion not possible since queue is empty");}
  else
     {Link temp=front;
      front=front.next;
      rear.next=front;
      System.out.println("Element is deleted");}
 }
}

class CQueue
{public static void main(String s[]) throws IOException
 {DataInputStream in=new DataInputStream(System.in);
  DLink qu=new DLink();
  String st;
  int ch;
  while(true)
      {System.out.println("\n1.Insert\n2.Delete\n3.Display\n4.Exit\nEnter your choice\t");
       st=in.readLine();
       ch=Integer.parseInt(st);
       if (ch==1)
         {System.out.println("Enter the element:-");
          st=in.readLine();
          ch=Integer.parseInt(st);
          qu.insert(ch);
         }
       else if(ch==2)
         qu.delete();
       else if(ch==3)
         qu.dis();
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
4
Element is added

1.Insert
2.Delete
3.Display
4.Exit
Enter your choice	
1
Enter the element:-
6
Element is added

1.Insert
2.Delete
3.Display
4.Exit
Enter your choice	
3
Queue is:-
4
6

1.Insert
2.Delete
3.Display
4.Exit
Enter your choice	
2
Element is deleted

1.Insert
2.Delete
3.Display
4.Exit
Enter your choice	
3
Queue is:-
6

1.Insert
2.Delete
3.Display
4.Exit
Enter your choice	
2

1.Insert
2.Delete
3.Display
4.Exit
Enter your choice	
3
Queue is Empty

1.Insert
2.Delete
3.Display
4.Exit
Enter your choice	
4
*/
 

 
 
