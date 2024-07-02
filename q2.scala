import scala.io.StdIn

object FilterStrings{
    def main(args: Array[String]): Unit = {
        println("Enter strings seperated by commas : ")

        val input = StdIn.readLine()
        val inputList = input.split(",").map(_.trim).toList

        val filteredList = filterStrings(inputList)

        println(s"Filtered list : $filteredList")
    }

    def filterStrings(s: List[String]): List[String] = {
        s.filter(_.length>5)
    }
}
