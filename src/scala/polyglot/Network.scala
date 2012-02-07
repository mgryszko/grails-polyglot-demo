package polyglot

import scalax.collection.Graph
import scalax.collection.GraphPredef._


object Network {
  val basel = "Basel"
  val zurich = "Zurich"
  val freiburg = "Freiburg"
  val carlsruhe = "Carlsruhe"
  val mannheim = "Mannheim"
  val sigmaringen = "Sigmaringen"
  val ulm = "Ulm"
  val stuttgart = "Stuttgart"
  val kempten = "Kempten"
  val augsburg = "Augsburg"
  val ingolstadt = "Ingolstadt"
  val nurnberg = "Nurnberg"
  val wurzburg = "Wurzburg"
  val regensburg = "Regensburg"
  val munchen = "Munchen"
  val passau = "Passau"
  val innsbruck = "Innsbruck"
  val salzburg = "Salzburg"
  val linz = "Linz"
  val budweis = "Budweis"
  val pilsen = "Pilsen"
  val lodz = "Lodz"

  val plan = Graph(
    basel ~ freiburg,
    zurich ~ basel,
    zurich ~ freiburg,
    zurich ~ sigmaringen,
    zurich ~ kempten,
    freiburg ~ sigmaringen,
    freiburg ~ carlsruhe,
    carlsruhe ~ mannheim,
    carlsruhe ~ stuttgart,
    mannheim ~ wurzburg,
    mannheim ~ stuttgart,
    sigmaringen ~ stuttgart,
    sigmaringen ~ ulm,
    sigmaringen ~ kempten,
    ulm ~ kempten,
    ulm ~ stuttgart,
    ulm ~ ingolstadt,
    ulm ~ augsburg,
    stuttgart ~ wurzburg,
    stuttgart ~ nurnberg,
    stuttgart ~ ingolstadt,
    kempten ~ augsburg,
    kempten ~ innsbruck,
    augsburg ~ ingolstadt,
    augsburg ~ munchen,
    augsburg ~ innsbruck,
    ingolstadt ~ nurnberg,
    ingolstadt ~ regensburg,
    ingolstadt ~ munchen,
    nurnberg ~ wurzburg,
    nurnberg ~ regensburg,
    nurnberg ~ pilsen,
    munchen ~ regensburg,
    munchen ~ passau,
    munchen ~ innsbruck,
    munchen ~ salzburg,
    passau ~ salzburg,
    passau ~ linz,
    passau ~ regensburg,
    regensburg ~ pilsen,
    innsbruck ~ salzburg,
    salzburg ~ linz,
    linz ~ budweis,
    budweis ~ pilsen,
    pilsen ~ lodz
  )
}

