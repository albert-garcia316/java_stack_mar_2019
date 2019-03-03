import java.util.ArrayList;


public class ExceptionsTest {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        for(int i = 0; i < myList.size(); i++) {
            try{
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("******* There were no errors in casting Integer to the object *******");
            } catch (Exception e)  {
                System.out.println("There was an error in casting the value of the object as an integer");
                System.out.println("this happened at index: " + i);
                System.out.println("the value of the object is: " + myList.get(i));
                System.out.println("the class of the object is: " + myList.get(i).getClass());
            }
        }
    }
    
}