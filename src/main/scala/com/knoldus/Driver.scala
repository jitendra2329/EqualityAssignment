package com.knoldus

object Driver extends App {
  private val listOperator = new ListOperator
  println(listOperator.equals[Int](List(2, 39, 3, 95), List(2, 39, 3, 95)))
  println(listOperator.==[Int](List(2, 39, 3, 95), List(2, 39, 3, 95)))
  println(listOperator.!=[Int](List(2, 39, 3, 95), List(2, 39, 3, 95)))
  println(listOperator.ne[Int](List(2, 39, 3, 95), List(2, 39, 3, 95)))
  println(listOperator.eq[Int](List(2, 39, 3, 95), List(2, 39, 3, 95)))
}
