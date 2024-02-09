import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

public class User// Class body
    (penName: String, posts: MutableList<Post>, joinDate: String, password: String) {
    private var _penName: String = penName;
    private var _posts: MutableList<Post> = posts;
    private var _joinDate: String = joinDate;
    private var _password: String = password;

    fun createPost() : Post {
        /*
        Creates a post attached to a specific user.
        */
        print("Post title: ")

        val title = readln()

        print("Post text: ")

        val raw_text = readln()

        val filehandler = FileHandler(raw_text)

        var text = filehandler.readFile()

        print("Provide your sources: ")

        val sources = readln();

        val currentDatetime = LocalDateTime.now()

        val formatDate = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

        val formattedDate = currentDatetime.format(formatDate)

        val post = Post(title, formattedDate, _penName, sources, text)

        _posts.add(post)
        return post
    }

    fun createRebuttal(){

    }

    fun createComment(){

    }

    fun reviewPosts()
    {
        /*
        Displays posts in user account.
        */
        for (post in _posts){
            post.displayPost()
        }
    }

    fun displayAccountDetails()
    {
        /*
        Displays account details.
        */
        println("Hello, $_penName!")
        println(_posts)
        println(_joinDate)
        println(_password)
    }

    fun getPenName() : String {
        /*
        Returns the penname of an account.
        */
        return _penName
    }

    fun getPassword() : String {
        /*
        For testing purposes, this returns the password of an account.
        */
        return _password;
    }

}