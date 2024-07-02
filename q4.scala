import scala.io.StdIn

object SumofEvenNumbers{
    def main(args: Array[String]): Unit = {
        println("Enter a list of integers separated by commas : ")

        val input = StdIn.readLine()

        val inputList = input.split(",").map(_.trim.toInt).toList

        val sum = sumOfInts(inputList)

        println(s"The sum of even numbers : $sum")
    }

    def sumOfInts(integers: List[Int]): Int = {
        integers.filter(_%2==0).sum
    }
}
