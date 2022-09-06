---
toc: true
layout: post
description: Spring Boot Progress 1
comments: false
categories: [spring boot]
title: Spring Boot Progress 1
---
## Our Progress
Woooo so far we’ve created only a basic calculator but we’re hoping to expand upon that when we can. So far we have two versions of a basic calculator, each with its own limitations.
### Desktop Application Calculator (Krish and Nicky)
![]({{site.baseurl}}/images/desktop-calc-image.png "https://github.com/fastai/fastpages")
Krish and Nicky worked together to set up a Desktop GUI that implemented a calculator using JFrame and Springboot. At its core, it simply takes two numbers which the user inputs and a function that the user specifies to perform a mathematical operation and output the value.
Some limitations include: a lack of practical usability as a UI, limits to only two numbers being computed at a time, only one operator/function being able to be used at a time.
Some pros include: a clean GUI that is accurate and does not need to interface with Spring’s web application programs, can perform relatively complex mathematical operations due to its ease of accessibility to Java’s math library.
Some improvements: preferably a better GUI that gives the user a better range of options, maybe more operations, performing multiple operations at a time
### Web Browser Application (Don and Nathan)
![]({{site.baseurl}}/images/web-calc-image.png "https://github.com/fastai/fastpages")
Don and Nathan worked together to set up a Web Browser Application that works as a very basic calculator that takes a string as an input. It then performs the operations it sees in the string on each of the values. It uses Spring Boot and MVC to interface the html output with the actual logic
Some limitations include: a disregard for order of operations, very specific syntax has to be used most of the time or else it wont output at all or will output what the user outputted, its limited only to the four basic operations, the GUI only has a string user input and an = sign button that functions.
Some pros include: it can perform multiple operations at a time, has a functioning GUI that is clean, runs on a web browser, is easy to visualize
Some improvements include: Creating functioning buttons in its GUI, accounting for order of operations (likely to try to use tree data structure in order to implement this), more operators and functions
### Future Work
To make a well made calculator and preferably to expand it as a tool to help with math problems, we’re likely to move towards the web development side of Spring Boot. It’s tools provide a relatively straightforward method to putting our java programs onto a web browser through its boiler plate code and hopefully that should enable us to focus mainly on the functionality of our web.
Through this, we learned how to use JFRame and also understand how Spring Boot uses MVC to build a webpage using mostly HTML and Java files.