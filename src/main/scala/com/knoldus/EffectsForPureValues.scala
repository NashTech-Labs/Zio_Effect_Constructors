package com.knoldus

import zio.{ExitCode, Task, UIO, URIO, ZIO}

import scala.util.Try

object EffectsForPureValues extends zio.App {

  val zSuccess: ZIO[Any, Nothing, String] = ZIO.succeed("Hello, ZIO")

  val zFailure: ZIO[Any, String, Nothing] = ZIO.fail("This will fail with an exception.")

  val zEither: ZIO[Any, Nothing, String] = ZIO.fromEither(Right("This is successful"))

  val zOptionSome: ZIO[Any, Option[Nothing], Int] = ZIO.fromOption(Some(29))

  val zOptionNone: ZIO[Any, Option[Nothing], Int] = ZIO.fromOption(None)

  val zTry: Task[Int] = ZIO.fromTry(Try(23/1))


  override def run(args: List[String]): URIO[zio.ZEnv, ExitCode] = {
    (for {
      value <- zSuccess
      _ <- zio.console.putStrLn(value)
    } yield ()).exitCode
  }

  /**
   * TO run each of the effects we need to provide them in the for comprehension one by one.
   * Effects like zSuccess, zEither, zOptionSome, zTry in this case will result in a value
   * on the console whereas zFailure, zOptionNone will result in exception.
   */
}
