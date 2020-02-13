/**
 * You are given an integer N. You need to print the series of all prime numbers till N.

 * Input Format

 * The first and only line of the input contains a single integer N denoting the number till where you need to find the series of prime number.

 * Output Format

 * Print the desired output in single line separated by spaces.

  Constraints

  1<=N<=1000

  SAMPLE INPUT
  9
  SAMPLE OUTPUT
  2 3 5 7

 * Link: https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/prime-number-8/

 * Time Limit:	5.0 sec(s) for each input file.
 * Memory Limit:	256 MB
 * Source Limit:	1024 KB
 * Marking Scheme:	Marks are awarded when all the testcases pass.
 * Allowed Languages:	Bash, C, C++, C++14, Clojure, C#, D, Erlang, F#, Go, Groovy, Haskell, Java, Java 8, JavaScript(Rhino), JavaScript(Node.js), Julia, Kotlin, Lisp,
 * Lisp (SBCL), Lua, Objective-C, OCaml, Octave, Pascal, Perl, PHP, Python, Python 3, R(RScript), Racket, Ruby, Rust, Scala, Swift, Swift-4.1, TypeScript, Visual Basic
 */

package basicproblems.inputoutput;

import java.util.Scanner;

public class PrimeNumberFinder {


    public boolean checkForPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int itr = 2; itr < number; itr++) {
            if (number % itr == 0) {
                return false;
            }
        }
        return true;
    }

    public String givePrimeNumbers(int number) {
        String result = "";
        for (int i = 2; i <= number; i++) {
            if (checkForPrime(i))
                result = result + " " + String.valueOf(i);
        }
        return result;
    }

    public static void main(String[] args) {
        PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder();
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        System.out.println(primeNumberFinder.givePrimeNumbers(N));
    }
}