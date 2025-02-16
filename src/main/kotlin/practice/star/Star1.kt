package practice.star

class Star1 : StarInterface {
    override fun printStar(s: Int) {

        for(i :Int in 0..s step(1)){
            for(j : Int in 0..s step(1)){
                print("*")
            }
            println(" ")
        }
    }
}