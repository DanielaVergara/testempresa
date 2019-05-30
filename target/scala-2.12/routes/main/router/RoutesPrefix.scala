// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/yeidy.vergara/Desktop/CAPACITACIONES/PLAYFRAMEWORK/testempresa/conf/routes
// @DATE:Thu May 30 16:54:27 COT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
