
import jp.kobe_u.copris._
import jp.kobe_u.copris.dsl._


import jp.kobe_u.copris._
import jp.kobe_u.copris.dsl._

object Main {
    def main(args: Array[String]) {
        println("Hello")
    }
}

object FirstPractice {
    def madianInt(seq: Seq[Int]) = ???
}

object CSV {
    def makeDataFromFile(csvName: String) = {
        val source = scala.io.Source.fromFile(csvName)
        (for (line <- source.getLines if line.startsWith("2")) yield {
            val is = line.split(',')
            //0,1,2,品質情報,4,品質情報,均質番号,7,品質情報,9,品質情報,均質番号,12,品質情報,均質番号,15,品質情報,均質番号
            //天気概況(夜：18時〜翌日06時),天気概況(夜：18時〜翌日06時)
            Seq(0,1,2,4,7,9,12,15).map(is(_))
        }).toSeq
    }

    def filterData(index: Int, regex0: scala.util.matching.Regex, data: Seq[Seq[String]]) = {
        data.filter{ row => 
            row(index) match {
                case regex0() => true
                case _ => false
            }
        }
    }
}

object DSL {
    def load(fileName: String) = {
        (new loader.SugarLoader(csp)).load(fileName)
    }
}

// https://github.com/sbt/sbt/issues/3661
// jline.TerminalFactory.get.init
