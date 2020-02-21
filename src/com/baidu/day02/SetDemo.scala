package com.baidu.day02

object SetDemo {

  def main(args: Array[String]): Unit = {
    val set = Set(1,1,2,3,5,5)
    println(set)
    println(set.sum)
    println(set.filter(x=>x>4))
  }
}
