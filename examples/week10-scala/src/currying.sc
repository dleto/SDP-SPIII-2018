def concatenator(w1: String): String => String = w2 => w1 +" "+ w2

val hello = concatenator("Hello")

hello("World!")

def concat(w1: String)(w2: String) = w1 + " " + w2

concat("Hello")("World")

val h = concat("Hello")_

h("World")

def con(a: String, b: String)(c: String) = a + " " + b + " " + c

val one = con("A", "B")_

one("C")

val two = con(_:String, _: String)("Z")

two("X","Y")

def twice[A](op: A => A, x: A) = op(op(x))

twice((x:Int) => x * x, 3)

var x = 3

def fun(): Int => Int = xx => x + xx

fun()(3)

x = 10

fun()(3)

