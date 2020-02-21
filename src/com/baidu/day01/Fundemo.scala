package com.baidu.day01

object Fundemo {

  def main(args: Array[String]): Unit = {
    //定义一个函数
    val function1=(a:Int,b:Int)=>a+b
    val function2=(x:Int)=>x+1
    val res = function1(1,2)
    println(res)

    //匿名函数 没有名字得函数 scala 是面向函数编程，函数可以进行传递
    val arr= Array(1,2,3,4)
    val arr1 = arr.map(function2)
    println(arr1.toBuffer)

  }
}
