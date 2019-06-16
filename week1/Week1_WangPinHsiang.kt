/**
 * Remote assignment _Week1
 * Wang Pin Hsiang
 */

open class Human(val name: String, var mana: Int = 100) {
    open fun attack() {
        println("$name use Fist Attack!")
    }
    fun remainingMana() {
        if (mana < 1) println("$name is out of Mana")
        else {
            println("Remaining Mana ($name): $mana")
        }
    }
}
class Mage(name: String, mana: Int): Human(name, mana) {
    override fun attack() {
        println("$name use Fireball!")
    }
}

fun main(args: Array<String>) {
    var saitama = Human("Saitama")
    saitama.attack()
    saitama.remainingMana()
    var genos = Mage("Genos",0)
    genos.attack()
    genos.remainingMana()
}