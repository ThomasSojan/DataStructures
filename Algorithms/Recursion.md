# Recursion

Recursion is basically what happens **when a function calls itself multiple times to solve a given problem**.

```
 function greeting(n) {
    console.log("Hello world ", n)
    greeting(n - 1)
}
greeting(10);

 ```
 
 In the above code, the greeting function calls itself multiple times but the base condition is not defined and hence, this leads to an infinite loop.
 
 ```
 function greeting(n){
    if(n==0){
        return;
    }
    console.log("Hello world ",n)
    greeting(n-1)
    
}
greeting(10);


 ```
 
 In the above code, when n becomes 0, the recursive call stops.
 
 The below code calculates the sum of first n numbers.
 
 ```
 function sum(n){
    if(n==1){
        return 1
    }
    else{
        return n+sum(n-1);
    }
}
var d=sum(5);
console.log(d);

 ```
 **Every recursion can be replaced with an equivalent iterational statement**.
 **Recursive algorithms are usually slower than iterative algorithms**. For example, you saw an example which calculates the sum of first n numbers:
