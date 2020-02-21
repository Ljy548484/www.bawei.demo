package com.baidu.day02

object FunDemo {

  def main(args: Array[String]): Unit = {
    //定义一个函数
    val function1 =(a:Int,b:Int)=>a+b
    val function2 = (x:Int)=>x+1
    val arr = Array(1,2,3,4)
    val res = function1(1,2)
    println(res)

    //匿名函数
    val arr2 = arr.map(function2)
    val arr3 = arr.map((x:Int)=>x+10)
    println(arr2.toBuffer)
    println(arr3.toBuffer)

    //方法在scala中可以转换为函数 只需要通过 方法后加 _
  }
}
