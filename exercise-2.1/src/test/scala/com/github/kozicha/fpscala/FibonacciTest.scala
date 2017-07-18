package com.github.kozicha.fpscala

import Fibonacci.fib

import org.scalatest.{FlatSpec, Matchers}

class FibonacciTest extends FlatSpec with Matchers {
  "6h fibonacci number" should "be 8" in {
    fib(6) shouldBe 8
  }

  "11th fibonacci number" should "be 89" in {
    fib(11) shouldBe 89
  }
}
