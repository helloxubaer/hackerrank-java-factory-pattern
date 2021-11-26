# hackerrank-java-factory-pattern
In this problem, you are given an interface Food.
There are two classes Pizza and Cake which implement the 
Food interface, and they both contain a method getType().

The main function in the Main class creates an instance of the FoodFactory class. 
The FoodFactory class contains a method getFood(String) that returns a new instance of Pizza or Cake according to its parameter.

Sample Input 1
cake

Sample Output 1
The factory returned class Cake
Someone ordered a Dessert!

Sample Input 2
pizza

Sample Output 2
The factory returned class Pizza
Someone ordered Fast Food!

# Solution
Food interface have been implemented in Pizza and Cake class
FoodFactory class returns the object as per requrement from client side.
No need to create object from client class.

NB: just copy FoodFactory class if you need to solve the clallenge in hackerrank default editor.
