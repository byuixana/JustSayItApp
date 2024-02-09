//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val database = Database()

    var currentUser = User("", mutableListOf(), "", "")

    var loggedIn : Boolean = false

    while(!loggedIn)
    {
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
            3. Leave comment
            5. View your posts
        """.trimIndent()

        print(">")

        var userSelection = readln()

        if (userSelection == "1"){
            currentUser.createPost()
            currentUser.reviewPosts()
        }





    }

}