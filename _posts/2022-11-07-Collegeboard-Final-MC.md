---
toc: true
layout: post
description: Final exam for APCSA
comments: false
categories: [final]
title: Collegeboard Final MC
---
![]({{ site.baseurl }}/images/practiceMC.png "MC results")

# What I learned
- My overall score was a 34/40 on the MC
- Skills that I got wrong:
  - 1.B: Determine code that would be used to complete code segments.
  - 2.B: Determine the result or output based on statement execution order in a code segment without method calls (other than output).
  - 2.C: Determine the result or output based on the statement execution order in a code segment containing method calls.
  - 4.A: Use test-cases to find errors or validate results.

# Questions
**Q10:** Consider the following instance variable and methods. You may assume that data has been initialized with length > 0. The methods are intended to return the index of an array element equal to target, or -1 if no such element exists.
![]({{ site.baseurl }}/images/q10.jpg " ")

For which of the following test cases will the call seqSearchRec(5) always result in an error?

1. data contains only one element.
2. data does not contain the value 5.
3. data contains the value 5 multiple times.

- I chose 1 only but the answer was 2 only
- Notes: 
  - I could not understand how to even approach the question
  - I now understand that if the value 5 were not present, it would not be possible for it to run as there would be an error


**Q11:** Consider the following instance variable and methods. You may assume that data has been initialized with length > 0. The methods are intended to return the index of an array element equal to target, or -1 if no such element exists.
![]({{ site.baseurl }}/images/q11.jpg " ")

- I chose `if (last < data.length) return -1` but the answer was `if (last < 0) return -1;`
- Notes: 
  - I didn't realize that the last element had to be less than 0
  - In reality, `last < data.length` will always return true on the first call, making it clearly false

**Q12:** What is returned as a result of the call mystery("computer") ?
![]({{ site.baseurl }}/images/q12.jpg " ")

- I selected the answer "cmue" when in reality the answer was "optr"
- Notes: 
  - I didn't read that the index of k started at 1 and not 0
  - I needed to read better
  - I got the correct answer assuming that k started at 0, so I should do a better job reading and I would be fine

**Q21:** Consider the following method, which is intended to return the element of a 2-dimensional array that is closest in value to a specified number, val.
![]({{ site.baseurl }}/images/q21.jpg " ")
Which of the following could be used to replace / * missing code * / so that findClosest will work as intended?

- I selected `Math.abs (num - minDiff) < minDiff` but the answer was `Math.abs (num - val) < minDiff`
- Notes: 
  - To find the closest value to the value, you need to find the difference between the num and val rather than the num and the minDiff

**Q23:** What will the contents of animals be as a result of calling manipulate?
![]({{ site.baseurl }}/images/q23a.jpg " ")

Assume that animals has been instantiated and initialized with the following contents.
![]({{ site.baseurl }}/images/q23b.jpg " ")

- I chose ["baboon", "bear", "zebra", "bass", "cat", "koala"] but the answer is ["bear", "zebra", "bass", "cat", "koala", "baboon"]
- Notes:
  - I forgot that the later letters than just the first letter could be "b" 
  - Notes:
    - Only 1 iteration of this loop would occur now

**Q24:** Consider the following code segment.
![]({{ site.baseurl }}/images/q24.jpg " ")
What is printed as a result of executing the code segment?

- I chose 5, but the answer was 7
- Notes:
  - I just had an error somewhere in my calculations, causing me to get 5 instead of 7
  - The value of the newArray is 7 at (0,2)
