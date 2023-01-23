---
toc: true
layout: post
description: Collegeboard MC
comments: false
categories: [college board]
title: 66 Question Multiple Choice Practice
---
![]({{ site.baseurl }}/images/66QMC.png "MC results")

# What I learned
- Overall got a 53/66 on the mc
- Topics I got wrong:
  - 4.A: Use test-cases to find errors or validate results.
  - 4.B: Identify errors in program code.
  - 4.C: Determine if two or more code segments yield equivalent results.
- Overall, it seems that all of the questions that I missed had to do with trouble shooting code and spotting errors
- In the future, I should work on getting better at spotting errors in code and seeing what is causing a specific error

# Questions 

**Q12:** Assume that x and y have been declared and initialized with int values. Consider the following Java expression
`(y > 1000)||(x > 1000 && x < 1500>)`
Which of the following is equivalent to the expression given above?

- I chose `(y > 10000 | | x > 1000) | | (y > 10000 | | x < 1500)` but the answer was `(y > 10000 | | x > 1000) && (y > 10000 | | x < 1500)`
- Notes: 
  - I approached this problem by trying to plug in values for x and y, but it seems that I messed up somewhere
  - Looking back, the answer was obvious as an or statement between the two expressions doesn't quite work out

**Q13:** Assume that x and y are boolean variables and have been properly initialized.
`(x || y) && x`
Which of the following always evaluates to the same value as the expression above?

- I chose `x && y` but the answer was `x` 
- Notes: 
  - If x or y and x, the answer will always depends on x, meaning that the output should just be x
  - Once again, simple mistake 

**Q15:** Consider the following method, which is intended to return true if at least one of the three strings s1, s2, or s3 contains the substring "art". Otherwise, the method should return false.
```
public static boolean containsArt{
    String all = s1 + s2 + s3;
    return (all.indexOf("art") != 1)
}
```

- I said the answer was `containsArt ("matriculate", "carat", "arbitrary")` but the answer was `containsArt ("rattrap", "similar", "today")`
- Notes:
- I completely guessed on this question because at the time, I didn't see where a potential flaw in the program was
- Now that I'm looking back at the question, I see that adding up all of the strings makes anything that was seperate in the 3 strings together, meaning that if art was formed when strings were added together, that is an issue, which it seems to be in the correct answer!

**Q16:** Consider the following method, which is intended to return the number of columns in the two-dimensional array arr for which the sum of the elements in the column is greater than the parameter val.

public int countCols(int[][] arr, int val){
    int count = 0;
    for (int col = 0; col < arr[0].length; col++) // Line 5
    {
        int sum = 0;
        for (int[] row : col) // Line 8
        {
            sum += row[col]; // Line 10
        }
        if (sum > val)
        {
            count++;
        }
    }
    return count;
}
The countCols method does not work as intended. Which of the following changes should be made so the method works as intended?

- I said that Line  10 should be changed to sum += arr[row][col]; but in reality, the answer was Line  8 should be changed to for (int[] row : arr)
- Notes:
  - There was no issue in line 10 if we initially just the for loop and make it into a special for loop!

**Q22:** Consider the following method, count, which is intended to traverse all the elements in the two-dimensional (2D) String array things and return the total number of elements that contain at least one "a".
![]({{ site.baseurl }}/images/q22.png " ")

- Notes:
-  The count doesnt include the last element in the array so if there is an a at the end, it will not function properly

**Q29:** For which of the following values of num does the code segment not work as intended?
![]({{ site.baseurl }}/images/q29.png " ")

- Since the array only goes to the 2nd to last term, it will not get the last term,
- 8 is the answer, not 7 as 7 is literally the first value 
- Notes: 
  - Make sure to look out for the first and last terms of an array when doing error problems 
  - Common theme that the error is in the first or last entry in the array

**Q35:**
![]({{ site.baseurl }}/images/q35.png " ")
- D produces the same things because it has the same indexes but just goes backwards
- Notes:
  - B is definitely wrong because it literally starts and ends at different indexes 

**Q38:**
![]({{ site.baseurl }}/images/q38.png " ")
- Only 2 has the same behavior 
- Should've got this right, very easy question that only requires plugging in values into both and seeing if they are equal

**Q39:**
![]({{ site.baseurl }}/images/q39.png " ")
- 2000 was a leap year but 1900 was not
- I simply mixed up my leap year rules (not a code issue, literally a skill issue)

**Q40:**
![]({{ site.baseurl }}/images/q40.png " ")
- First need to check if the initial num of vals is 0 because if so, you would just return whats already there
- C is unnecessary to the code

**Q53:**
![]({{ site.baseurl }}/images/q53.png " ")
- It is very necessary to initialize the value of the total to be 1 initially so that the code works as intended, it isn't needed that the while loops runs for x <= n 

# Takeaways
- I need to focus on making sure that when I plug in different scenarios, I am writing down outputs
  - Consider doing a truth table like I learned in Discrete Math
- Look at first and last indexes for errors in error questions
- Make sure that when matching, the output, as well as the input, are identical to one another!