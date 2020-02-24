package day35;
//2 attributes
//int fruits
//string color

//create constructor (with 2 parameters)

//create constructor (with 1 parameters)
//call main calls and print out the results
public class Cake {
    String fruits;
    String colors;
    public Cake(String fruit,String color){
        fruits = fruit;
        colors = color;
    }

    public static void main(String[] args) {
        Cake cake = new Cake("Strawberry","Pink");
        System.out.println(cake.colors + " " + cake.fruits );
    }

}
