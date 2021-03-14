fun main() {
    text()
    data("Gilly",20)
    Strings("laugh")
    println("Gilly")
    act("Gilly")


}
fun text() {
    var text="akirachix"
    var first=text[0]
    var third=text[3]
    var fourth=text[4]
    println("$first$third$fourth")
}

fun data(name:String,age:Int){
    println("Hi my name is $name and am $age years old ")


}
fun Strings(word:String) {
    var stringLength=word.length
    println(stringLength)

}
fun act(name:String) {
    if(name=="Gilly"){
        println("That is me")
    }
    else{
        println("i don't know who that is")
    }
}
