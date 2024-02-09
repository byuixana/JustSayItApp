import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

public open class Database
    () {
    val _accountsSet = mutableSetOf<User>()

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

        val newUser = User(penName, mutableListOf(), formattedDate, password)
        println(newUser.getPassword())
        _accountsSet.add(newUser)

        println("User added!")
    }

    fun logIn() : User?{
        /*
        Has user log in and returns user account for session.
        */
        println("Log in to your account:")
        print("Penname:")

        val userpenName = readln();

        val userToFind = _accountsSet.find { it.getPenName() == userpenName }

        var verifiedUser : User? = User("", mutableListOf(), "", "")

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
        for (user in _accountsSet) {
            user.displayAccountDetails()
        }
    }
}