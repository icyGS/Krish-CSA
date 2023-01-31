---
toc: true
layout: post
description: Collegeboard MC
comments: false
categories: [college board]
title: 66 Question Multiple Choice Practice
---
![]({{ site.baseurl }}/images/52QMC.png "MC results")

# What I learned
- Overall got a 44/56 on the mc
- Topics I got wrong:
  - 2.A: Apply the meaning of specific operators.
  - 2.B: Determine the result or output based on statement execution order in a code segment without method calls (other than output).
  - 2.C: Determine the result or output based on the statement execution order in a code segment containing method calls.
  - 5.A: Describe the behavior of a given segment of program code.
  - 
- Overall, it seems that all of the questions that I missed had to do with trouble shooting code and spotting errors
- In the future, I should work on getting better at spotting errors in code and seeing what is causing a specific error

**Q2:** 
Assume that mat has been declared as a 4×4
 array of integers and has been initialized to contain all 1s. Consider the following code segment.
```
int n = mat.length;
for (int j = 1; j < n; j++)
{
    for (int k = 1; k < n; k++)
    {
        mat[j][k] = mat[j - 1][k] + mat[j][k - 1];
    }
}
What is the value of mat[2][2] after the code segment has completed execution?
```
- Notes: I said that the answer was 4 but it was actually 6
- I should've wrote out all of the outputs on paper 
- I was unsure on the answer and moved on because of time

**Q6:**
![]({{ site.baseurl }}/images/q6.png "MC results")
- Because the algorithm uses a for-each loop to traverse the rows, the row index is not being stored.
- I chose that "The row index of an element with the largest value in the two-dimensional array" 
- Answer was "The column index of an element with the largest value in the two-dimensional array"

**Q7:**
Consider the following method.
```
/** Precondition: Strings one and two have the same length. */
public static String combine(String one, String two)
{
String res = "";
for (int k = 0; k < one.length(); k++)
{
if (one.substring(k, k + 1).equals(two.substring(k, k + 1)))
{
res += one.substring(k, k + 1);
}
else
{
res += "0";
}
}
return res;
}
```
What is returned as a result of the call combine("10110", "01100") ?

- I said that the answer was "00000" 
- The answer was "00100"
- What I said would be the result for the method call combine("00000", "11111"), for example.

**Q29:**
Consider the code segment below.
int a = 1988;
int b = 1990;
String claim = " that the world’s athletes " +
"competed in Olympic Games in ";
String s = "It is " + true + claim + a +
" but " + false + claim + b + ".";
System.out.println(s);
What, if anything, is printed when the code segment is executed?

- I sad that the answer was "It is trueclaima but falseclaimb."
- The answer was "It is true that the world’s athletes competed in Olympic Games in 1988 but false that the world’s athletes competed in Olympic Games in 1990."
- I missed the fact that the values were from the concatenation and not the variables themselves