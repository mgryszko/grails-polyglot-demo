package polyglot

import scala.Function1

class RouteFinderService {
    RouteFinder routeFinder

    def findRouteBetween(start, dest) {
        def scalaRoute = routeFinder.findRouteBetween(start, dest)
        convertToGroovyList scalaRoute
    }

    def getAllCities() {
        convertToGroovyList Network.plan().nodes()
    }

    private convertToGroovyList(scalaList) {
        def groovyList = []
        scalaList.foreach([apply: {groovyList << it}] as Function1)
        groovyList
    }
}
