var globalVar : Int = 5

fun addNumbers(num1 : Int, num2 : Int) : Int {
    var result = num1 + num2 
    return result 
}

fun isEven(num : Int){
    if(num % 2 == 0){
        println("$num is Even")
    }
    else{
        println("$num is Odd")
    }
}


fun main() {
  println("## Introduction to Kotlin")
  
  
  

 var firstName : String ? = "Ram"
 val secondName : String = "Kumar"
 firstName ="Shyam"
 //secondName = "Das"
 //firstName = null
  
  println(globalVar)
  
  
  if(firstName == null){
      firstName = "Ram"
  }
  else{
      firstName = "Shyam"
  }
  
  println(firstName)
  
  var alphabet : Char 
  
    alphabet = 'e'
    when(alphabet){
        'a' -> println("Vowel")
        'e' -> println("Vowel")
        'i' -> println("Vowel")
        'o' -> println("Vowel")
        'u' -> println("Vowel")
        else -> println("Not Vowel")
        
    } 
    
    //firstName = if(firstName == "Shyam") "Ram" else "Shyam"
    
    firstName = when(firstName){
        "Shyam" -> "Ram"
        else -> "Shyam"
    }
    
    println(firstName)
    
    
    var n : Int 
    n = 20
    for(num in 1..n){
        print(num)
        print(' ')
    }
    var num = 1
    while(num <= n){
        print(num)
        print(' ')
        num ++
    }
    println()
    println(addNumbers(4, 5))
    isEven(7) 
    
    var arr = arrayOf(1, 2, 3)
    
    println(arr.size) 
    
    println(arr.get(1))
    
    arr.set(1, 4)
    println(arr[1])
    
     
    var list = listOf(1, 2, 3, "Hello Kotlin", "Android", true) 
    
    println(list.get(4))
    
    println(list.size)
    
    //list[2] = 4
    
    
    var mutableList = mutableListOf(1, 2, 3, "Hello Kotlin", "Android", true)
    
    mutableList[2] = 4     
    
    
    for(index in mutableList.indices){
        print(mutableList[index])
        print(' ')
    }
    println()
    var index = 0
    while(index < list.size){
        print(list[index])
        print(' ')
        index ++
    }
    
}