package whats_wrong

import akka.actor.{ Actor, ActorSystem, Props }

/*
When receiving a message that says "Hello", BasicActor must print "Hello there."
It must print "What?" when receiving any other message
*/

class BasicActor {}

object FireActor {

/*  Create an instance of BasicActor
  Make it print "Hello there." and "What?"*/
  def fireActor(): Unit = {
    //    val system = ActorSystem("Actor System")
    //    val basic_actor = system.actorOf(Props[BasicActor], name = "basic actor")
  }
}
