import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
fun main(args:Array<String>){
    val now=LocalDateTime.now()
    val formatter=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
    val formated=now.format(formatter)
    println("Current Date and Time: $formated")//formatted time.
    println("Current Date and Time is: $now")
}
