// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/yeidy.vergara/Desktop/CAPACITACIONES/PLAYFRAMEWORK/testempresa/conf/routes
// @DATE:Thu May 30 16:54:27 COT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:10
package co.com.ceiba.empresa.consulta.infraestructura.controladores {

  // @LINE:10
  class ReverseControladorListarEmpresa(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def consultarEmpresa(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "consultarEmpresa")
    }
  
    // @LINE:11
    def consultarPorIdentificacionEmpresa(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "consultarPorIdentificacionEmpresa/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }


}
