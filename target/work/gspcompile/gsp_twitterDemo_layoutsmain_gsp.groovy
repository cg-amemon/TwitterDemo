import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_twitterDemo_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',3,['default':("Grails")],-1)
})
invokeTag('captureTitle','sitemesh',3,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',3,[:],2)
printHtmlPart(2)
expressionOut.print(resource(dir:'css',file:'main.css'))
printHtmlPart(3)
expressionOut.print(resource(dir:'css',file:'grailstwitter.css'))
printHtmlPart(4)
expressionOut.print(resource(dir:'images',file:'favicon.ico'))
printHtmlPart(5)
invokeTag('layoutHead','g',7,[:],-1)
printHtmlPart(1)
invokeTag('javascript','g',8,['library':("application")],-1)
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(6)
createTagBody(1, {->
printHtmlPart(7)
expressionOut.print(resource(dir:'images',file:'spinner.gif'))
printHtmlPart(8)
expressionOut.print(resource(dir:'images',file:'grails_logo.png'))
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
invokeTag('username','sec',18,[:],-1)
printHtmlPart(11)
createClosureForHtmlPart(12, 3)
invokeTag('link','g',18,['controller':("logout")],3)
printHtmlPart(13)
})
invokeTag('ifLoggedIn','sec',19,[:],2)
printHtmlPart(14)
invokeTag('layoutBody','g',20,[:],-1)
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',23,[:],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1421064637216L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
