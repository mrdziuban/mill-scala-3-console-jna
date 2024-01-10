import mill._, scalalib._

object example extends RootModule with ScalaModule {
  def scalaVersion = "3.3.1"
  def ivyDeps = Agg(
    ivy"net.java.dev.jna:jna:5.13.0",
  )
}
