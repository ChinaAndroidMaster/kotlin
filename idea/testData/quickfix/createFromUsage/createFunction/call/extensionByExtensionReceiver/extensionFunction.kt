// "Create extension function 'foo'" "true"
fun bar(b: Boolean) {

}

class A(val n: Int)

fun A.test() {
    bar(<caret>foo(n))
}