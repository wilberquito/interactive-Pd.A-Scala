package udg.objects

import scala.language.postfixOps

object Sort {
  def sort(xs: Array[Int]): Unit = {
    def swap(i: Int, j: Int): Unit = {
      val t = xs(i)
      xs(i) = xs(j)
      xs(j) = t
    }
    def sort1(l: Int, r: Int): Unit = {
      val pivot = xs((l + r) / 2)
      var i = l
      var j = r
      while (i <= j) {
        while (xs(i) < pivot) i += 1
        while (xs(j) > pivot) j -= 1
        if (i <= j) {
          swap(i, j)
          i += 1
          j -= 1
        }
      }
      if (l < j) sort1(l, j)
      if (i < r) sort1(i, r)
    }
    sort1(0, xs.length - 1)
  }

  def sortf(xs: Array[Int]): Array[Int] = {
    if (xs.length <= 1) xs
    else {
      val pivot = xs(xs.length / 2)
      Array.concat(
        sortf(xs filter (pivot >)),
        xs filter (pivot ==),
        sortf(xs filter (pivot <))
      )
    }
  }
}
