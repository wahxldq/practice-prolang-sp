package lecture.basic3

import org.scalatest.FunSuite
import org.scalatest.Reporter

import kobe_cs18a.prolang_sp._

class T03 extends FunSuite {
    val es = Seq(
        Seq(1,2,3,4),
        Seq(8,1,1,5),
        Seq(5,4,3,2),
        Seq(9,8,7,6)
    )

    test("genTree4のテスト") {
        assert(
            es.forall(e => lecture.basic3.Main.genTrees4(e,10) == Ticket.genTrees4(e,10))
            )
    }    

}