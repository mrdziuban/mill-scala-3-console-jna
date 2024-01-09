import mill._, scalalib._

object example extends RootModule with ScalaModule {
  def scalaVersion = "3.3.1"
  def ivyDeps = Agg(
    ivy"org.mariadb.jdbc:mariadb-java-client:3.3.2"
  )
}
