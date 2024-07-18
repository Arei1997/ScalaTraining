package SoloWork

object AddKeyValuePairsToMapExample {
  def main(args: Array[String]): Unit = {
    // Create an empty map
    var color = Map.empty[String, Int]

    // Add key-value pairs to the map
    color = color + ("Red" -> 1)
    color = color + ("Green" -> 2)
    color = color + ("Blue" -> 3)
    color = color + ("Orange" -> 4)

    // Print the map
    println(color.head)
  }
}

