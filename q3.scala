import scala.math.BigDecimal.RoundingMode
import scala.io.StdIn

object FindMean{
    def main(args: Array[String]): Unit = {

        println("Enter num1 : ")
        val num1 = StdIn.readInt()

        println("Enter num2 : ")
        val num2 = StdIn.readInt()

        val result = mean(num1, num2)

        println(f"Arithmetic mean of $num1 and $num2 : $result%.2f")

    }

    def mean(n1: Int, n2: Int): Double = {
        val result = (n1 + n2)/2.00
        BigDecimal(result).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    }
}