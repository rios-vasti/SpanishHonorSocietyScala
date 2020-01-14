package internal

import java.util.NoSuchElementException

import Main.Member

/**
 * A class to store a list of Members
 * 
 * The class has no arguments when created 
 * as the array is not of fixed size
 * 
 * @constructor Create a new expandable array of Members
 * @author Jonathan Rotter
 * @version 1.0
 * 
 */ 
class MemberArray extends scala.collection.mutable.IndexedSeq[Member] {

  private var members: Array[Member] = new Array(16)
  private var memberCount: Int = 0

  /** 
   * @param idx The index of the array being set to `elem`
   * @param elem The value to set the array at `idx`  
   */
  def update(idx: Int, elem: Member): Unit = { members(idx) = elem }

  /** 
   * @return The element at index `idx`
   * @param idx The index of the array to get
   */
  def apply(idx: Int): Member = members(idx)

  /** 
   * @return The number of members in the array currently
   */
  def length: Int = memberCount

  /**
   * @throws NoSuchElementException Throws an exception if `id` is not found in the array
   * @return Returns the instance of `Member` with the given `id`
   * @param id The id number of the `Member` to look for
   */
  @throws(classOf[NoSuchElementException])
  def get(id: Int): Member = {
    if (memberCount == 0) {
      throw new NoSuchElementException(s"ID not found: ${id}")
    }
    //println(s"id = $id")

    def helper(low: Int, high: Int): Int = {
      
      //println(s"$low < --- > $high")
      if (low == high && members(low).getID != id) {
        throw new NoSuchElementException(s"ID not found: ${id}")
      }
      
      val n = (high - low) / 2 + low
      //println(s"compare id = ${members(n).getID}")
      if (id > members(n).getID) {
        //println("less")
        helper(low, n)
      } else if (id < members(n).getID) {
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

  /**
   * @param m The `Member` to add to the array. Expands the array if full
   * @return Returns itself
   */
  def +=(m: Member) = {
    if (memberCount + 1 >= members.length) {
      var tmp = members
      members = new Array(members.length * 2)
      for (i <- 0 until memberCount) {
        members(i) = tmp(i)
      }
    }

    var n = memberCount
    while (n > 0 && members(n - 1).getID < m.getID) {
      members(n) = members(n - 1)
      n -= 1
    }
    members(n) = m

    memberCount += 1

    this
  }

  /**
   * @throws NoSuchElementException Throws an exception if the `id` is not found
   * @param id The `id` of the `Member` to remove from the array
   * @return Returns itself
   */
  @throws(classOf[NoSuchElementException])
  def -=(id: Int) = {
    if (memberCount == 0) {
      throw new NoSuchElementException(s"ID not found: ${id} because the array is empty")
    }

    def helper(low: Int, high: Int): Int = {
      if (low == high && members(low).getID != id) {
        throw new NoSuchElementException(s"ID not found: ${id}")
      }

      val n = (high - low) / 2 + low
      if (id > members(n).getID) {
        helper(low, n)
      } else if (id < members(n).getID) {
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


  /**
   * @return Returns an iterator of `Member`
   */
  override def iterator = new Iterator[Member] {
    var index = 0
    def hasNext: Boolean = index < memberCount
    def next(): Member = members(index)
  }
}
