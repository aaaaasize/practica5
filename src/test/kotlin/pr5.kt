fun main(){
    println ("Введите число: ")
    val n = readLine().toString().toInt()
    var s = 0
    var m = 0
    for (i in 1..n)
    {
        s+=s+i
        m+= n * (n+1)/2
    }
    println(s)
    println(m)
    if (s==m)
    {
        println("Доказано, что они числа равные")
    }
    else
    {
        println("Опровергнуто, что числа равные")
    }
}