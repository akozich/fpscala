package com.github.kozicha.fpscala

import org.scalatest.FlatSpec
import Functions._

class FunctionsTest extends FlatSpec {

  behavior of "FunctionsTest"

  it should "curry" in {
    val curried = curry[Int, Double, String]((i, d) => (d + i).toString)

    assert(curried(2)(2.5) === "4.5")
    assert(curried(5)(5.1) === "10.1")
  }

  it should "uncurry" in {
    val uncurried = uncurry[Int, Double, String](i => d => (d + i).toString)

    assert(uncurried(1, 2.5) === "3.5")
    assert(uncurried(0, 5.5) === "5.5")
  }

  it should "compose" in {
    val composed = compose[Int, Double, String](_.toString, _.toDouble)

    assert(composed(1) === "1.0")
    assert(composed(5) === "5.0")
  }

}
