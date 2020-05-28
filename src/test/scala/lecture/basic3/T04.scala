package lecture.basic3

import org.scalatest.FunSuite
import org.scalatest.Reporter

import kobe_cs18a.prolang_sp._

class T04 extends FunSuite {
    val es = Seq(
        Seq(1,2),
        Seq(1,2,3),
        Seq(1,2,3,4),
        Seq(1,2,3,4,5),
        Seq(1,2,3,4,5,6),
        Seq(1,2,3,4,5,6,7))

    test("genTrees のテスト") {
        assert(
            es.forall(e => lecture.basic3.Main.genTrees(e).size == Ticket.genTrees(e).size)
            )
    }    

}