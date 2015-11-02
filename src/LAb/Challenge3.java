package LAb;

import common.Dog;
import common.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Scott
 */

public class Challenge3 {
    public static void main(String[] args) {
        
        Employee e1 = new Employee("Marks", "Matt", "111-11-1111");
        Employee e2 = new Employee("Jones", "John", "222-22-2222");
        Employee e3 = new Employee("Peterson", "Amy", "333-33-3333");
        
        Dog d1 = new Dog("Bell", 3333);
        Dog d2 = new Dog("Midnight", 4444);
        
        List listOfObject = new ArrayList();
        
        listOfObject.add(e1);
        listOfObject.add(e2);
        listOfObject.add(e3);
        listOfObject.add(d1);
        listOfObject.add(d2);
        
        
//        for (Object listOfThing : listOfThings) {
//            System.out.println(listOfThing.toString());
//        }
        
       for(int i = 0; i<listOfObject.size(); i++){
          Object obj = listOfObject.get(i);
          if(obj instanceof Employee){
              Employee e = (Employee)obj;
              System.out.println(e);
          }else if (obj instanceof Dog){
              Dog d = (Dog)obj;
              System.out.println(d);
          }
          }
       }
}