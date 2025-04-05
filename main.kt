fun main() {
    val board = listOf(
        listOf(1, 3, 4),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )
    println(isValidSudoku(board))
}

fun isValidSudoku(board: List<List<Int>>): Boolean {
    for (row in board) {
        val seen = mutableSetOf<Int>()
        for (num in row) {
            if (num in seen) {
                return false
            }
            seen.add(num)
        }
    }
    return true
}