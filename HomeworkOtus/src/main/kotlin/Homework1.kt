interface TestRunner {
    fun runTest(steps: T, test: () -> Unit)
}

class T {

}

class groupTest() : TestRunner {

    override fun runTest(steps: T, test: () -> Unit) {
        fun beforeTest(){

        }

        fun test(){

        }

        fun afterTest(){

        }
    }

}


