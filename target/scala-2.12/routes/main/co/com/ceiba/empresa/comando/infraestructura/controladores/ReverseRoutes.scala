// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/yeidy.vergara/Desktop/CAPACITACIONES/PLAYFRAMEWORK/testempresa/conf/routes
// @DATE:Thu May 30 16:54:27 COT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package co.com.ceiba.empresa.comando.infraestructura.controladores {

  // @LINE:7
  class ReverseControladorCrearEmpresa(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def consultarEmpresa(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "consultarCreacionEmpresa")
    }
  
    // @LINE:7
    def crearEmpresa(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "crearEmpresa")
    }
  
  }


}
