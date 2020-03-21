object Covid19 {


    fun Symtoms(){

        println("Here's a list of Covid19 Symptoms")
        var list = mutableListOf<String>("fever", "cough", "shortness of breathe", "fatigue","aches", "runny nose", "sore throat")

        for(element in list){
            println(element)
        }




    }

    fun Complications(){

        var listcom = mutableListOf<String>("pneumonia in both lungs", "organ failure in several organs", "death")

        for(element in listcom){
            println(element)
        }
        println("We are very sorry")

    }


}
