public open class Post(title: String, postDate: String, user: String, sources: String, text: String) {
    var _title: String = title;
    var _user: String = user;
    var _postDate: String = postDate;
    var _sources: String = sources;
    var _text: String = text;
    var _wordCount : Int = 0;


    fun countWords() : Int{
        /*
        Counts the words within a string of text the user provides and returns a word count for a post.
        */

        val textList = _text.split(" ")
        print(textList)
        for (word in textList){
            _wordCount += 1;
        }

        return _wordCount
    }
        fun displayPost()
        {
            /*
            Displays post details.
            */
            println(_title)
            println(_user)
            println(_postDate)
            println(_sources)
            println(_text)
        }


        fun listComments(){

        }


        fun listRebuttals()
        {

        }

}
