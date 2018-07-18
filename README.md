kts-nested-android
===============

Simple project to demonstrate issue with kotlin-android-extensions and KTS scripting file.

Tested with Android Studio 3.2 beta4 and Gradle 4.9.

Gradle configuration created based on [kotlin-dsl/samples/hello-android](https://github.com/gradle/kotlin-dsl/tree/master/samples/hello-android)

Just run following:
```bash
./gradlew nested:assemble
```
to see that build is failing with error:
```
e: kts-nested-android/nested/core-lib/src/main/java/com/kts/android/test/corelib/LibActivity.kt: (5, 8): Unresolved reference: kotlinx
e: kts-nested-android/nested/core-lib/src/main/java/com/kts/android/test/corelib/LibActivity.kt: (12, 9): Unresolved reference: myTestTextView
> Task :nested:core-lib:compileDebugKotlin FAILED

FAILURE: Build failed with an exception.

```