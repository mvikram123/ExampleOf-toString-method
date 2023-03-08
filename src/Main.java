//Java toString() Method
//        If you want to represent any object as a string, toString() method comes into existence.
//
//        The toString() method returns the String representation of the object.
//
//        If you print any object, Java compiler internally invokes the toString() method on the object. So overriding the toString() method, returns the desired output, it can be the state of an object etc. depending on your implementation.
//
//        Advantage of Java toString() method
//        By overriding the toString() method of the Object class, we can return values of the object, so we don't need to write much code.



//example

//class Student {
//    String name;
//    int rollNo;
//    String city;
//
//    public Student(String name, int rollNo, String city) {
//        this.name = name;
//        this.rollNo = rollNo;
//        this.city = city;
//    }
//}
//public class Main{
//    public static void main(String args[])
//    {
//        Student s1=new Student("arrav",101,"pune");
//        Student s2=new Student("Paro",102,"noida");
//        System.out.println(s1);              //print hashcode value of   object s1
//        System.out.println(s2);             //print hashcode value of   object s2
//    }
//
//
//}




//    As you can see in the above example, printing s1 and s2 prints the hashcode values of the objects but I want to print the values of these objects.
//    Since Java compiler internally calls toString() method, overriding this method will return the specified values. Let's understand it with the example given below:

 class Student {
     String name;
     int rollNo;
     String city;

     public Student(String name, int rollNo, String city) {
         this.name = name;
         this.rollNo = rollNo;
         this.city = city;
     }

     public String toString() {           //overriding the toString() method
         return rollNo + " " + name + " " + city;
     }

     public class Main {
         public static void main(String args[]) {
             Student s1 = new Student("arrav", 101, "pune");
             Student s2 = new Student("Paro", 102, "noida");
             System.out.println(s1);             //compiler writes here s1.toString()
             System.out.println(s2);            //compiler writes here s2.toString()
         }


     }
 }
// Output:
//
//         101 arrav pune
//         102 paro noida
//         In the above program, Java compiler internally calls toString() method, overriding this method will return the specified values of s1 and s2 objects of Student class.