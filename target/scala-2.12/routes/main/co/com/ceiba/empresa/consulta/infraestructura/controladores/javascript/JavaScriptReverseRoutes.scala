// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/yeidy.vergara/Desktop/CAPACITACIONES/PLAYFRAMEWORK/testempresa/conf/routes
// @DATE:Thu May 30 16:54:27 COT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:10
package co.com.ceiba.empresa.consulta.infraestructura.controladores.javascript {

  // @LINE:10
  class ReverseControladorListarEmpresa(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def consultarEmpresa: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "co.com.ceiba.empresa.consulta.infraestructura.controladores.ControladorListarEmpresa.consultarEmpresa",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "consultarEmpresa"})
        }
      """
    )
  
    // @LINE:11
    def consultarPorIdentificacionEmpresa: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "co.com.ceiba.empresa.consulta.infraestructura.controladores.ControladorListarEmpresa.consultarPorIdentificacionEmpresa",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "consultarPorIdentificacionEmpresa/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }


}
