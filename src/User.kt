public class User// Class body
    (penName: String, posts: List<Post>, joinDate: String, password: String) {
    private var _penName: String = penName;
    private var _posts: List<Post> = posts;
    private var _joinDate: String = joinDate;
    private var _password: String = password;

    fun makePost()
    {
       //

    }

    fun reviewPosts()
    {
        //This function is currently empty
    }

    fun displayAccountDetails()
    {
        println("Hello, $_penName!")
        println(_posts)
        println(_joinDate)
        println(_password)
    }

}