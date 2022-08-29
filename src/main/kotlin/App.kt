class App {

    private fun printWelcomeMessage() {
        println("====================")
        println("Hello World")
        println("====================")
    }

    fun run() {
        printWelcomeMessage()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            App().run()
        }
    }
}