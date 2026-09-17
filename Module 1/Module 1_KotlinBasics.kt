fun main() {
    // 1. Promotional Sale Program
    println("=== Promotional Sale ===")
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    println(offer)
    println()

    // 2. Party Size Program
    println("=== Party Size ===")
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
    println()

    // 3. Salary Program
    println("=== Salary ===")
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
    println()

    // 4. Basic Math Operations
    println("=== Math Operations ===")
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)
    val subtractionResult = subtract(firstNumber, secondNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    println("$firstNumber - $secondNumber = $subtractionResult")
    println()

    // 5. Gmail Alert Message
    println("=== Gmail Alerts ===")
    val firstUserEmailId = "user_one@gmail.com"
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"
    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"
    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()

    // 6. Pedometer Program
    println("=== Pedometer ===")
    val steps = 4000
    val caloriesBurned = stepsToCalories(steps)
    println("Walking $steps steps burns $caloriesBurned calories")
    println()

    // 7. Compare Two Numbers (Screen Time)
    println("=== Screen Time Comparison ===")
    val todayMinutes = 120
    val yesterdayMinutes = 150
    val isTodayMore = compareScreenTime(todayMinutes, yesterdayMinutes)
    println("Did I spend more time today than yesterday? $isTodayMore")
}

// Reusable functions
fun add(a: Int, b: Int): Int {
    return a + b
}

fun subtract(a: Int, b: Int): Int {
    return a - b
}

fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}

fun stepsToCalories(numberOfSteps: Int): Double {
    val caloriesPerStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesPerStep
    return totalCaloriesBurned
}

fun compareScreenTime(todayMinutes: Int, yesterdayMinutes: Int): Boolean {
    return todayMinutes > yesterdayMinutes
}
