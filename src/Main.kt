fun main(args: Array<String>) {
    val kangaroo: AnimalBehaviour = KangarooBehaviour()
    kangaroo.eat()
    kangaroo.travel()

    val cat: AnimalBehaviour = Cat()
    cat.eat()
    cat.travel()
}