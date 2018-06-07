**Carolina Cervantes**
## Part 2 ##
Question: What would be a really simple solution if n were not an argument, i.e., if it were always 17?
Answer: If n were not an argument, then we would not necessarily require a method. However, because n is an argument, we must check if it is a positive integer (testing), and then give the argument to a method to do FizzBuzz.


----------
## Part 3 ##
Question: How could you have automatically tested your initial solution from part 2?
Answer: Instead of taking an argument from the command line, to test the program, I could have initialized the parameter variable to a number inside of the fizzBuzz method to see if it caught any errors and run properly.


----------
## Part 4 ##
Question: What changes between parts 2, 3, and 4, and what stays the same? Does it matter what list implementation you choose? If so, in what way(s)?
Answer: The syntax changes between parts 2, 3, and 4, obviously, due using an array in part 3 and using an array list in part 4. If you are not careful going through your for-loop, you can possibly get an out of bounds error like I did. In part 2, you could simply print out the results where as in parts 3 and 4 you had to add an element to the array. It does matter what list implementation you choose, because, like I said, there could be out of bounds errors if you do not catch them right away. Arrays are immutable, meaning that they cannot be changed, i.e., you cannot add or remove elements from an array. An Array List, however, is dynamic so you are able to use the List.add function to add an element to the end of the array. Using array lists seem like the easier option to me.
> Written with [StackEdit](https://stackedit.io/).