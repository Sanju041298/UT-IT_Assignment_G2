package com.knoldus

import com.knoldus.Numbers.get_palindrome_factorial
import org.scalatest.FunSuite

class Palindrome_Factorial_Validator extends FunSuite{
   val getpalindromefactorial  = new get_palindrome_factorial

  test("Should return True if the number is Palindrome"){
    assert(getpalindromefactorial.Palindrome(121))
  }
  test("Should return False if the number is not Palindrome"){
    assert(!getpalindromefactorial.Palindrome(10))
  }
  test("Should return False for Palindrome if the number is negative"){
    assert(getpalindromefactorial.Palindrome(-1))
  }

  test("Factorial of 'Zero' 0 and 'One' should be 'One' 1"){
    assert(getpalindromefactorial.Factorial(0)===1)
    assert(getpalindromefactorial.Factorial(1)===1)
  }

}
