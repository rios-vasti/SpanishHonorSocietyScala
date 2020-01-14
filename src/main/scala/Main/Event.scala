class Event (private var eventName: String, private var typeOfPoint: String /*PointType*/, private var sameValueOfPointsPerMember: Boolean, private var date: String, private var membersAttending: List[String] /* should this be a list of Members or a list of the student ids*/ )
{
    def getName: String = eventName
    def getPointType: String /*PointType*/ = typeOfPoint //Should the pointType be of the class pointType or should it be string?
    def getDate: String = date 
    def getListOfMembersAttending: List[EventNameAndPoints] = membersAttending // Should I return a list of student names or should I return a list of EventNameAndPoints???
    
    def setName(newName: String): Unit =
    {
        eventName = newName
    }

    def setTypeOfPoint(newTypeOfPoint: String /*PointType*/): Unit =
    {
        typeOfPoint = newTypeOfPoint
    }
    
    def setDate(newDate: String): Unit = 
    {
        date = newDate
    }
    def setSameValueOfPointsPerMember(allSame: Boolean): Unit = 
    {
        sameValueOfPointsPerMember = allSame
    }
    def setMembersAttending(newStudentList: List[String]): Unit =
    {
        membersAttending = newStudentList
    }
    def addMoreMembers (newStudentList: List[String]): Unit =
    {
        membersAttending = membersAttending ::: newStudentList
    }
    def individualValuePerStudent(studentList: List[String]):Unit =
    {
        //FINISH
    }
    def allSameValue(studentList: List[String]):Unit =
    {
        //FINISH
    }
    if (sameValueOfPointsPerMember)
    {
        allSameValue(membersAttending)
    }
    else 
    {
        allSameValue(membersAttending)
    }

    
}