import scala.util.Try

object Main {

  def createString(size: Int): Try[String] = {
    Try {
      require(size >= 0, "The size must be greater than or equal to zero.")
      (for (i <- 0 to size) yield "a").mkString
    }
  }

}
