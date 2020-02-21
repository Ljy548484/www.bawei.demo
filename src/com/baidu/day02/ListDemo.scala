package com.baidu.day02

object ListDemo {

  def main(args: Array[String]): Unit = {
    val list1= (1,11,10,"jack")
    //按照字典顺序排序
    //var list2 = list1.map(x=>x.toString).sortBy(x=>x)
    //println(list2)

    //list改变元素 必须是listbuffer

    val array = new Array[Int](5)
    val list = List(1,2,3,4,65)
    val list2 = 3+:list
    println(list2)


  }
}
