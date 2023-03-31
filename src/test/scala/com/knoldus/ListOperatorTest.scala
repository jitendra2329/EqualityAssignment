package com.knoldus
import org.scalatest.funsuite.AnyFunSuite

class ListOperatorTest extends AnyFunSuite {
  val operator = new ListOperator()

  test("equals should return true when comparing two equal lists") {
    assert(operator.equals(List(1, 2, 3), List(1, 2, 3)))
  }

  test("equals should return false when comparing two lists with different elements") {
    assert(!operator.equals(List(1, 2, 3), List(3, 2, 1)))
  }

  test("== should return true when comparing two equal lists") {
    assert(operator.==(List(1, 2, 3), List(1, 2, 3)))
  }

  test("== should return false when comparing two lists with different elements") {
    assert(!operator.==(List(1, 2, 3), List(3, 2, 1)))
  }

  test("!= should return false when comparing two equal lists") {
    assert(!operator.!=(List(1, 2, 3), List(1, 2, 3)))
  }

  test("!= should return true when comparing two lists with different elements") {
    assert(operator.!=(List(1, 2, 3), List(3, 2, 1)))
  }

  test("ne should return false when comparing two equal lists") {
    assert(operator.ne(List(1, 2, 3), List(1, 2, 3)))
  }

  test("ne should return true when comparing two lists with different elements") {
    assert(operator.ne(List(1, 2, 3), List(3, 2, 1)))
  }

  test("eq should return false when comparing two equal lists") {
    assert(!operator.eq(List(1, 2, 3), List(1, 2, 3)))
  }

  test("eq should return true when comparing two lists with different elements") {
    assert(!operator.eq(List(1, 2, 3), List(3, 2, 1)))
  }
}
