class Rebuttal
   (title: String, postDate: String, user : String, sources: String, text : String, originalPost : Post):
   Post(title, postDate, user, sources, text) {
   var _originalPost = originalPost
   fun displayRebuttal()
   {
      println(_title)
      println(_wordCount)
      println(_user)
      println(_postDate)
      println(_sources)
      println(_text)
      println(_originalPost.getTitle())
   }


}



