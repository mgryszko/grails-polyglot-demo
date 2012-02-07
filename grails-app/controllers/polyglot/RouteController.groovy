package polyglot


class RouteController {
    static defaultAction = 'index'

    def routeFinderService
    
    def index = {
        render view: 'show', model: [cities: routeFinderService.allCities]
    }
    
    def route = {
        def route = routeFinderService.findRouteBetween(params.start, params.dest)
        render view: 'show', model: [cities: routeFinderService.allCities, route: route]
    }
}
