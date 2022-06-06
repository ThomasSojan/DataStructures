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
 **Every recursion can be replaced with an equivalent iterational statement**.<br>
 **Recursive algorithms are usually slower than iterative algorithms**. For example, you saw an example which calculates the sum of first n numbers:
 
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
 Here, the sum of first 5 numbers is checked. If you want the sum of first 500000 numbers, the recursive code will crash.
 Interestingly, the below iterative algorithm to calculate the sum of n numbers has the same complexity, O(n).
 ```
 function sum(n){
    var sum=0;
    while(n!=0){
        sum+=n;
        n--;
    }
    return sum;
}
var r=sum(500000);
console.log(r);

 ```
 
 Note: The below equivalent code has a time complexity of O(1).
 
 ```
 function sum(n){
    return n*(n+1)/2;
}

 ```
 

 *  It makes the code look simple, neat and intuitive

 *  Some algorithms are too tough in an iterative way - for example, creating or traversing a tree data structure.

