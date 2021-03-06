class Hamming(strand1: String, strand2: String) {
	
  require(strand1.length == strand2.length)

  def distance = commonPairs.count {
    case (a, b) => a != b
  }

  private def commonPairs = strand1.zip(strand2)
}

object Hamming {
  def compute(strand1: String, strand2: String) =
    new Hamming(strand1, strand2).distance
}
