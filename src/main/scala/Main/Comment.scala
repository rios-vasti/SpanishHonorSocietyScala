package Main

class Comment(private var date: String, private var title: String, private var comment: String)
{
    def getDate: String = date 
    def getTitle: String = title 
    def getComment:String = comment

    def setDate(newDate: String): Unit = date = newDate
    def setTitle(newTitle: String): Unit = title = newTitle
    def setComment(newComment: String): Unit = comment = newComment

    override def toString(): String = title + "/n" + date + "/n" + comment
}