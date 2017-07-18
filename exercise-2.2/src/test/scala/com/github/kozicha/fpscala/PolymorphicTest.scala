package com.github.kozicha.fpscala

import org.scalatest.{FlatSpec, Matchers}
import Polymorphic.isSorted

class PolymorphicTest extends FlatSpec with Matchers {
  "isSorted" should "give true for Array(1,2,3)" in {
    isSorted[Int](Array(1, 2, 3), (a, b) => a < b) shouldBe true
  }

  it should "give true for Array(c,bb,aaa)" in {
    isSorted[String](Array("c", "bb", "aaa"), (a, b) => a.length < b.length) shouldBe true
  }

  it should "give true for empty Array" in {
    isSorted[Int](Array(), (a, b) => a < b) shouldBe true
  }

  it should "give true for one element Array" in {
    isSorted[Int](Array(1), (a, b) => a < b) shouldBe true
  }
}
