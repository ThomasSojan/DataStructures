# Functional Programing
## Lambda Functions
Lambda expressions are essentially shorter way to write functions.<br>
For Ex: In Java
```
(x,y)->x*y

```
Lambda expressions are primarily used in the below common higher order functions (HOF).<br>

* **Foreach** – a HOF which invokes a callback for every value in the collection and also passes the currently iterated value to the callback

* **Map** – a HOF which invokes the callback for every value in the collection and also passes the currently iterated value to the callback. However, it also returns the modified value and stores it in a new collection of same size.

* **Filter** - a HOF which invokes the callback for every value in the collection and also passes the currently iterated value to the callback. However, it also returns the modified value and stores it in a new collection of different size.

Examples of Functional Programming in Java are given below.


```
public class FunctionalExamples{
    public static void main(String[] args){
        List<Integer> numList=Arrays.asList(10,20,30,40,50);
        System.out.println("===forEach===");
        numList.stream().forEach(num->System.out.println(num));
        System.out.println("===forEach alternative===");
        numList.stream().forEach(System.out::println);
        System.out.println("==map===");
        List<Integer> newList=numList.stream().map(n->n*2).collect(Collectors.toList());
        System.out.println(newList);
        System.out.println("==filter===");
        List<Integer>filteredList=numList.stream().filter(n->n>30).collect(Collectors.toList());
        System.out.println(filteredList);
        System.out.println("==Chaining===");
        List<Integer>chainedList=numList.stream().map(n->n*2).filter(n->n>30).collect(Collectors.toList());
        System.out.println(chainedList);
    }
}


```



