class Member(private var firstName: String, private var lastName: String, private var email: String, private var grade: Int, private var birthday: String)
{ 
    private var comments: List[Comment] 
    private var numberOfSemesters = 1 
    private var myPoints: MemberPoints = new MemberPoints() //should this be a var or a val? if this is referencing an instance of a object 
    private var myEvents:List[EventNameAndPoints] // FINISH need to add a function for adding a new event to the lsit of events

    def getFirstName: String = firstName 
    def getLastName: String = lastName
    def getName: String = firstName + lastName
    def getEmail: String = email 
    def getGrade: Int = grade
    def getBirthday: String = birthday
    def getNumberOfSemesters: Int = numberOfSemesters
    def getComments: String = comments.toString() // I am not sure id defining a toString for the comment class is the correct thing to do!! 
    def getLastComment: String = comments.last.toString

    def setNumberOfSemesters( newNumberOfSemsters: Int):Unit = 
    {
        numberOfSemesters = newNumberOfSemsters
    }
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
    def increaseNumberOfSemesters(): Unit = 
    {
        numberOfSemesters += 1
    }
    def addComment(newComment: Comment): Unit = 
    {
       // comments::newComment //Need to fix
    }
    


}