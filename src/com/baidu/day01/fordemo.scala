package com.baidu.day01

object fordemo {
  def main(args: Array[String]): Unit = {
    //val arr = Array(555.55f,"max",true,"louhui")
    //println(arr(3))

   /* val arr1=Array(1,2,3,4,5,6)
    for (i <- 0 until arr1.length){
      sum += arr1(i)
    }*/
    //println(arr1.sum) //只有数字能够进行求和
   // var arr2 = for (i <- arr1) yield i+1
    //println(arr2.toBuffer)

    var arr3 = for (i <- 1 to 1000) yield i+1
    println(arr3.toBuffer)

    var arr4 = for (i <- arr3;if(i%2==0)) yield i
    println(arr4.toBuffer)

    var arr5 = for (i <- arr3;if(i%2!=0)) yield i * 10
    println(arr5.toBuffer)

    var arr6 = arr3.filter(_%2==0) //_代表数字中得每一个元素
    println(arr6.toBuffer)

    var arr7 = arr3.filter(_%2!=0)
    println(arr7.toBuffer)

    for (i <- 1 to (10,3)){
      println(i)
    }
    //var array1 = new Array[int](3)
   // var array2 = Array[int](1,2,3)
   // println(array2(2))
  }
}
