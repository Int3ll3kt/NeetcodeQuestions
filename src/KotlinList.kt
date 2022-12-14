
package com.int3ll3kt.kotlinpractice.examples
class KotlinList {
    val P1 = Person("Ade", 'M', 18)
    val People: List<Person> = listOf(P1,
        Person("Ak", 'M', 24),
        Person("Ay", 'M', 25), )



}

class Person(val name: String, var gender: Char, var age: Int) {
}