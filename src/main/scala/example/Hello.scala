package example

import scalaz.effect.IO
import scalaz.effect.IO.putStrLn

object Hello extends Greeting with App {

  def greeting: String = "hello"

  val printHello: IO[Unit] = putStrLn(greeting)

  printHello.unsafePerformIO
}

trait Greeting {
  def greeting: String
}

