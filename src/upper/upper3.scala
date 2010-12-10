/**
 * Created by Jeff Stokes.
 * Date: 12/8/10
 * Time: 11:07 PM
 */

object Upper {
 def main(args: Array[String]) = {
   args.map(_.toUpperCase()).foreach(printf("%s ", _))
   println("")
 }
}