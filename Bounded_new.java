package Generics;

public class Bounded_new {
     public static void main(String[] args) {
        PrintData("hello");
        PrintData(1230);

        GenericMethod obj = new GenericMethod();
        obj.doubleData("112");
        obj.doubleData(123);

         CustomClass custom = new CustomClass();
         obj.doubleData(custom);
    }
    static<E> void PrintData(E data){
        System.out.println(data);

    }
    <E> void doubleData(E data){
//        data = 2*data;
        System.out.println(data);
    }
}

class CustomClass{

}
