import scala.tools.partest.ReplTest

object Test extends ReplTest {
  def code = """
    |import scala.util.{Success, Failure}
    |def f1(b: Boolean) = if (b) Left(1) else Right(2)
    |def f2(b: Boolean) = if (b) Nil else 1 :: Nil
    |def f3(b: Boolean) = if (b) LazyList.Empty else new LazyList.Cons(1, LazyList.Empty)
    |def f4(b: Boolean) = if (b) Success(1) else Failure(new Exception(""))
    |""".stripMargin
}
