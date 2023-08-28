fun main(){

    val testSteps = Steps()
    val run = RunTest()

    println("testSteps with testAcsses")
    run.runTest(testSteps){testSteps.testAcsses()}
    println()
    println("testSteps with testFail")
    run.runTest(testSteps){testSteps.testFail()}
    println()
    println("BeforeTwiceAndAfterTwiceTestClass")
    run.runTest(BeforeTwiceAndAfterTwiceTestClass()){testSteps.testAcsses()}
    println()
    println("BeforeAndAfterTestClass")
    run.runTest(BeforeAndAfterTestClass()){testSteps.testAcsses()}
    println()
    println("AfterOnlyTestClass")
    run.runTest(AfterOnlyTestClass()){testSteps.testAcsses()}
    println()
    println("BeforeOnlyTestClass")
    run.runTest(BeforeOnlyTestClass()){testSteps.testAcsses()}
    println()
    println("EmptyTestClass")
    run.runTest(EmptyTestClass()){testSteps.testAcsses()}
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
        println("******** The test was successful **********")
    }

    fun testFail(){
        println("******* Test fell ***********")
    }
}

class BeforeTwiceAndAfterTwiceTestClass {
    fun beforeFirst() {
        "before first".log()
    }


    fun afterFirst() {
        "after first".log()
    }

    fun beforeSecond() {

        "before second".log()
    }

    fun testTwiceTestClass1 () {

        "testTwiceTestClass_1".log()
    }

    fun afterSecond() {
        "after second".log()
    }
}

class BeforeAndAfterTestClass {
    fun beforeAlone() {
        "before".log()
    }

    fun afterAlone() {
        "after".log()
    }
}

class AfterOnlyTestClass {
    fun afterOnly() {
        "after".log()
    }
}

class BeforeOnlyTestClass {
    fun beforeOnly() {
        "before".log()
    }
}

class EmptyTestClass

// функция расширения для String с именем .log приименяется см выше
fun String.log() {
    println("-> $this running...")
}
