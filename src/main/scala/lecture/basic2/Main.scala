package lecture.basic2

abstract class medianSpec {
    def median(seq: Seq[Int]): Double 
}

object Main extends medianSpec {

    def main(args: Array[String]) = {
        val example1 = Seq(1,2,3)
        val example2 = Seq(100,80,200,40,500,50)
        val example3 = Seq(9,999,10,20)        
        val example4 = Seq(333,3,33)                
        println(s"$example1 の中央値は ${median(example1)}")
        println(s"$example2 の中央値は ${median(example2)}")
        println(s"$example3 の中央値は ${median(example3)}")
        println(s"$example4 の中央値は ${median(example4)}")        
    }

    def median(seq: Seq[Int]): Double = ???

}