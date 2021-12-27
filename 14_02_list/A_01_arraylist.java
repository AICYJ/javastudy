import java.util.*;
public class A_01_arraylist {
    public static void main(String[] args) {
                ArrayList list1 = new ArrayList(10);
                list1.add("A");
                list1.add("C");
                list1.add("R");
                list1.add("D");
                System.out.print("initial list value: ");
                System.out.println(list1);
                
                System.out.print("Add B at index 1 position: ");
                list1.add(1,"B");
                System.out.println(list1);
                
                System.out.println("Delete the value at index 2");
                list1.remove(2);
                System.out.println(list1);
                
                System.out.println("Returns the value of index 2:"+list1.get(2));
                    
            }
        
        }
        