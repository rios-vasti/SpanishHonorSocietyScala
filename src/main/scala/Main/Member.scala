class Member(private var firstName: String, private var lastName: String, private var email: String, private grade: Int, 
private birthday: String)
{ 
    def getFirstName: String = firstName 
    def getLastName: String = lastName
    def getName: String = firstName + lastName
    def getEmail: String = email 
    def getGrade: String = grade 
    def getBirthday: String = birthday

    def setFirstName(newFirstName: String): Unit = 
    {
        firstName = newFirstName
    }
    def setLastName(newLastName: String): Unit = 
    {
        lastName = newLastName
    }
    def setEmail(newEmail: String): Unit = 
    {
        email = newEmail
    }
    def setGrade(newGrade:Int): Unit = 
    {
        grade = newGrade
    }
    def setBirthday(newBirthday:String): Unit = 
    {
        birthday = newBirthday
    }

    def increaseGrade(): Unit =
    {
        grade += 1 
    }

    private var myPoints: MemberPoints = new MemberPoints() //should this be a var or a val? if this is referencing an instance of a object 

    private var myEvents:List[EventNameAndPoints] 

}