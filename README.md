# Mill + Scala 3 console issue with JNA dependency

This reproduces an issue with Mill and the Scala 3 console when depending on
[JNA](https://github.com/java-native-access/jna).

To reproduce the issue:

1. Clone this repo
2. `cd` into it
3. Run `./mill -i console` -- you'll see a `>....` prompt instead of the typical `scala>` prompt
4. Hit enter (you might need to hit it twice) -- you'll see an error like the one below

![bad-address-error](https://github.com/mrdziuban/mill-scala-3-console-mariadb/assets/4718399/166af286-4ba0-4c91-961f-eeb0864385e5)
