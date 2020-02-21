package com.baidu.day02

import scala.util.Random

object wordCont {

  def main(args: Array[String]): Unit = {
  /*  val list=List("hello bob hello jerry hello tom hello bob hello max","max max bob bob")

    //进行单词统计
    var wordCont1 = list.map(_.split(" ")).flatten
    var wordCont2 = wordCont1.map(x=>(x,1))
    var wordCont3 = wordCont2.groupBy(x=>(x._1))
    var wordCont4 = wordCont3.map(x=>(x._1,x._2.size)).toList.sortBy(_._2).reverse
    println(wordCont1)
    println(wordCont2)
    println(wordCont3)
    println(wordCont4)*/

   /* val list1=List(List("hello bob hello jerry hello tom hello bob hello max","max max bob bob"),List("max max"))
    println(list1)
    var res2 = list1.flatMap(_.flatMap(_.split(" "))).map(x=>(x,1)).groupBy(x=>(x._1)).map(x=>(x._1,x._2.size)).toList.sortBy(_._2).reverse
    println(res2)*/

    val arr1 = new Array[Int](8)
  //  println(arr1.toBuffer)
    val arr2 = Array[Int](8,9)

    val arr3 = Array(7,8,9,2,3,5,6)
/*    for (i <- arr3){
      println(i)
    }*/

  /*  println(arr3.sum)
    println(arr3.max)*/

    //排序
    val arr4 = arr3.sortBy(x=>x).reverse
/*    println(arr4.toBuffer)*/

   /* println(arr3.length)
    println(arr3.size)
    println(arr3.count(x=>true))*/
   /* println(arr3.head)
    println(arr3.tail(1))
    println(arr3.take(3).toBuffer)*/

    val a = Random.nextInt(arr3.length)
    println(arr3(a))
  }
}
