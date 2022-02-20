package Chapter_4;

public class Pwr {
    double base;
    int exp;
    double val;

    // base=3, exp=3
    public Pwr(double base, int exp) {
        this.base = base;
        this.exp = exp;

        val = 1;
        if (exp == 0) {
            return;
        }

        // 3>0; 3--
        // 2>0; 2--
        // 1>0; 1--
        for (; exp > 0; exp--) {
            // val = 1 * 3;
            // val = 3 * 3;
            // val = 9 * 3;
            val = val * base;
        }
    }

    public double get_pwr() {
        return val;
    }
}
/*1. What is the difference between a class and an object?
Class is a blueprint of an object. Object is an instance of a class


2. How is a class defined?
Class is defined with keyword "class" followed by a class name.


3. What does each object have its own copy of?
Each object has its own copy of class instance variables and methods.


4. Using two separate statements, show how to declare an object called counter of a
class called MyCounter.
MyCounter counter;
counter=new MyCounter();


5. Show how a method called myMeth( ) is declared if it has a return type of double
and has two int parameters called a and b.

public double myMeth(int a, int b){
return variable;
}


6. How must a method return if it returns a value?
Method returns value by using keyword "return";


7. What name does a constructor have?
Constructor has the same name as the class;


8. What does new do?
New dynamically allocated memory for an object and returns a reference to a variable.


9. What is garbage collection, and how does it work?
Garbage collection ia an automatic process that occurs on its own. When there are no references to the object,
the object is deleted.


10. What is this?
"This" is a keyword that refers to a current object.


11. Can a constructor have one or more parameters?
Yes

12. If a method returns no value, what must its return type be?
void
*/