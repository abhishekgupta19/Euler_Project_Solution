package scala;

/* Sum of Natural Number below 1000 which are
   multiple by 3 or 5 */


object EulerSolution1 extends App{

  euler_solution1()

  def euler_solution1(): Unit = {

    var s : Int = 0
    val list:Range= 1 until 1000
    for(i <- list
        if i % 3 == 0 || i % 5 == 0 )
    {
      s = s + i
    }

    println("sum of natural number below 1000 which are multiple by 3 or 5\n" + s)
  }
}
