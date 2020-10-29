#100daysofcode<br>
#Time complexity of a program:<br>
##1) Constant Time Algorithms – O(1): <br>
##1.1)If piece of code takes a constant amount of time to run. It's not dependent on the size of n.<br>
##1.2) We denote constant time algorithms as follows: O(1). Note that O(2), O(3) or even O(1000) would mean the same thing.<br>
##1.3)We don't care about exactly how long it takes to run, only that it takes constant time.<br>
##2) Logarithmic Time Algorithms – O(log n)<br>
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
