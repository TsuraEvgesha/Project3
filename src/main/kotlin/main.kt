fun main() {
    val likes: Int = 921
    val cheloveky = likes % 10
    val ludey = likes % 100
    if (likes===1 || cheloveky ===1) {
        println("Понравилось $likes человеку")
    } else if(ludey===0)println("Поставили лайк $likes людей")
    else println("Понравилось $likes людям")

}