class Member(private var firstName: String, private var lastName: String, private var email: String, private grade: Int, private birthday: String)
{ 
    private var comments: List[Comment] 
    private var numberOfSemesters = 1 
    def getFirstName: String = firstName 
    def getLastName: String = lastName
    def getName: String = firstName + lastName
    def getEmail: String = email 
    def getGrade: String = grade 
    def getBirthday: String = birthday
    def getNumberOfSemesters: String = numberOfSemesters
    def getComments: String = comments.toString("/n") // I am not sure id defining a toString for the comment class is the correct thing to do!! 
    def getLastComment: String = comments.last //do I need to add a .toString because the last item is of type comment??

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
    def addComment(comment: Comment): Unit = 
    {
        comments::comment
    }
    

    private var myPoints: MemberPoints = new MemberPoints() //should this be a var or a val? if this is referencing an instance of a object 

    private var myEvents:List[EventNameAndPoints] 

}