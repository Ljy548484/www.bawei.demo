package com.baidu.day02

import scala.collection.mutable

object MapDemo {

  def main(args: Array[String]): Unit = {
    val map1 = Map(("a",10),("b",20))
    println(map1("a"))
    println(map1.keySet)
    for (x <- map1.keySet){
      println(map1(x))
    }

    val user = mutable.HashMap(("a",20),("b",30),("c",50))
    user += ("d"-> 50)
    println(user("d"))

    user -=("d")
    println(user)
    user.put("liuhui",100)
    println(user)

    //类型转换
    val arr=Array(("jack",15),("kk",50),("k2",30))
    val res = arr(1)._2

    val arr3=("jack",("156",138))
    println(arr3._2._2)

    //拉链操作
    val arr4 = Array("jj","kk","mm","gg","min")
    val arr2 = Array(98,97,96,95,93)

    //zip
    val res4 = arr4.zip(arr2).toMap
    println(res4)

    //zipWhthIndex
    val res5 = arr4.zipWithIndex
  }
}
