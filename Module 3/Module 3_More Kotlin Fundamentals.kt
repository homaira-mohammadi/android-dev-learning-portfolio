// Module 3 – More Kotlin Fundamentals

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int,
)

enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING,
}

fun main() {
    // Task 1 & 2: Create events
    val event1 = Event(
        title = "Wake up",
        description = "Get ready for the day",
        daypart = Daypart.MORNING,
        durationInMinutes = 30
    )

    val event2 = Event(
        title = "Study Kotlin",
        description = "Learn Kotlin programming",
        daypart = Daypart.MORNING,
        durationInMinutes = 60
    )

    val event3 = Event(
        title = "Lunch",
        description = "Have lunch",
        daypart = Daypart.AFTERNOON,
        durationInMinutes = 45
    )

    val event4 = Event(
        title = "Exercise",
        description = "Go for a workout",
        daypart = Daypart.AFTERNOON,
        durationInMinutes = 50
    )

    val event5 = Event(
        title = "Dinner",
        description = "Have dinner",
        daypart = Daypart.EVENING,
        durationInMinutes = 30
    )

    val event6 = Event(
        title = "Read",
        description = "Read a book",
        daypart = Daypart.EVENING,
        durationInMinutes = 90
    )

    // Task 3: Create a list of events
    val events = mutableListOf<Event>(
        event1, event2, event3, event4, event5, event6
    )

    // Task 4: Filter short events
    val shortEvents = events.filter { it.durationInMinutes < 60 }
    println("You have ${shortEvents.size} short events.")

    // Task 6: Group events by daypart
    val groupedEvents = events.groupBy { it.daypart }
    groupedEvents.forEach { (daypart, events) ->
        println("$daypart: ${events.size} events")
    }

    // Task 8: Duration property extension
    println("First event is ${event1.durationOfEvent}")
    println("Second event is ${event2.durationOfEvent}")
}

// Task 8: Extension property for event duration
val Event.durationOfEvent: String
    get() = if (durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }
