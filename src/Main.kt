//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    /*Creates database to be user throughout the session*/
    val database = Database()

    database.addPreviousUsers()

    /*Creates empty user*/

    var currentUser = User("", mutableListOf(), mutableListOf(), "", "")

    /*Sets the ending and beginning conditions*/

    var loggedIn : Boolean = false

    /*Runs as long as the user is not logged in.*/

    while(!loggedIn)
    {
        /*Checks is user needs to create an account*/
        print("Do you need to create an account? (Y/N)")
//
        val createAccount = readln()
//
        if (createAccount == "Y") {
            database.createAccount()
        }
        else if (createAccount == "N")
        {
            currentUser = database.logIn()!!
            loggedIn = true
        }
    }

    var userSessionDone : Boolean = false

    while(!userSessionDone)
    {
        val menu = """
            Select an option
            1. Create post
            2. Write rebuttal
            3. View your posts
            4. Log out
        """.trimIndent()

        println(menu)

        print(">")

        var userSelection = readln()

        if (userSelection == "1"){
            currentUser.createPost()
            currentUser.reviewPosts()
        }
        else if (userSelection == "2"){
            var rebuttal = currentUser.createRebuttal(database)
            if (rebuttal != null) {
                rebuttal.displayRebuttal()
            }
        }
        else if(userSelection == "3"){
            currentUser.reviewPosts()
        }
        else{
            userSessionDone = true
        }


    }

}