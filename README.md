Create a layout where you have a centered text view at 25% from the top of the display, and a row of three buttons with labels “plus”, “minus”, and “reset” at 25% from the bottom of the display. Buttons should be evenly spaced in horizontal direction. 

Develop an application that has a text field (TextView class instance) to show a counter value (initially zero), and three buttons: plus, minus and reset which manipulate the value by incrementing it by 1, decrementing it by 1, and zeroing it.

counter has minimum, maximum, starting and step values that are defined by constructor parameters 
when it is created (e.g. try with min -15, max 22, start value 1 and step of 7). 

A second constructor without parameters will initiate with default values as (-100, 100, 0, 1). 

Buttons react to clicks - a click increments/decrements by step. 

Create a separate Counter class to implement the counter logic - in your activity only call methods of that class (and there should not be any Android specific things in the counter class). 

Try to encapsulate the counter as much as possible; for example, make the variable that holds the current value private.

