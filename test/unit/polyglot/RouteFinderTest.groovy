package polyglot

import org.junit.Test

class RouteFinderTest {
    @Test
    void 'finds the route between two cities'() {
        def routeFinder = new RouteFinder()
        def route = routeFinder.findRouteBetween("Zurich", "Mannheim")

        assert route.head() == 'Zurich'
        assert route.last() == 'Mannheim'
        assert route.length() > 2
    }
}
