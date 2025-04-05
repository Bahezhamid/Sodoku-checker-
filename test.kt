
fun main() {
    val board1 = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )

    val board2 = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 4),
        listOf(7, 8, 9)
    )

    val board3 = listOf(
        listOf(1, 2, 2),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )

    val board4 = listOf(
        listOf(1, 1, 1),
        listOf(2, 2, 2),
        listOf(3, 3, 3)
    )

    val board5 = listOf(
        listOf(9, 8, 7),
        listOf(6, 5, 4),
        listOf(3, 3, 1)
    )

    val board6 = listOf(
        listOf(1, 2, 3),
        listOf(3, 2, 1),
        listOf(1, 2, 3)
    )

    val board7 = listOf(
        listOf(0, 0, 0),
        listOf(1, 2, 3),
        listOf(4, 5, 6)
    )

    val board8 = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(1, 1, 2)
    )

    test("Valid Board 1", isValidSudoku(board1).toString(), "true")
    test("Duplicate in Row 2", isValidSudoku(board2).toString(), "false")
    test("Duplicate in Row 1", isValidSudoku(board3).toString(), "false")
    test("All Values Duplicated per Row", isValidSudoku(board4).toString(), "false")
    test("Duplicate in Row 3", isValidSudoku(board5).toString(), "false")
    test("Same Values in Different Rows", isValidSudoku(board6).toString(), "true")
    test("Zero Values Only", isValidSudoku(board7).toString(), "false")
    test("Duplicate at End", isValidSudoku(board8).toString(), "false")
}


fun test(name : String , result : String , correctResult : String) {
    if (result == correctResult) {
        println("Success: $name")
    }
    else {
        println("Fail: $name")
    }
}