fun main(args : Array<String>) {

    var sym : String = "Symptoms"
    var com : String = "Complications"
    //var covid : Covid19? = null

    println("Welcome to the Covid19 Symtoms check")
    println("What would you like to know?")
    println("press 1 for $sym or press 2 for  $com")

    var keyword = readLine()


    if (keyword.equals("1")){
        Covid19.Symtoms()
    }else if (keyword.equals("2")){
        Covid19.Complications()
    }











}