package internal

class ConcreteMember(private val _givenName: String, private val _lastName: String, private val _id: Int) extends Member {
  def givenName = _givenName
  def lastName = _lastName
  def id = _id
  override def toString(): String = s"Member(id=$id)"
}
