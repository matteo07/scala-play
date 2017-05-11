package controllers

import javax.inject.{Inject, Singleton}

import models.Product
import play.api.libs.json.Json
import play.api.mvc.{Action, Controller}

/**
  * Created by mrdema on 5/11/17.
  */
@Singleton
class ApiController  @Inject() extends Controller{
  def api = Action{
    val productCodes = Product.findAll.map(_.ean)
    Ok(Json.toJson(productCodes))
  }
}
