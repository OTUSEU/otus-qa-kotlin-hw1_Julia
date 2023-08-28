fun main(){

    val testSteps = Steps()
    val run = RunTest()

    run.runTest(testSteps){testSteps.testAcsses()}
    run.runTest(testSteps){testSteps.testFail()}

}

class Steps {

    fun beforeAll(){
        println("Before started")
    }

    fun beforePrecondition(){
        println("Preconditions met")
    }

    fun afterAll(){
        println("After started")
    }

    fun afterClear(){
        println("All is clear")
    }

    fun testAcsses(){
        println("The test was successful")
    }

    fun testFail(){
        println("Test fell")
    }
}
