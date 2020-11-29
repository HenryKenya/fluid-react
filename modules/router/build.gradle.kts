import io.fluidsonic.gradle.*
import org.jetbrains.kotlin.gradle.plugin.*

fluidLibraryModule(description = "FIXME") {
	publishSingleTargetAsModule()

	targets {
		js(KotlinJsCompilerType.IR) {
			dependencies {
				api(project(":"))

				api(npm("react-router", "~5.2.0"))
			}
		}
	}
}
