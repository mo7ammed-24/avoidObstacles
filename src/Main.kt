fun main() {

}

fun avoidObstacles(inputArray: MutableList<Int>): Int {
    var min:Int
    var mylist=mutableListOf<Int>()
    var max=inputArray[0]
    for(item in inputArray)
        if(item>max)
            max=item

    for(i in 2 ..1010){
        var flag=true
        for(j in 0 until max.plus(1000) step(i))
            if(j in inputArray){
                flag =false
                break
            }

        if(flag==true){
            mylist.add(i)
        }}
    min=mylist[0]

    for(item in mylist)
        if(item<min)
            min=item

    return min
}
