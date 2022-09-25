# ZIO Effect Constructors
This Tech hub includes Zio Effect Constructors for Pure values and Side Effects.


# ZIO
- ZIO is a new concurrent programming library which uses Scala programming language capabilities to help us design efficient, resilient, and concurrent applications that are simple to understand, test and do not leak resources, cause deadlock, or cause errors. 

- ZIO is a next-generation framework for building cloud-native applications on the JVM, with a beginner-friendly yet powerful functional core.

- ZIO library is purely functional, and showcases the power of pure functional programming to solve modern business problems.

# Zio Effects

A functional effect is a template for a concurrent workflow. The template which is mostly descriptive in nature, used to test for any side effects. Such as database interaction, logging, data streaming across the network, or request approval.

We can convert any procedural program into ZIO by wrapping each statement in a constructor such as ZIO.effect and then binding the statements together with flatMap or for comprehensions.

## ZIO effects constructors for Pure Values

- `ZIO.succeed`
- `ZIO.fail`
- `ZIO.fromEither`
- `ZIO.fromOption`
- `ZIO.fromTry`

## ZIO effects constructors for Side effects

- `ZIO.effect`
- `ZIO.effectTotal`
- `ZIO.effectAsync`
