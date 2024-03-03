plugins {
    id("itbookstore.feature")
}

android {
    namespace = "com.itbookstore.search"
}

dependencies {
    implementation(projects.core.ui)
    implementation(projects.core.domain)
    implementation(projects.resource)
    implementation(projects.feature.navigation)
    implementation(projects.core.data)
}