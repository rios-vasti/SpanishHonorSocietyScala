class Comment(private var date: String, private var tittle: String, private var comment: String)
{
    def getDate: String = date 
    def getTittle: String = tittle 
    def getComment:String = comment

    def setDate(newDate: String): Unit = date = newDate
    def setTittle(newTittle: String): Unit = tittle = newTittle
    def setComment(newComment: String): Unit = comment = newComment

    override def toString(): String = tittle + "/n" + date + "/n" + comment
}