package com.github.kozicha.fpscala

object Polymorphic {
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    def loop(i: Int): Boolean =
      if (i == as.indices.last) true
      else if (ordered(as(i), as(i + 1))) loop(i + 1)
      else false

    if (as.isEmpty) true
    else loop(0)
  }
}
