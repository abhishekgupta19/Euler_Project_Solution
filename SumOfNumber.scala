
/**
  * Created by agn3119 on 8/23/16.
  */

/*
  Sum of Natural Number below 10 which are
  multiple by 3 or 5

 */

object SumOfNumber extends App{

    euler_solution1()

  def euler_solution1(): Unit = {

      var s : Int = 0
      val list:Range= 1 until 1000
      for(i <- list
          if i % 3 == 0 || i % 5 == 0 )
            {
             s = s + i
            }

      println("sum of natural number below 10 which are multiple by 3 or 5\n" + s)
  }
}
