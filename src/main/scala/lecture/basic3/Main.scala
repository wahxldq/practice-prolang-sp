package lecture.basic3

abstract class Tree {
  // 講義資料をみて学習を進めながら適宜コメントを外してください
  // def value: Double
  // def valueEquals(x: Double): Boolean = Math.abs(x - value) < 1e-5
}

case class Leaf(n: Int) extends Tree {
  // 講義資料をみて学習を進めながら適宜コメントを外してください
  // def value: Double = n.toDouble
  // override def toString = n.toString
}

case class Node(op: String, left: Tree, right: Tree) extends Tree {
  // 講義資料をみて学習を進めながら適宜コメントを外してください. ??? は自分で考えて実装してください．
  def value = ???
  /* 実装が完了したら上の def value と置き換えてください．
  def value = op match {
    case "+" => left.value + right.value
    case "-" => ???
    case "*" => ???
    case "/" => ???
  }
  */
  override def toString = 
    "(" + left.toString + " " + op + " " + right.toString + ")"
}

object Main {

  val ops = Seq("+", "-", "*", "/")

  // 講義資料をみて学習を進めながら適宜コメントを外してください. ??? は自分で考えて実装してください．
  /*
  def genTrees2(x1: Int, x2: Int): Seq[Tree] = {
    for {
      ??? <- ???
    } yield Node(op, Leaf(x1), Leaf(x2))
  }
  */

  /*
  def genTrees3(x1: Int, x2: Int, x3: Int) = {
    val trees1 = for {
      ??? <- ???
      ??? <- ???
    } yield Node(op, tree, Leaf(x3.toInt))
    val trees2 = for {
      ??? <- ???
      ??? <- ???
    } yield Node(op, Leaf(x1.toInt), tree)
    trees1 ++ trees2
  }
  */

  /*
  def genTrees4(x1: Int, x2: Int, x3: Int, x4: Int) = {
    val trees1 = for {
      ??? <- ???
      ??? <- ???
    } yield Node(op, tree, Leaf(x4.toInt))
    val trees2 = for {
      ??? <- ???
      ??? <- ???
    } yield Node(op, Leaf(x1.toInt), tree)
    val trees3 = for {
      ??? <- ???
      ??? <- ???
      ??? <- ???
    } yield Node(op, tree1, tree2)
    trees1 ++ trees2 ++ trees3
  }
  */

  /*
  def findSolutions(xs: Seq[Int], a: Int): Seq[Tree] = {
      for {
        tree <- genTrees4(xs(0),xs(1),xs(2),xs(3))
        if tree.valueEquals(a)
      } yiled tree
  }
  */

}
