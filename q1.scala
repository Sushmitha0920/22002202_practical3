import scala.io.StdIn

object ReverseString{
    def main(args: Array[String]): Unit = {
        println("Enter a string : ")

        val input = StdIn.readLine()

        val reversedInput = reverseString(input)

        println(s"Reversed string : $reversedInput")
    }

    def reverseString(s: String): String ={
        if(s.isEmpty) ""
        else reverseString(s.tail) + s.head
    }
}