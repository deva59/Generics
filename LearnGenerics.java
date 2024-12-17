package Generics;

public class LearnGenerics {
    public static void main(String[] args) {
        Dog<String,String> d1 = new Dog<>("sdfsf546", "Deva");
        Dog<String, Integer> d2 = new Dog<>("czvwef2134",12);

        Dog<Integer, String> d3 = new Dog<>(12,"Leo");

        System.out.println(d3.getId());



    }
}

class Dog<E,V>{
    E id;

    V name;

    public Dog(E id,V name){
        this.id=id;
        this.name=name;

    }

    E getId(){
        return id;
    }
}
