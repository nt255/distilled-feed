package controllers

import scala.collection.JavaConversions

import javax.inject._
import play.api._
import play.api.mvc._

import utils.TestUtil

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject() extends Controller {
    
    
  def main = Action {
    //val posts = List("linkOne", "linkTwo", "linkThree")
    val posts = JavaConversions.asScalaBuffer(TestUtil.generateList()).toList
    Ok(views.html.main(posts))
  }
    

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def example = Action {
    Ok(views.html.example("Your new application is ready."))
  }

}
