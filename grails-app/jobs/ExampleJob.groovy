import grails.web.context.ServletContextHolder as SCH

/**
 Job to trigger the execution of customer specific reports, delivered by email
 */
class ExampleJob {

    static triggers = {
        simple name: 'ExampleJobTrigger', startDelay: 1 * 60000, repeatInterval: 60000
    }

    static group = "Reporting"
    static concurrent = false //be on the safe side

    def execute() {
        println "*" * 200
        println "SCH.servletContext = ${SCH.servletContext}"
        println "*" * 200
    }
}
