import scala.collection.mutable.ListBuffer

object demo{
  def main(args:Array[String]){

    val list = ListBuffer(1, 8, 5, 6, 9, 58, 23, 15, 4)
    println(list)
    var s= new DoubleQueue(list)

    s.dequeue(list)
    println(list)
    s.enqueue(list)
    println(list)

    var w=new SquareQueue(list)
    println(list)

  }
}

