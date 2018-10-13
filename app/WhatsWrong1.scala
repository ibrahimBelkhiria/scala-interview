package whats_wrong

object WhatsWrong1 {

  trait Interface {
    val city: String
    val support: String = s"Ici c'est $city !"
  }

  case object Supporter extends Interface {

    override val city = "Paris"
    // add this line to avoid the null 
    override val support: String = s"Ici c'est $city !"
  }

  Supporter.city //this prints:  Paris
  Supporter.support // this prints Ici c'est null , we can fix it by  overriding the support !
}
