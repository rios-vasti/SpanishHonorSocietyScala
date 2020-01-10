class Event (private var eventName: String, private var typeOfPoint: PointType, private var sameValueOfPointsPerMmeber: Boolean, 
private var date: String, private var membersAttending: List[EventNameAndPoints] )
{
    def getName: String = eventName
    def getPointType: PointType = typeOfPoint
    def getDate: String = date 
    def getListOfMembersAttending: List[EventNameAndPoints] = membersAttending // Should I return a list of student names or should I return a list of EventNameAndPoints???
    
    def setName(newName: String): Unit =
    {
        eventName = newName
    }

    def setTypeOfPoint(newTypeOfPoint: PointType): Unit =
    {
        typeOfPoint = newTypeOfPoint
    }
    
    def setDate(newDate: String): Unit = 
    {
        date = newDate
    }
    def setsameValueOfPointsPerMmeber(allSame: Boolean): Unit = 
    {
        sameValueOfPointsPerMmeber = allSame
    }
    def setMembersAttending(newStudentList: List[EventNameAndPoints]): Unit =
    {
        membersAttending = newStudentList
    }
    def addMoreMmebers (newStudentList: List[EventNameAndPoints]): Unit =
    {
        membersAttending = membersAttending ::: newStudentList
    }
    def individualValuePerStudent(studentList: EventNameAndPoints):Unit =
    {
        //FINISH
    }
    def allSameValue(studentList: EventNameAndPoints):Unit =
    {
        //FINISH
    }
    if (sameValueOfPointsPerMmeber)
    {
        allSameValue(studentList)
    }
    else 
    {
        allSameValue(studentList)
    }

    
}