package Main

class Event (private var eventName: String, private var typeOfPoint: String /*PointType*/, private var sameValueOfPointsPerMember: Boolean, private var date: String, private var membersAttending: List[Member] /* should this be a list of Members or a list of the student ids <- Member will make this more reliable (names aren't unique) -jr*/ )
{
    def getName: String = eventName
    def getPointType: String /*PointType*/ = typeOfPoint //Should the pointType be of the class pointType or should it be string?
    def getDate: String = date 
    def getListOfMembersAttending: List[Member] = membersAttending // Should I return a list of student names or should I return a list of EventNameAndPoints???
    
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
    def setMembersAttending(newStudentList: List[Member]): Unit =
    {
        membersAttending = newStudentList
    }
    def addMoreMembers(newStudentList: List[Member]): Unit =
    {
        membersAttending = membersAttending ::: newStudentList
    }
    def individualValuePerStudent(studentList: List[Member]):Unit =
    {
        //FINISH
    }
    def allSameValue(studentList: List[Member]):Unit =
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