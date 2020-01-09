package internal

import org.junit.Test
import org.junit.Assert._
import org.junit.Before

class MemberArrayTest {
  var arr: MemberArray = null

  @Before def before(): Unit = {
    arr = new MemberArray()
  }

  @Test def startEmpty(): Unit = {
    assertTrue(arr.isEmpty)
  }

  @Test def addOne(): Unit = {

    arr += new ConcreteMember("1", "2", 1000)
  }

  @Test def addLots(): Unit = {

    for (i <- 0 until 100)
      arr += new ConcreteMember("1", "2", (1000 * util.Random.nextDouble()).toInt)
  }

  @Test def addGet(): Unit = {

    val a = new ConcreteMember("1", "2", 1003)
    val b = new ConcreteMember("1", "2", 900)
    val c = new ConcreteMember("1", "2", 1700)
    val d = new ConcreteMember("1", "2", 1100)
    val e = new ConcreteMember("1", "2", 930)

    arr += a += b += c += d += e

    assertEquals(5, arr.length)
    assertEquals(e, arr.get(930))

    assertEquals(a, arr.get(1003))
  }

  @Test def addRemove(): Unit = {
    val a = Array.fill(100)(util.Random.nextInt())

    for (e <- a) {
      arr += new ConcreteMember("1", "2", e)
    }

    assertEquals(100, arr.length)
    assertFalse(arr.isEmpty)

    for (e <- a) {
      assertEquals(e, arr.get(e).id)
    }

    for (e <- a) {
      arr -= e
    }

    assertEquals(0, arr.length)
    assertTrue(arr.isEmpty)
  }
}