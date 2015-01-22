class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
       // "/"(view:"/index")
		"/"(controller:"login",action:"/index") //Added by Asma for startup with Login Screen
        "500"(view:'/error')
	}
}
