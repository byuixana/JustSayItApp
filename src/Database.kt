import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

public open class Database
    () {
    val users = mutableSetOf<User>()
    
    fun addPreviousUsers(){

        /*
        Temporary function that loads users to the Set automatically.
        */
        users.add(User("Jack12", mutableListOf(Post("Penguins Can Someday Fly", "2024-2-09", "Jack12", "ChatGPT", "PenguinsCanSomedayFly.txt")), mutableListOf(), "2023-12-24", "password"))
        users.add(User("AliceinWonderland", mutableListOf(), mutableListOf(),"2023-06-15", "123456"))
        users.add(User("BobtheBuilder", mutableListOf(), mutableListOf(), "2022-09-30", "qwerty"))
        users.add(User("EmilyDickens", mutableListOf(), mutableListOf(),"2024-02-10", "password123"))
        users.add(User("MichaelJackson", mutableListOf(), mutableListOf(),"2022-11-28", "abc123"))
    }

    fun createAccount(){

        /*
        Creates user account.
        */
        println("Enter your info below:")
        print("Penname: ")

        val penName = readln();

        print("Enter your password: ")

        val password = readln()

        val currentDatetime = LocalDateTime.now()

        val formatDate = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

        val formattedDate = currentDatetime.format(formatDate)

        val newUser = User(penName, mutableListOf(), mutableListOf(), formattedDate, password)
        println(newUser.getPassword())
        users.add(newUser)

        println("User added!")
    }

    fun logIn() : User?{
        /*
        Has user log in and returns user account for session.
        */
        println("Log in to your account:")
        print("Penname:")

        val userpenName = readln();

        val userToFind = users.find { it.getPenName() == userpenName }

        var verifiedUser : User? = User("", mutableListOf(), mutableListOf(),"", "")

        if (userToFind != null) {
            println(userToFind.getPassword())

            print("Enter your password:")

            val password = readln()

            if (userToFind.getPassword() == password) {
                 verifiedUser = userToFind
            } else {
                verifiedUser = null
            }
        }else{
            println("Account not found")
        }
        return verifiedUser
    }

    fun displaySet(){
        /*
        A testing function to ensure accounts have been added to the set. Displays user accounts
        */
        for (user in users) {
            user.displayAccountDetails()
        }
    }

    fun getOriginalPost(originalPost : String, userpenName : String) : Post?{

        var foundPost : Post? = Post("","","","", "");

        val userToFind = users.find { it.getPenName() == userpenName }

        if (userToFind != null){
            val posts = userToFind?.getPosts()
                for (post in posts!!){
                    if (post.getTitle() == originalPost){
                        foundPost = post
                    }
            }
        }else{
            foundPost = null
        }
        return foundPost
    }
}