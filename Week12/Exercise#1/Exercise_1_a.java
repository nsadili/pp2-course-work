/*
a) 

In my opinion the output for the following code will be: 

Exception in thread "main" ExceptionDemo3
    at FinallyDemo.testFinally(FinallyDemo.java:18)
    at FinallyDemo.main(FinallyDemo.java:5)

Explanation of the output: 
When "testFinally()" method is called, the coee throws "ExceptionDemo4", what then caughts "catch" that expects "exceptionDemo1"
, and rethrows "ExceptionDemo2". Although, this process might be gone, since we have "finally", so "ExceptionDemo3" will be
trown, which then will become a final excpetion from the code's method. 
*/

