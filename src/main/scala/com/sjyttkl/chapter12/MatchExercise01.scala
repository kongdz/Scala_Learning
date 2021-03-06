package com.sjyttkl.chapter12

/**
  * Create with: com.sjyttkl.chapter12 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2019/11/24 22:54 
  * version: 1.0
  * description:  
  */
object MatchExercise01 {
  def main(args: Array[String]): Unit = {
    for (ch <- "+-3!") {
      var sign = 0
      var digit = 0
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        // 说明..
        // 可以有多个 默认匹配，但是后面的默认匹配无效，编译器没有报错
        case _  => digit = 3  //如果case _  c出现在match中间，表示隐藏变量名，即不使用、而不是表示默认匹配
        case _  => sign = 2
      }
      // + 1 0
      // - -1 0
      // 3 0 3
      // ! 0 3
      println(ch + " " + sign + " " + digit)
    }

  }
}
