package com.baidu.day02

object MethodFunc {

  def main(args: Array[String]): Unit = {
    def m1(f:(Int,Int)=>Int):Int={
      f(2,3)
    }

    val f1=(a:Int,b:Int)=>a+b
    val f2=(a:Int,b:Int)=>a*b

    var res = m1(f1)
    println(res)
  }
}
