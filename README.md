# DATA STRUCTURES AND ALGORITHMS

## TABLE OF CONTENT

1. [ANALYSIS OF ALGORITHM](#analysis-of-algorithm)

- [ORDER OF GROWTH](#order-of-growth)
- [ASYMPTOTIC NOTATION](#asymptotic-notation)

2. [RECURSION](#recursion)

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
> 
> 