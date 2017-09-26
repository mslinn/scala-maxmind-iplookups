val vcs = "github.com"

// bintray settings
bintrayOrganization := Some("micronautics")
bintrayRepository := "scala"
bintrayVcsUrl := Some(s"git@$vcs:mslinn/${ name.value }.git")

// sbt-site settings
enablePlugins(SiteScaladocPlugin)
siteSourceDirectory := target.value / "api"
publishSite

// sbt-ghpages settings
enablePlugins(GhpagesPlugin)
git.remoteRepo := s"git@$vcs:mslinn/${ name.value }.git"
