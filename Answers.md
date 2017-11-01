#LAB 7

### What is the purpose of the various auxiliary methods populateList, populateFifoList, and ReverseLines.printReverse?

The purpose of the `populateList` and `populateFifoList` methods are to add items to the list.
The purpose of the `printReverse` method is to print each item in the stack.
The methods are used instead of using a loop.


### Why do these methods need to have arguments, and how does the argument change from one recursive call to the next?

These methods need to have arguments so it could run recursively, to continually break down until the base case is reached.
The argument change from one recursive call to the next, by use of the next node/ next input then when it reaches the null node the recursion will stop.


### What are the time and space complexity of each of the populateList populateFifoList methods, as well as ReverseLines.printReverse?

- `populateList` is O(n)
- `populateFifoList` is O(n)
- `ReverseLines.printReverse` is O(n)

### Which of these methods can be implemented using while loops?

All of these methods:
 - `populateList`
 - `populateFifoList`
 - `ReverseLines.printReverse`