/*Register no:-20218063
  Question 1
*/
import java.io.*;
import java.util.*;
class Link{
 public int data;
 public Link next;
 public Link(int d)
       {data=d;
        next=null;
       }
 public void display()
       {System.out.print(data);
       }
}

class Queue{
 private Link front;
 private Link rear;
 public Queue()
       {front=null;
        rear=null;
       }

 public boolean isEmpty()
       {if(front==null)
          return true;
        else
          return false;
       }

 public void inlast(int d)
       {Link newLink=new Link(d);
	if(isEmpty())
          {front=newLink;
	   rear=newLink;
	  }
	else
          {rear.next=newLink;
	   rear=newLink;
	  }
	}

 public int delfirst()
       {if(isEmpty())
          {System.out.println("Deletion not possible since queue is empty");
          return 0;}
	else
          {int temp=front.data;
           if(front.next==null)
             {rear=null;}
           front=front.next;
           return temp;
          }
        }
 
 public int counter()
       {int count=1;
        Link current=front;
        while (current.next!=null)
             {count++;
              current=current.next;
             }
        return count;
        }

 public void dis()
       {System.out.print("Reverse Binary Bit=");
        Link current=front;
        while (current!=null)
             {current.display();
              current=current.next;
             }
        
        }
}

class Convert{
 Queue q=new Queue(); public void insert(int x) 
       {int a;
        String b="";
        if (x==0)
          {a=0;
           q.inlast(a);
           b=a+b;}
        else
          {while(x>0)
              {a=x%2;
               q.inlast(a);
               b=a+b;
               x=x/2;
              }
           }
        System.out.println("Binary of X="+b);
        q.dis();
        System.out.println("");
        }

 public int delete()
       {int c=q.counter()-1;
        int y=0;
        while(c>=0)
             {int b=q.delfirst();
              y+=b*Math.pow(2, c);  
              c--;  
             }    
        return y;  
       }  

}

class ReverseBit{
 public static void main(String s[])throws Exception
       {DataInputStream in=new DataInputStream(System.in);
        Convert obj= new Convert();
        String s1;
        int x;
        System.out.print("Enter a non-negative number X:\t");
        s1=in.readLine();
        x=Integer.parseInt(s1);
        obj.insert(x);
        int y=obj.delete();
        
        System.out.println("The reversed no is "+y);
        }
}


