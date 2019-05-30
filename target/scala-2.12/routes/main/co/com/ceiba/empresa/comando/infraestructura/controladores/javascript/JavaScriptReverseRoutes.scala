// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/yeidy.vergara/Desktop/CAPACITACIONES/PLAYFRAMEWORK/testempresa/conf/routes
// @DATE:Thu May 30 16:54:27 COT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package co.com.ceiba.empresa.comando.infraestructura.controladores.javascript {

  // @LINE:7
  class ReverseControladorCrearEmpresa(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def consultarEmpresa: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "co.com.ceiba.empresa.comando.infraestructura.controladores.ControladorCrearEmpresa.consultarEmpresa",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "consultarCreacionEmpresa"})
        }
      """
    )
  
    // @LINE:7
    def crearEmpresa: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "co.com.ceiba.empresa.comando.infraestructura.controladores.ControladorCrearEmpresa.crearEmpresa",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "crearEmpresa"})
        }
      """
    )
  
  }


}
