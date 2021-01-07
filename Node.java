public class Node{

 public Node(String value){
   data = value;
 }

 private String data;
 private Node next,prev;

 public String getData() {
   return data;
 }

 public Node getNext() {
   return next;
 }

 public Node getPrev() {
   return prev;
 }

 public void setData(String set) {
   data = set;
 }

 public void setNext(Node set) {
   next = set;
 }

 public void getPrev(Node set) {
   prev = set;
 }

}
