package polyglot


class RouteFinder {
  def findRouteBetween(start: String, dest: String) = {
    val route = n(start) shortestPathTo n(dest)
    route.get.nodes
  }

  private def n(node: String) = Network.plan.get(node)
}

