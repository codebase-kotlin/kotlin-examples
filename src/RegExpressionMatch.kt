import java.util.regex.Pattern

/**
 * Created by aromal on 1/5/17.
 */



fun main(args : Array<String>) {


    val passwordMatches:String = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[$&+,:;=?@#|'<>.^*()%!-])(?=\\S+$).{4,}$"

    val pattern:Pattern = Pattern.compile(passwordMatches)

    val passwords = arrayListOf("Zaheer@123","Zaheer123!","Faya.123")

    passwords.forEach { password ->


        println("""Password $password ${if(pattern.matcher(password).matches()) "" else "doesn't"} have a match""")


    }



}