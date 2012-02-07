package polyglot

import org.junit.Test

class RouteFinderServiceTest {
    RouteFinderService routeFinderService

    @Test
    void 'finds the route between two cities'() {
        def route = routeFinderService.findRouteBetween("Zurich", "Mannheim")
        assert route.first() == 'Zurich'
        assert route.last() == 'Mannheim'
        assert route.size() > 2
    }

    @Test
    void 'lists the connection network'() {
        assert routeFinderService.allCities
    }
}
