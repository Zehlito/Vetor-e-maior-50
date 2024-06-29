fun main() {

        val limits : Int = 6
        val myVector : DoubleArray = DoubleArray(limits)
        var moreThan50 : Int = 0


        for (i in 0..<limits)
        {
            print("Informe um valor para a posição [$i]: ")
            myVector[i] = readLine()!!.toDouble()
        }
        for (i in 0..<limits)
        {
            if (myVector[i] > 50)
            {
                moreThan50++
            }

        }
        if (moreThan50 > 0)
        {
            println("Foram encontrados $moreThan50 valores maior que 50 ")
        }else
        {
            println("Não foram encontrados  valores maior que 50 ")
        }

}