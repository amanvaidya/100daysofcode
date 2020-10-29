#100daysofcode<br>
#Time complexity of a program:<br>
#1) Constant Time Algorithms – O(1): <br>
##1.1)If piece of code takes a constant amount of time to run. It's not dependent on the size of n.<br>
##1.2) We denote constant time algorithms as follows: O(1). Note that O(2), O(3) or even O(1000) would mean the same thing.<br>
##1.3)We don't care about exactly how long it takes to run, only that it takes constant time.<br>
#2) Logarithmic Time Algorithms – O(log n)<br>
##2.1)Constant time algorithms are (asymptotically) the quickest. Logarithmic time is the next quickest. <br>
##2.2)The important thing here is that the running time grows in proportion to the logarithm of the input.<br>
##e.g:<br> for (int i = 1; i < n; i = i * 2){<br>
##System.out.println("Hey - I'm busy looking at: " + i);<br>
##}<br>
##If n is 8, the output will be the following:    <br>
##Hey - I'm busy looking at: 1<br>
##Hey - I' m busy looking at: 2<br>
##Hey - I'm busy looking at: 4<br>
##Our simple algorithm ran log(8) = 3 times.<br>
#3)Linear Time Algorithms – O(n)<br>
##3.1)After logarithmic time algorithms, we get the next fastest class: linear time algorithms.<br>
##3.2)If we say something grows linearly, we mean that it grows directly proportional to the size of its inputs.<br>
##3.3)As with the constant time algorithms, we don't care about the specifics of the runtime. O(2n+1) is the same as O(n), as Big O Notation concerns itself with growth for input sizes.<br>
#4)N Log N Time Algorithms – O(n log n)
##4.1)n log n is the next class of algorithms. The running time grows in proportion to n log n of the input:
##4.2) e.g:
##for (int i = 1; i <= n; i++){<br>
##for(int j = 1; j < n; j = j * 2) {<br>
##System.out.println("Hey - I'm busy looking at: " + i + " and " + j);<br>
##}<br>
##}<br>
##4.3)For example, if the n is 8, then this algorithm will run 8 * log(8) = 8 * 3 = 24 times. Whether we have strict inequality or not in the for loop is irrelevant for the sake of a Big O Notation<br>
#5)Polynomial Time Algorithms – O(np)<br>
##5.1)Next up we've got polynomial time algorithms. These algorithms are even slower than n log n algorithms.<br>
##5.2)The term polynomial is a general term which contains quadratic (n2), cubic (n3), quartic (n4), etc. functions. What's important to know is that O(n2) is faster than O(n3) which is faster than O(n4), etc.<br>
##5.3)Let's have a look at a simple example of a quadratic time algorithm:<br>
##5.4) e.g:<br>
##for (int i = 1; i <= n; i++) {<br>
##for(int j = 1; j <= n; j++) {<br>
##System.out.println("Hey - I'm busy looking at: " + i + " and " + j);<br>
##}<br>
##}<br>
##5.5)This algorithm will run 8^2 = 64 times. Note, if we were to nest another for loop, this would become an O(n3) algorithm.<br>
#6)Exponential Time Algorithms – O(kn)<br>
##6.1)Now we are getting into dangerous territory; these algorithms grow in proportion to some factor exponentiated by the input size.<br>
##6.2)For example, O(2n) algorithms double with every additional input. So, if n = 2, these algorithms will run four times; if n = 3, they will run eight times (kind of like the opposite of logarithmic time algorithms).<br>
##6.3)O(3n) algorithms triple with every additional input, O(kn) algorithms will get k times bigger with every additional input.<br>
##6.4)Let's have a look at a simple example of an O(2n) time algorithm:<br><br>
##for (int i = 1; i <= Math.pow(2, n); i++){<br>
##System.out.println("Hey - I'm busy looking at: " + i);<br>
##}<br>
##6.5)This algorithm will run 2^8 = 256 times.<br>
#7)Factorial Time Algorithms – O(n!)<br>
##7.1)In most cases, this is pretty much as bad as it'll get. This class of algorithms has a run time proportional to the factorial of the input size.<br>
##7.2)A classic example of this is solving the traveling salesman problem using a brute-force approach to solve it.<br>
##7.3)An explanation of the solution to the traveling salesman problem is beyond the scope of this article.<br>
##7.4)Instead, let's look at a simple O(n!) algorithm, as in the previous sections:<br>
##for (int i = 1; i <= factorial(n); i++){<br>
##System.out.println("Hey - I'm busy looking at: " + i);<br>
##}<br>
##7.5)where factorial(n) simply calculates n!. If n is 8, this algorithm will run 8! = 40320 times.
