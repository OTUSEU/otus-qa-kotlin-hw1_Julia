import mu.KotlinLogging
import kotlin.reflect.full.declaredFunctions

interface TestRunner {
    fun <T> runTest(steps: T, test: () -> Unit)
}

class RunTest: TestRunner {

    private val logger = KotlinLogging.logger {}

    override fun <T> runTest(steps: T, test: () -> Unit) {

        val beforeStep = steps!!::class.declaredFunctions.filter {
            it.name.contains("before")
        }
        beforeStep.forEach { step -> step.call(steps).apply {
                logger.info("${step.name}() GO")
            }
        }

        val afterStep = steps!!::class.declaredFunctions.filter {
            it.name.contains("after")
        }

        afterStep.reversed().forEach { step -> step.call(steps).apply {
                logger.info("${step.name}() GO")
            }
        }

        steps.apply {
            test()
        }

    }

}


