# DATA STRUCTURES AND ALGORITHMS

## TABLE OF CONTENT

1. [ANALYSIS OF ALGORITHM](#analysis-of-algorithm)

- [ORDER OF GROWTH](#order-of-growth)
- [ASYMPTOTIC NOTATION](#asymptotic-notation)

2. [RECURSION](#recursion)
3. [BINARY SEARCH](#binary-search)
4. [SORTING](#sorting)
- [BUBBLE SORT](#bubble-sort)
- [INSERTION SORT](#insertion-sort)

## ANALYSIS OF ALGORITHM

### ORDER OF GROWTH

> A function `f(n)` is said to be growing faster than a function `g(n)` if:
> ```
> lim (n -> ∞) [f(n) / g(n)] = 0
> OR
> lim (n -> ∞) [g(n) / f(n)] = 0
> where f(n), g(n) > 0
> ```
> Consider an algorithm `f(n) = 3n + 12` and g(n) = 2n<sup>2 + n</sup> + 5,
> then you have to divide everything with the polynomial with the highest degree
> i.e n<sup>2</sup> in this case
>
> Apply limit `n -> ∞`.

> **CHEAT CODE FOR ORDER OF GROWTH**
> 1. Ignore all the lower order terms
> 2. Ignore all the leading constant

> **WHAT ARE THE LOWER ORDER TEMRS?**
> C < loglog(n) < log(n) < n<sup>1/3</sup> < n<sup>1/2</sup>... < n < n<sup>2</sup> < n<sup>3</sup>
> ... n<sup>n</sup>

### ASYMPTOTIC NOTATION

> There are 3 types of asymptotic notations:
> 1. **Big O**: Represents an exact bound or upper bound - _worst case_
> 2. **Theta**: Represents the exact bound - _Average case_
> 3. **Omega**: Represents exact bound or lower bound - _best case_

> _Time complexity_: How much time a particular algorithm is going to take.
>
> _Space complexity_: How much space(memory) a program is going to utilize for it execution
>
> _Auxiliary Space_: is the extra space or temporary space used by an algorithm

## RECURSION

> If a function is calling itself, then it is called a Recursive function.
> In recursion, there should always be a _**base condition**_ that will terminate the
> recursive calls.
> 
> Recursive functions are traced in the form of a tree with two phase
> 1. calling phase
> 2. returning phase

 **PRINCIPLE OF MATHEMATICAL INDUCTION(PMI) FOR RECURSION**
> F(n) is true for all n iff
> - _Base Condition_: Prove F(0) or F(1) is true.
> - _Induction Hypothesis_: Assume that F(K) is true
> - _Induction_: Using F(K) prove that F(K+1) is true

## BINARY SEARCH

> This is a searching technique. There are two different searching techniques, namely,
> 1. Linear search
> 2. Binary search
> 
> Binary search follows `Divide and Conquer` strategy, where if the problem is large you break them into smaller subproblems.
> Binary search works on a sorted list.
> 
> To perform binary search, we need two index pointers
> 1. low(starting) point
> 2. high(ending) point
> 3. key i.e value to search for
> 4. `midpoint = (low+high) / 2`
>
> **Algorithm**
> 1. Check arr[mid] == value ---> if yes, then return else
> 2. check if arr[mid] < value --> if yes, then the value if on the R.H.S,else
> 3. value is on the L.H.S
> 
> Recalculate mid and repeat the process.
> 
> **Recursive Binary Search Algorithm**
> 1. parameters(low,high,key)
> 2. if low == high then it's a single element
> - Check if A[low] == key then return low
> - else return 0
> 3. else calculate mid and
> - check if key == A[mid] and return mid;
> - if key < A[mid] return BinarySearch(low,mid-1,key)
> - else return BinarySearch(mid+1,high,key)

## SORTING

### BUBBLE SORT

> The concept of bubble sort is to compare a pair of elements ever time and if the 
> first element is greater than the 2nd, it will interchange.
> 
> For bubble sort, the goals is to get the heaviest elements to the bottom and the lightest upwards.
> For some n elements, if you perform k passes you will get k largest element
> 
> In each pass(iteration), the heaviest element is sorted and moved to the bottom.
> - The number of passes = n -1
> - Number of comparation = n<sup>2</sup>
> - Number of swaps = n<sup>2</sup>
> 
> Time complexity : O(n<sup>2</sup>)
> 
> _**Algo**_:
> - A flag variable set to 0
> - initiate 2 for loops, an outer loop (n - 1) and an inner loop(n-1-i)
> - check if A[i] > A[j + 1] --> then swap(A[i],A[j+1])
> - set flag = 1
> - out of the inner loop, if flag = 0, then break

### INSERTION SORT

> For a sorted array, you want to insert an element at a sorted position.
> 
> Algo:
> - init a for loop for innner and outer
> - inner loop starts from index = 1, assuming the first is sorted
> - store the current value of i into a temp variable
> - while j >= 0 and arr[j] >temp
> - set arr[j+1] = arr[j]
> - set j = j - 1;
> - out of the while loop arr[j + 1] = temp



