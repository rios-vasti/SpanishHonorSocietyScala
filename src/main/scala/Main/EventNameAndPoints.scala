class EventNameAndPoints( private var name: String, private var numPoints: Double)
{
    def getName:String = name 
    def getNumPoints: Double = numPoints

    def setName(newName: String): Unit = name = newName
    def setNumPoints(newPoints: Double) : Unit = numPoints = newPoints
}