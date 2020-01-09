package internal

import java.util.NoSuchElementException

class MemberArray extends scala.collection.mutable.IndexedSeq[Member] {

  private var members: Array[Member] = new Array(16)
  private var memberCount: Int = 0

  def update(idx: Int, elem: Member) { members(idx) = elem }

  def apply(idx: Int): Member = members(idx)

  def length: Int = memberCount

  def get(id: Int): Member = {
    if (memberCount == 0) {
      throw new NoSuchElementException(s"ID not found: ${id}")
    }
    //println(s"id = $id")

    def helper(low: Int, high: Int): Int = {
      
      //println(s"$low < --- > $high")
      if (low == high && members(low).id != id) {
        throw new NoSuchElementException(s"ID not found: ${id}")
      }
      
      val n = (high - low) / 2 + low
      //println(s"compare id = ${members(n).id}")
      if (id > members(n).id) {
        //println("less")
        helper(low, n)
      } else if (id < members(n).id) {
        println("more")
        helper(n, high)
      } else {
        //println("equal")
        // equal
        n
      }
    }

    return members(helper(0, memberCount))
  }

  def +=(m: Member) = {
    if (memberCount + 1 >= members.length) {
      var tmp = members
      members = new Array(members.length * 2)
      for (i <- 0 until memberCount) {
        members(i) = tmp(i)
      }
    }

    var n = memberCount
    while (n > 0 && members(n - 1).id < m.id) {
      members(n) = members(n - 1)
      n -= 1
    }
    members(n) = m

    memberCount += 1

    this
  }

  def -=(id: Int) = {
    if (memberCount == 0) {
      throw new NoSuchElementException(s"ID not found: ${id} because the array is empty")
    }

    def helper(low: Int, high: Int): Int = {
      if (low == high && members(low).id != id) {
        throw new NoSuchElementException(s"ID not found: ${id}")
      }

      val n = (high - low) / 2 + low
      if (id > members(n).id) {
        helper(low, n)
      } else if (id < members(n).id) {
        helper(n, high)
      } else {
        // equal
        n
      }
    }
    var n = helper(0, memberCount)

    memberCount -= 1

    for (i <- n until memberCount) {
      members(i) = members(i + 1)
    }

    this
  }

  override def iterator = new Iterator[Member] {
    var index = 0
    def hasNext: Boolean = index < memberCount
    def next(): Member = members(index)
  }
}
