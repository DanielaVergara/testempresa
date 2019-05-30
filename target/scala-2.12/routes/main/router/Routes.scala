// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/yeidy.vergara/Desktop/CAPACITACIONES/PLAYFRAMEWORK/testempresa/conf/routes
// @DATE:Thu May 30 16:54:27 COT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  ControladorCrearEmpresa_1: co.com.ceiba.empresa.comando.infraestructura.controladores.ControladorCrearEmpresa,
  // @LINE:10
  ControladorListarEmpresa_0: co.com.ceiba.empresa.consulta.infraestructura.controladores.ControladorListarEmpresa,
  // @LINE:15
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    ControladorCrearEmpresa_1: co.com.ceiba.empresa.comando.infraestructura.controladores.ControladorCrearEmpresa,
    // @LINE:10
    ControladorListarEmpresa_0: co.com.ceiba.empresa.consulta.infraestructura.controladores.ControladorListarEmpresa,
    // @LINE:15
    Assets_2: controllers.Assets
  ) = this(errorHandler, ControladorCrearEmpresa_1, ControladorListarEmpresa_0, Assets_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ControladorCrearEmpresa_1, ControladorListarEmpresa_0, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """crearEmpresa""", """co.com.ceiba.empresa.comando.infraestructura.controladores.ControladorCrearEmpresa.crearEmpresa"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """consultarCreacionEmpresa""", """co.com.ceiba.empresa.comando.infraestructura.controladores.ControladorCrearEmpresa.consultarEmpresa"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """consultarEmpresa""", """co.com.ceiba.empresa.consulta.infraestructura.controladores.ControladorListarEmpresa.consultarEmpresa"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """consultarPorIdentificacionEmpresa/""" + "$" + """id<[^/]+>""", """co.com.ceiba.empresa.consulta.infraestructura.controladores.ControladorListarEmpresa.consultarPorIdentificacionEmpresa(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val co_com_ceiba_empresa_comando_infraestructura_controladores_ControladorCrearEmpresa_crearEmpresa0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("crearEmpresa")))
  )
  private[this] lazy val co_com_ceiba_empresa_comando_infraestructura_controladores_ControladorCrearEmpresa_crearEmpresa0_invoker = createInvoker(
    ControladorCrearEmpresa_1.crearEmpresa,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "co.com.ceiba.empresa.comando.infraestructura.controladores.ControladorCrearEmpresa",
      "crearEmpresa",
      Nil,
      "POST",
      this.prefix + """crearEmpresa""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val co_com_ceiba_empresa_comando_infraestructura_controladores_ControladorCrearEmpresa_consultarEmpresa1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("consultarCreacionEmpresa")))
  )
  private[this] lazy val co_com_ceiba_empresa_comando_infraestructura_controladores_ControladorCrearEmpresa_consultarEmpresa1_invoker = createInvoker(
    ControladorCrearEmpresa_1.consultarEmpresa,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "co.com.ceiba.empresa.comando.infraestructura.controladores.ControladorCrearEmpresa",
      "consultarEmpresa",
      Nil,
      "GET",
      this.prefix + """consultarCreacionEmpresa""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val co_com_ceiba_empresa_consulta_infraestructura_controladores_ControladorListarEmpresa_consultarEmpresa2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("consultarEmpresa")))
  )
  private[this] lazy val co_com_ceiba_empresa_consulta_infraestructura_controladores_ControladorListarEmpresa_consultarEmpresa2_invoker = createInvoker(
    ControladorListarEmpresa_0.consultarEmpresa,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "co.com.ceiba.empresa.consulta.infraestructura.controladores.ControladorListarEmpresa",
      "consultarEmpresa",
      Nil,
      "GET",
      this.prefix + """consultarEmpresa""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val co_com_ceiba_empresa_consulta_infraestructura_controladores_ControladorListarEmpresa_consultarPorIdentificacionEmpresa3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("consultarPorIdentificacionEmpresa/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val co_com_ceiba_empresa_consulta_infraestructura_controladores_ControladorListarEmpresa_consultarPorIdentificacionEmpresa3_invoker = createInvoker(
    ControladorListarEmpresa_0.consultarPorIdentificacionEmpresa(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "co.com.ceiba.empresa.consulta.infraestructura.controladores.ControladorListarEmpresa",
      "consultarPorIdentificacionEmpresa",
      Seq(classOf[String]),
      "GET",
      this.prefix + """consultarPorIdentificacionEmpresa/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case co_com_ceiba_empresa_comando_infraestructura_controladores_ControladorCrearEmpresa_crearEmpresa0_route(params@_) =>
      call { 
        co_com_ceiba_empresa_comando_infraestructura_controladores_ControladorCrearEmpresa_crearEmpresa0_invoker.call(ControladorCrearEmpresa_1.crearEmpresa)
      }
  
    // @LINE:8
    case co_com_ceiba_empresa_comando_infraestructura_controladores_ControladorCrearEmpresa_consultarEmpresa1_route(params@_) =>
      call { 
        co_com_ceiba_empresa_comando_infraestructura_controladores_ControladorCrearEmpresa_consultarEmpresa1_invoker.call(ControladorCrearEmpresa_1.consultarEmpresa)
      }
  
    // @LINE:10
    case co_com_ceiba_empresa_consulta_infraestructura_controladores_ControladorListarEmpresa_consultarEmpresa2_route(params@_) =>
      call { 
        co_com_ceiba_empresa_consulta_infraestructura_controladores_ControladorListarEmpresa_consultarEmpresa2_invoker.call(ControladorListarEmpresa_0.consultarEmpresa)
      }
  
    // @LINE:11
    case co_com_ceiba_empresa_consulta_infraestructura_controladores_ControladorListarEmpresa_consultarPorIdentificacionEmpresa3_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        co_com_ceiba_empresa_consulta_infraestructura_controladores_ControladorListarEmpresa_consultarPorIdentificacionEmpresa3_invoker.call(ControladorListarEmpresa_0.consultarPorIdentificacionEmpresa(id))
      }
  
    // @LINE:15
    case controllers_Assets_versioned4_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
