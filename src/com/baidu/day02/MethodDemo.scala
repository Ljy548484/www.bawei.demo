package com.baidu.day02

object MethodDemo {
  def main(args: Array[String]): Unit = {
    //定义一个方法
    def method(a:Int,b:Int):Int=a+b
    val res = method(3,5)
    println(res)
  }
}
