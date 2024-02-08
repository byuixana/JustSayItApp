
import Post

class Rebuttal
   (title: String, wordCount: Int, postDate: String, user : User, sources:List<String>, text : List<String>, originalPost : Post):
   Post(title, wordCount, postDate, user, sources, text) {
      var _originalPost = originalPost
   fun displayRebuttal()
   {
      println(_title)
      println(_wordCount)
      println(_user)
      println(_postDate)
      println(_sources)
      println(_text)
      println(_originalPost)
   }
   }
    //Put variable for originalPost
    //
//}