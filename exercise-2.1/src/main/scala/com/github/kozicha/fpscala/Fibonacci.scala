package com.github.kozicha.fpscala

object Fibonacci {
  def fib(n: Int): Int = {
    def loop(pp: Int, p: Int, left: Int): Int =
      if (left == 0) pp + p
      else loop(p, pp + p, left - 1)

    assert(n >= 0, "n cannot be negative")

    if (n < 2) n
    else loop(0, 1, n - 2)
  }
}
