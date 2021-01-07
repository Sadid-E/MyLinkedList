import java.util.*;

public class MyLinkedList{

 private int size;
 private Node start,end;

 public MyLinkedList(){
   size = 0;
 }

 public int size() {
   return size;
 }

 public boolean add(String value) {
   Node add = new Node(value);
   if (size == 0) {
     start = add;
     end = add;
   } else {
      end.setNext(add);
      end = add;
      size++;
    }
  return true;
 }

 // public void add(int index, String value);
 //
 // public String get(int index);
 //
 // public String set(int index, String value);
 //
 // public String toString();

}
