public open class Post
    (title: String, wordCount: Int, postDate: String, user : User, sources:List<String>, text: List<String>) {
    var _title: String = title;
    var _wordCount: Int = wordCount;
    var _user: User = user;
    var _postDate: String = postDate;
    var _sources: List<String> = sources;
    var _text: List<String> = text;

        fun displayPost()
        {
            println(_title)
            println(_wordCount)
            println(_user)
            println(_postDate)
            println(_sources)
            println(_text)
        }


        fun countWords()
        {
            //This function is currently empty
        }

        fun readText()
        {

        }


        fun listRebuttals()
        {

        }

}
