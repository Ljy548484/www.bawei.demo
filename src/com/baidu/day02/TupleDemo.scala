package com.baidu.day02

object TupleDemo {

  def main(args: Array[String]): Unit = {
    val tup1 = ("hadoop",1,3.15)
    println(tup1._1)

    val t,(a,b,c) = (tup1._3,tup1._2,tup1._1)
    println(t)
    println(a)
  }
}
