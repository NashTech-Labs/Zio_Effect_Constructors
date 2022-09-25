package com.knoldus
import zio.{ExitCode, Task, UIO, URIO, ZIO}

object EffectsForSideEffects extends zio.App {

  val zEffect: Task[Unit] = ZIO.effect(println("Learning ZIO !!"))

  val zEffectTotal: UIO[Unit] = ZIO.effectTotal(println("This will return unit"))

  val systemNanoTime: UIO[Long] = ZIO.effectTotal(System.nanoTime())


  override def run(args: List[String]): URIO[zio.ZEnv, ExitCode] = {
    (for {
      value <- systemNanoTime
      _ <- zio.console.putStrLn(value.toString)
    } yield ()).exitCode
  }

  /**
   * TO run each of the effects we need to provide them in the for comprehension one by one.
   */

}
