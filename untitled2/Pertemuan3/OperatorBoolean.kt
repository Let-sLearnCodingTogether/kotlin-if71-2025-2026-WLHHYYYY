fun main() {
    val quizPoint = 50
    val finalExamPoint = 70

    val passQuiz = quizPoint > 80
    val passFinalExam = finalExamPoint > 90

    val pass = passQuiz && passFinalExam

    println("You : $pass")
}