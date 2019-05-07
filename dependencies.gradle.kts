// declare all version
object BuildVersion {
    const val GRADLE = "3.4.0"
}

object LayoutVersion {
    const val CONSTRAINT = "1.1.3"
}

// one version
val constraint : String? by extra("1.1.3")
// multiple version
val versions by extra(
    hashMapOf(
        "gradle" to BuildVersion.GRADLE,
        "constraint" to LayoutVersion.CONSTRAINT
    )
)