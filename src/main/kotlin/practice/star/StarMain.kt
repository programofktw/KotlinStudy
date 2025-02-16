package practice.star

import java.util.Scanner;

fun main(args:Array<String>){
    var scan : Scanner = Scanner(System.`in`);
    var star : StarInterface = Star1()
    var input : Int = scan.nextInt();
    star.printStar(4);
}