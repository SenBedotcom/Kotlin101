import org.w3c.dom.Text

fun main(args: Array<String>) {
//    var ten = 10
//    println("ten = $ten")
    val n1 = Person("beta", 1)
    println(n1.name)
//    println(sum(1,1))
//    var x = 1
//    var y = 2
//    if (x > y) {
//        println(x)
//    } else if (x < y){
//        println("This is $y")
//    } else {
//        println("End")
//    }
//    when(x) {
//        1 -> println("one")
//        2 -> println("two")
//    }



    val items = listOf("apple", "orange", "longong")
//    for (item in items) {
//        println(item)
//    }

//    for (index in items.indices){
//        println("Index:$index is ${items[index]}")
//    }
    val notNullText: String = "null"
    val nullableText1: String? = "Might be null"
    val nullableText2: String? = null
    funny(nullableText2)
    println(nullableText2)

    val a:String? = "Hello"
    val b:String? = null
    println(a?.length)
    println(b?.length)

    val fieldA: String? = null

    if(fieldA != null){
        println("Hello ${fieldA}")
    }

    fieldA?.let { println("Hello $it") }
}

fun funny(text: String?) {
    if (text != null)
        println(text)
    else
        println("Nothing to print ;(")
}

fun sum1(x: Int, y: Int) :Int{
    return x+y
}

fun sum2(x: Int, y: Int) = x + y


data class Person(var name:String, var Id:Int)
//fun main(){
//    fizzbuzzcheck(30)
//}
//fun fizzbuzzcheck(n:Int):Unit{
//    if(n%3==0 && n%5==0){
//        println("fizzbuzz")
//    }
//    else if(n%3==0){
//        println("fizz")
//    }
//    else if(n%5==0){
//        println("buzz")
//    }
//}
//fun cal(n:Int){
//    if(n%3==0&&n%5==0){
//        print("buzz fizz")
//    }else if(n%5==0){
//        print("fizz")
//    }else if(n%3==0){
//        print("fizz")
//    }
//}

fun fizzBuzz(x: Int): Unit{
    if(x % 15 == 0){
        print("Fizz Buzz")
    } else if(x % 3 == 0){
        print("Fizz")
    } else {
        print("Buzz")
    }
}