/*Name:-Nikhila Elizabeth Shaji
  Roll no:-61
  Program:-Deque*/

import java.util.*;
import java.io.*;
class Link
{public int data;
 public Link next;
 public Link prev;
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
 
 public boolean IsEmpty()
      {return(front==null||rear==null);}
 
 public void infront(int d)
      {Link newnode=new Link(d);
       if(IsEmpty())
          front=rear=newnode;
       else
         {newnode.next=front;
          front.prev=newnode;
          front=newnode;}
       System.out.println("Element is inserted");
      }
  
 public void delfront()
   {if(IsEmpty())
       System.out.println("Queue is empty");
    else
       {front=front.next;        
        System.out.println("Element is deleted");}
   }

 public void inrear(int d)
      {Link newnode=new Link(d);
       if(IsEmpty())
         front=rear=newnode;
       else
        {rear.next=newnode;
         newnode.prev=rear;
         rear=newnode;}
       System.out.println("Element is inserted");
       }
    
 public void delrear()
   {if(IsEmpty())
      System.out.println("Queue is empty");
    else
     {rear=rear.prev;
      System.out.println("Element is deleted");}
    }

 public void dis()
    {Link current=front;
     if(IsEmpty())
        System.out.println("Queue is empty");
     else
        {System.out.println("Queue is:-");
         while(current!=null)
             {current.display();
              current=current.next;}
        }
     }
}

class Deque
{public static void main(String args[]) throws IOException
       {DLink dque=new DLink();
	DataInputStream in=new DataInputStream(System.in);
        String st;
        int ch;
        while(true)
             {System.out.println("\n1.InsertFront\n2.DeleteFront\n3.InsertRear\n4.DeleteRear\n5.Display\n6.Exit\nEnter your choice\t");
              st=in.readLine();
              ch=Integer.parseInt(st);
              if (ch==1)
                 {System.out.println("Enter the element:-");
                  st=in.readLine();
                  ch=Integer.parseInt(st);
                  dque.infront(ch);}   
               else if(ch==2)
                  dque.delfront();
               else if(ch==3)
                  {System.out.println("Enter the element:-");
                  st=in.readLine();
                  ch=Integer.parseInt(st);
                  dque.inrear(ch);}
               else if(ch==4)
                  dque.delrear();
               else if(ch==5)
                  dque.dis();
               else if(ch==6)
                  break;
               else 
                  System.out.println("Invalid choice"); 
               }
          }
}
 
/*Output

1.InsertFront
2.DeleteFront
3.InsertRear
4.DeleteRear
5.Display
6.Exit
Enter your choice	
1
Enter the element:-
5
Element is inserted

1.InsertFront
2.DeleteFront
3.InsertRear
4.DeleteRear
5.Display
6.Exit
Enter your choice	
1
Enter the element:-
4
Element is inserted

1.InsertFront
2.DeleteFront
3.InsertRear
4.DeleteRear
5.Display
6.Exit
Enter your choice	
5
Queue is:-
4
5

1.InsertFront
2.DeleteFront
3.InsertRear
4.DeleteRear
5.Display
6.Exit
Enter your choice	
3
Enter the element:-
7
Element is inserted

1.InsertFront
2.DeleteFront
3.InsertRear
4.DeleteRear
5.Display
6.Exit
Enter your choice	
5
Queue is:-
4
5
7

1.InsertFront
2.DeleteFront
3.InsertRear
4.DeleteRear
5.Display
6.Exit
Enter your choice	
2
Element is deleted

1.InsertFront
2.DeleteFront
3.InsertRear
4.DeleteRear
5.Display
6.Exit
Enter your choice	
5
Queue is:-
5
7

1.InsertFront
2.DeleteFront
3.InsertRear
4.DeleteRear
5.Display
6.Exit
Enter your choice	
4
Element is deleted

1.InsertFront
2.DeleteFront
3.InsertRear
4.DeleteRear
5.Display
6.Exit
Enter your choice	
5
Queue is:-
5
7

1.InsertFront
2.DeleteFront
3.InsertRear
4.DeleteRear
5.Display
6.Exit
Enter your choice	
2
Element is deleted

1.InsertFront
2.DeleteFront
3.InsertRear
4.DeleteRear
5.Display
6.Exit
Enter your choice	
5
Queue is empty

1.InsertFront
2.DeleteFront
3.InsertRear
4.DeleteRear
5.Display
6.Exit
Enter your choice	
6*/
   
