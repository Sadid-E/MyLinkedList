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
      add.setPrev(end);
      end = add;
    }
   size++;
  return true;
 }

 private Node getNode(int index) {
   Node current = start;
   for (int i = 0; i < index; i++) {
     current = current.getNext();
   }
   return current;
 }

 public void add(int index, String value) {
   if (index > size || index < 0) {
     throw new IndexOutOfBoundsException();
   }
   Node add = new Node(value);
   Node before = getNode(index-1);
   Node current = getNode(index);
   if (size == 0) {
     add(value);
   } else {
      if (index == 0) {
        start = add;
        add.setNext(current);
        current.setPrev(add);
      } else
      if (index == size) {
        end = add;
        add.setPrev(before);
        before.setNext(add);
      } else {
        before.setNext(add);
        add.setPrev(before);
        add.setNext(current);
        current.setPrev(add);
      }
      size++;
    }
 }

 public String get(int index) {
   if (index >= size || index < 0) {
     throw new IndexOutOfBoundsException();
   }
   return getNode(index).getData();
 }

 public String set(int index, String value) {
   if (index >= size || index < 0) {
     throw new IndexOutOfBoundsException();
   }
   String original = getNode(index).getData();
   getNode(index).setData(value);
   return original;
 }

 public String toString() {
   if (size == 0) {
     return "[]";
   }
   String str = "[";
   for (int i = 0; i < size - 1; i++) {
     str += getNode(i).getData() + ", ";
   }
   return str + getNode(size-1).getData() + "]";
 }

public String toStringReversed() {
  if (size == 0) {
    return "[]";
  }
  String str = "[";
  for (int i = size - 1; i > 0; i--) {
    str += getNode(i).getData() + ", ";
  }
  return str + getNode(0).getData() + "]";
}

public String remove(int index) {
  String original = getNode(index).getData();
  if (index >= size || index < 0) {
    throw new IndexOutOfBoundsException();
  } else
  if (size == 1) {
    start.setNext(null);
    end.setPrev(null);
  } else
  if (index == 0) {
    start = start.getNext();
  } else
  if (index == size - 1) {
    end = end.getPrev();
  } else {
    getNode(index-1).setNext(getNode(index+1));
    getNode(index+1).setPrev(getNode(index-1));
  }
  size--;
  return original;
}

}
