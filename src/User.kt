import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

public class User// Class body
    (penName: String, posts: MutableList<Post>, rebuttals: MutableList<Rebuttal>, joinDate: String, password: String) {
    private var _penName: String = penName;
    private var _posts: MutableList<Post> = posts;
    private var _rebuttals : MutableList<Rebuttal> = rebuttals;
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

    fun createRebuttal(database: Database) : Rebuttal? {
        /*
        Creates a rebuttal attached to a specific post a user created.
        */
        print("Rebuttal title: ")

        val title = readln()

        print("Post text: ")

        val raw_text = readln()

        val filehandler = FileHandler(raw_text)

        var text = filehandler.readFile()

        print("Post to refute: ")

        var originalPost = readln()

        print("User to refute: ")

        var usertoRefute = readln()

        var post = database.getOriginalPost(originalPost, usertoRefute)

        print("Provide your sources: ")

        val sources = readln();

        val currentDatetime = LocalDateTime.now()

        val formatDate = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

        val formattedDate = currentDatetime.format(formatDate)

        val rebuttal = post?.let { Rebuttal(title, formattedDate, _penName, sources, text, it) }

        if (rebuttal != null) {
            _rebuttals.add(rebuttal)
        }

        return rebuttal
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

        for (rebuttal in _rebuttals)
        {
            rebuttal.displayRebuttal()
        }
    }

    fun displayAccountDetails()
    {
        /*
        Displays account details.
        */
        println("Hello, $_penName!")
        println(_posts)
        println(_rebuttals)
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

    fun getPosts() : List<Post>
    {
        return _posts
    }

}